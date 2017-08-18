package com.jghz.sh.service;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.base.constant.SequenceConstant;
import com.base.constant.SystemConstant;
import com.base.domain.Tbupload;
import com.base.util.AppUtils;
import com.base.util.DateUtil;
import com.base.util.NumberUtils;
import com.base.util.ValidatorUtil;
import com.bstek.dorado.uploader.UploadFile;
import com.bstek.dorado.uploader.annotation.FileResolver;

import com.jghz.sh.dao.UploadDao;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

@Component
public class UploadProcessor {
	private static final long FILE_MAX_SIZE = 1024 * 1024 * 10;
	private Logger logger = Logger.getLogger(UploadProcessor.class);
	
	@Autowired
	public  HttpServletRequest request;
//	@Autowired(required=true)
//	public  HttpServletResponse response; 
	
	@Resource(name="uploadDao")
	private UploadDao uploadDao;
	
    @FileResolver
    public Properties  process(UploadFile file, Map<String, Object> parameter) {
//    	Object sy;
//    	if(parameter!=null){
//    		sy=parameter.get("vvvvv");
//    	}
    	Properties result=new Properties();
		if(null!=file && file.getSize()>0) {
			// 校验扩展名
			if (null == file
					|| !ValidatorUtil.checkPicFormat(file.getFileName())) {
				result.put("success", "-1");
				result.put("msg", "文件格式错误，上传失败！");//此处中文传递到前台出现乱码
				return result;
			}
			// 判断文件大小
			if (file.getSize() > FILE_MAX_SIZE) {
				result.put("success", "-1");
				result.put("msg", "文件大小不得超过10M，上传失败！");
				return result;
			}
						
			Tbupload uploadFile;
			try {
				
				uploadFile = uploadFile(request,file);
				if(null==uploadFile) {
					result.put("success", "-1");
					result.put("msg", "文件上传失败！");
				}else {
					result.put("success", "0");
					result.put("msg", "文件上传成功！");
					result.put("fileId", uploadFile.getId().toString());
					result.put("filePath",uploadFile.getFilePath());
				}
			} catch (Exception e) {
				logger.error("method:uploadFile", e);
				result.put("success", "-1");
				result.put("msg", "文件格式错误，上传失败！");
			}
			
		}else {
			result.put("success", "-1");
			result.put("msg", "文件上传失败！");
		}
			
		return result;	
    }
    
    
    /**
     * @description
     * @param URI 请求的标记路径（前台定义）
     * @param userId  会员ID
     * @param file
     * @return
     * @throws Exception
     * @author wll 2016-1-12 下午4:37:49
     */
    public Tbupload uploadFile(HttpServletRequest request,UploadFile file) throws Exception{
		Tbupload upload = new Tbupload();//附件表
		String uploadTime = DateUtil.getToday("yyyyMMddHHmmssSSS") + NumberUtils.getRandom();//上传文件的时间
//		String shuiyin = request.getParameter("vvvvv");
//		boolean sy = true;
//		if(shuiyin!=null){
//			sy = false;
//		}
		boolean sy = false;//不需要水印
		if(file==null){
			logger.error("method:uploadFile, errorInfo: file is empty");
		}else{
			String URI = request.getRequestURI();//zczh/dorado/uploader/fileupload
//			String uri = URI.substring(URI.lastIndexOf("/")+1, URI.lastIndexOf("."));
			String uri = URI.substring(URI.lastIndexOf("/")+1);//d7传来的URI不带.html
			String fileName = file.getFileName();
			fileName = new String(fileName.getBytes(),"utf-8");
			String newFileName = uploadTime+fileName.substring(fileName.lastIndexOf("."));
			// 读取配置文件
//			Properties properties = new Properties();
//			InputStream inputStream = null;
//			try {
//				inputStream = SystemConstant.class.getClassLoader().getResourceAsStream("com/conf/property/filePath.properties");
//				properties.load(inputStream);  
//			}catch (Exception e) {  
//			    e.printStackTrace() ;
//			}finally {
//				if(null != inputStream) {
//					try {
//						inputStream.close();
//					} catch (IOException e) {
//						  e.printStackTrace() ;
//					}
//				}
//			}
//			String uploadPathOriginal = properties.getProperty("uploadpath.original"); //文件夹在服务器的位置
			String filePathSaveOriginal =SystemConstant.uploadPathOriginal+"/" + uri + "/" +newFileName; // 图片在服务器的路径 ：**original/fileupload/文件名
			String filePathSaveCompress = SystemConstant.uploadPathCompress+"/"+uri+"/"+newFileName;//压缩图片在服务器的路径：**upload/fileupload/文件名
			String filePath = "/"+uri+"/"+newFileName;
			try {
				upload.setFileName(newFileName);
				upload.setFilePath(filePath);
//				String id = uploadDao.getNextSequenceValue(SequenceConstant.SEQ_BASE_SYS_UPLOAD);
				upload.setId(AppUtils.generateUniqueKey());
				upload.setUploadTime(new Date());
				
				boolean isFlag = uploadDao.saveFile(upload);
				if(isFlag){
					saveFile(filePathSaveOriginal,file.getMultipartFile().getBytes());
					// 做图片压缩处理
					if(!compressPic(filePathSaveCompress,filePathSaveOriginal,sy)) {
						throw new Exception();
					}
				}else {
					return null;
				}
			} catch (IOException e) {
				logger.error("method:uploadFile Exception Ocurred",e);
				return null;
			}
		}
		
		return upload;
	}
    
    
    public static void saveFile(String filePath, byte[] content) throws IOException {
		BufferedOutputStream bos = null;
		try {
			File file = new File(filePath);
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
			file.createNewFile();
			bos = new BufferedOutputStream(new FileOutputStream(file));
			bos.write(content);
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		} finally {
			if (null != bos) {
				bos.close();
			}
		}
	}
	
