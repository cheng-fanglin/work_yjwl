package com.base.constant;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 
 * 该类存放系统常量
 * @author zc
 * 创建时间：2014-11-20 下午4:21:57
 */
public class SystemConstant {
	
	/**
	 * GPS定位频率，每隔10分钟定位一次
	 */
	public static final int LOCATION_COUNT = 10;
	
	/**
	 * 系统分页查询，每页显示记录数
	 */
	public static final int PAGESIZE = 15;
	
	/**
	 * 数据库记录操作日志的保留期限
	 */
	public static final int OVER_DUE_DAYS=30;
	
	/**文件下载的最大速度 为1000KB/S*/
	public static final Long DOWNLOADSPEED = 1000L;
	
	/**  允许承运人的最大偏离距离    */
	public static final Long DISTANCE = 20L;
	
	public static final String USERINFO = "userInfo";
	
	public static final String USERID = "userId";
	
	/**IVR参数存入session中的map变量名*/
	public static final String PARAMSMAP = "paramsMap";
	
	public static final Long  FORMID=1L;//平台
	
	/** 图片访问URL*/
	public static final String uploadPathOriginal; // 原始文件存储路径
	public static final String uploadPathCompress; // 压缩文件存储路径
	public static final int outputWidth; // 图片压缩后的宽度
	public static final int outputHeight; // 图片压缩后的高度
	public static final String originalUrl;// 原始图片访问URL
	public static final String compressUrl;// 压缩图片访问URL
	/**短信接口配置参数*/
	public static final String MSG_REQURL;
	public static final String MSG_USERNAME;
	public static final String MSG_SCODE;
	public static final String MSG_CODE_TEMPID;
	public static final String MSG_OTHERINFO_TEMPID;
	
	/**服务器访问根目录*/
	public static final String ROOT_REQURL;
	/**  文件下载后缀名  */
	public static final String DOWNLOAD;

	/** 权限访问白名单*/
	public static final List<String> AUTHOR_WHITE_PATHS = new ArrayList<String>();
	
	/** 获取远程访问IP*/
	public static final String securityRemoteIpHeadname;
	
	static Logger log = Logger.getLogger(SystemConstant.class);
	static{
		// 读取配置文件
		Properties properties = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = SystemConstant.class.getClassLoader().getResourceAsStream("com/conf/property/filePath.properties");
			properties.load(inputStream);  
		}catch (Exception e) {  
		    log.error(e.getMessage());  
		}finally {
			if(null != inputStream) {
				try {
					inputStream.close();
				} catch (IOException e) {
					log.error(e.getMessage());
				}
			}
		}

		uploadPathOriginal = properties.getProperty("uploadpath.original");
		uploadPathCompress = properties.getProperty("uploadpath.compress");
		
		String outputWidthStr = properties.getProperty("pic.output.width");
		String outputHeightStr = properties.getProperty("pic.output.height");
		
		if(null!=outputWidthStr && !"".equals(outputWidthStr)) {
			outputWidth = Integer.parseInt(outputWidthStr);
		}else {
			outputWidth = 400;
		}
		
		if(null!=outputHeightStr && !"".equals(outputHeightStr)) {
			outputHeight = Integer.parseInt(outputHeightStr);
		}else {
			outputHeight = 300;
		}
		
		originalUrl = properties.getProperty("uploadpath.original.url");
		compressUrl = properties.getProperty("uploadpath.compress.url");
		
		MSG_REQURL = properties.getProperty("msg.requrl");
		MSG_USERNAME = properties.getProperty("msg.username");
		MSG_SCODE = properties.getProperty("msg.scode");
		MSG_CODE_TEMPID = properties.getProperty("msg.code.tempid");
		MSG_OTHERINFO_TEMPID = properties.getProperty("msg.otherinfo.tempid");
		
		securityRemoteIpHeadname = properties.getProperty("security.remote.ip.headname");
		
		ROOT_REQURL = properties.getProperty("root.requrl");
		DOWNLOAD = ROOT_REQURL + "servlet/download";
		
		// 获取权限控制白名单
		for(int i=0;i<20;i++) {
			if(properties.containsKey("security.author.white.req"+i)) {
				String whitePathStr = properties.getProperty("security.author.white.req"+i);
				if(null!=whitePathStr && !"".equals(whitePathStr)) {
					String[] arr = whitePathStr.split(",");
					for(String path : arr) {
						AUTHOR_WHITE_PATHS.add(path);
					}
				}
			}else {
				break;
			}
		}
	}

}