	/**
	 * 图片压缩
	 * @param savePath
	 * @param originalPath 
	 */
	public boolean compressPic(String savePath,String originalPath,boolean sy) {
		try {
			String path = request.getSession().getServletContext().getRealPath("/")+"/";
			String waterImg= path+ "html_qt/images/shuiyin.png";
			File file = new File(originalPath);
			if(sy){
				Image image = ImageIO.read(file);
				int width = image.getWidth(null);
				int height = image.getHeight(null);
				double bili = 1;
				if(width<1000){ //放大
					bili = 1000.0/width;
					resize(originalPath, originalPath, (int)(height*bili), (int)(width*bili), true);
					shuiyinImage(originalPath, waterImg, waterImg, -1, -1, 1);
					resize(originalPath, originalPath, height, width, true);
				} 
				else if(width>1000){  //缩小
					bili = width/1000.0;
					
					resize(originalPath, originalPath, (int)(height/bili), (int)(width/bili), true);
					shuiyinImage(originalPath, waterImg, waterImg, -1, -1, 1);
					resize(originalPath, originalPath, height, width, true);
				} else {
					shuiyinImage(originalPath, waterImg, waterImg, -1, -1, 1);
				}
			}
			file = new File(savePath);
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
			Image img;
			img = ImageIO.read(new File(originalPath));
			// 判断图片格式是否正确
			if (img.getWidth(null) == -1) {  
				// 当图片文件不正确时不做处理
				// TODO打印日志
				return false;
			}else {
				int newWidth; 
				int newHeight;
				int oldWidth = img.getWidth(null);
				int oldHeight = img.getHeight(null);
                
                BufferedImage tag;
                if(oldWidth<SystemConstant.outputWidth || oldHeight<SystemConstant.outputHeight) {
                	tag = new BufferedImage(oldWidth, oldHeight, BufferedImage.TYPE_INT_RGB);
                	/* 
                	 * Image.SCALE_SMOOTH 的缩略算法 生成缩略图片的平滑度的 
                	 * 优先级比速度高 生成的图片质量比较好 但速度慢 
                	 */   
                	tag.getGraphics().drawImage(img.getScaledInstance(oldWidth, oldHeight, Image.SCALE_SMOOTH), 0, 0, null);  
//                	// 复制图片
//                	File ff = new File(originalPath);
//                	if(ff.exists()) {
//                		FileUtil.copyFile(ff, new File(savePath));
//                	}
                }else {
                	// 为等比缩放计算输出的图片宽度及高度   
                    double rate1 = ((double) oldWidth) / (double) SystemConstant.outputWidth + 0.1;   
                    double rate2 = ((double) oldHeight) / (double) SystemConstant.outputHeight + 0.1;   
                    // 根据缩放比率大的进行缩放控制
                    double rate = rate1 > rate2 ? rate1 : rate2;   
                    newWidth = (int) (((double) img.getWidth(null)) / rate);   
                    newHeight = (int) (((double) img.getHeight(null)) / rate);
                	tag = new BufferedImage((int) newWidth, (int) newHeight, BufferedImage.TYPE_INT_RGB);
                	
                	/* 
                	 * Image.SCALE_SMOOTH 的缩略算法 生成缩略图片的平滑度的 
                	 * 优先级比速度高 生成的图片质量比较好 但速度慢 
                	 */   
                	tag.getGraphics().drawImage(img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH), 0, 0, null);
                }
                
                FileOutputStream out = new FileOutputStream(savePath);
                // JPEGImageEncoder可适用于其他图片类型的转换   
                JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);   
                encoder.encode(tag);   
                out.close();
                return true;
			}
		} catch (IOException e) {
			logger.error("method:compressPic Exception Occured", e);
			return false;
		}
	}
	

	/**
	 * 添加图片水印
	 * @param targetImg 目标图片路径
	 * @param waterImg 水印图片路径
	 * @param logoInterimImage 临时的水印图片路径，当图片大小需要调整时使用这个图片
	 * @param alpha 透明度(0.0~1.0, 0F为完全透明，1F为完全不透明)
	 * @param x 横坐标，水印图片相对于原图的位置
	 * @param y 纵坐标，水印图片相对于原图的位置
	 */
	public final static void shuiyinImage(String targetImg, String logoImage, String logoInterimImage,
			int x, int y, float alpha) {
		try {
			File file = new File(targetImg);
			Image image = ImageIO.read(file);
			int width = image.getWidth(null);
			int height = image.getHeight(null);
			BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics2D g = bufferedImage.createGraphics();
			g.drawImage(image, 0, 0, width, height, null);
			// 开始水印图片工作
			Image waterImage = ImageIO.read(new File(logoImage)); // 水印文件
			int width_1 = waterImage.getWidth(null);
			int height_1 = waterImage.getHeight(null);
			waterImage = ImageIO.read(new File(logoInterimImage)); // 水印文件(换缩放后的图片)
			width_1 = waterImage.getWidth(null);
			height_1 = waterImage.getHeight(null);
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,alpha));
			x = width - width_1; //调整水印的位置
			y = height - height_1; //调整水印的位置
			g.drawImage(waterImage, x, y, width_1, height_1, null); // 水印文件结束
			g.dispose();
			ImageIO.write(bufferedImage, "png", file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * 图片缩放
	 * @param filePath 图片的路径
	 * @param height 高度
	 * @param width 宽度
	 * @param bb 比例不对时是否需要用空白填充
	 */
	public static void resize(String filePath, String savePath, int height, int width,
			boolean bb) {
		try {
			double ratio = 1; // 缩放比例
			File f = new File(filePath);
			BufferedImage bi = ImageIO.read(f);
			Image itemp = bi.getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH);
			// 计算比例
			if ((bi.getHeight() > height) || (bi.getWidth() > width)) {
				if (bi.getHeight() > bi.getWidth()) {
					ratio = (new Integer(height)).doubleValue()
							/ bi.getHeight();
				} else {
					ratio = (new Integer(width)).doubleValue() / bi.getWidth();
				}
				AffineTransformOp op = new AffineTransformOp(
						AffineTransform.getScaleInstance(ratio, ratio), null);
				itemp = op.filter(bi, null);
			}
			if (bb) {
				BufferedImage image = new BufferedImage(width, height,
						BufferedImage.TYPE_INT_RGB);
				Graphics2D g = image.createGraphics();
				g.setColor(Color.white);
				g.fillRect(0, 0, width, height);
				if (width == itemp.getWidth(null))
					g.drawImage(itemp, 0, (height - itemp.getHeight(null)) / 2,
							itemp.getWidth(null), itemp.getHeight(null),
							Color.white, null);
				else
					g.drawImage(itemp, (width - itemp.getWidth(null)) / 2, 0,
							itemp.getWidth(null), itemp.getHeight(null),
							Color.white, null);
				g.dispose();
				itemp = image;
			}
			ImageIO.write((BufferedImage) itemp, "png", new File(savePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}