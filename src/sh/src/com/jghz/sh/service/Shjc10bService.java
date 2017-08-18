package com.jghz.sh.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc10Dao;
import com.jghz.sh.dao.Shjc10a1Dao;
import com.jghz.sh.dao.Shjc10aDao;
import com.jghz.sh.dao.Shjc10bDao;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbsh10a1;
import com.jghz.sh.entity.Tbsh10b;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc10bService  
* 类描述：  
* 创建人：Tom  
* 创建时间：10b26-10-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：10b26-10-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc10bService {
	
	@Resource
	private Shjc10bDao shjc10bDao;
	@Resource
	private Shjc10Dao shjc10Dao;
	@Resource
	private Shjc10a1Dao shjc10a1Dao;
	@Resource
	private Shjc10aDao shjc10aDao;

	/**  
	* loadSh10b 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：10b26-10-29 下午2:17:25 
	* 修改时间：10b26-10-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh10b(Page<Tbsh10b> page, Map<String, Object> paramater)
			throws Exception {
		shjc10bDao.pagingQuery(page, paramater);
	}
	
	@DataProvider
	public void loadSh10bByTransNo(Page<Tbsh10b> page, Criteria criteria)
			throws Exception {
		shjc10bDao.loadSh10bByTransNo(page, criteria);
	}
	
	
	@DataResolver
	public Properties save(Collection<Tbsh10b> sh10bs){
		Properties prop = new Properties();
		boolean flag = true;
		List sh10a1List_insert = new ArrayList();
		List sh10a1List_update = new ArrayList();
		int count = 0;
		String transItem ="";
		try {
			for(Tbsh10b sh10b : sh10bs){
				//TODO 第一步：新增车载明细。一车上会对应不同订单的不同装车单
				Tbsh10a1 sh10a1 = new Tbsh10a1();
				String transNo = sh10b.getTransNo();
				String loadingNoNg = sh10b.getLoadingNoNg();
				String carNo = sh10b.getCarNo();
				BigDecimal num = sh10b.getNum();
				BigDecimal weight = sh10b.getWeight();
				//=============
				Tbsh10 sh10 = shjc10Dao.queryByTransNo(transNo);
				AppUtils.copyProperties(sh10, sh10a1);
				AppUtils.copyProperties(sh10b, sh10a1);
				//初始化
				if(count==0){
					Tbsh10a sh10a = new Tbsh10a();
					transItem = shjc10aDao.genTransItem(transNo);
					//组车载明细的List。判断是否已有登记车号，如果有则update
					AppUtils.copyProperties(sh10, sh10a);
					sh10a.setCarNo(carNo);
					sh10a.setNumber(num);
					sh10a.setWeight(weight);
					sh10a.setLoadingNoNg(loadingNoNg);
					sh10a.setDeliverStatus("1");
					sh10a.setTransItem(transItem);
					sh10a.setSh10aId(AppUtils.generateUniqueKey());
					sh10a.setCompId(AppUtils.getCompId());
					sh10a.setCreateDate(new Date());
					sh10a.setCreateEmp(AppUtils.getUserName());
					shjc10aDao.save(sh10a);
				//判断其他的
				}else{
					//如果一样。修改重量
					String sh10aQry = " from Tbsh10a where compId='"+AppUtils.getCompId()+"' and loadingNoNg ='"+loadingNoNg+"' ";
					List sh10aList = shjc10aDao.query(sh10aQry);
					if(!CollectionUtils.isEmpty(sh10aList)){
						Tbsh10a sh10a_tmp =(Tbsh10a)sh10aList.get(0);
						BigDecimal num_tmp = AppUtils.getBigDecimal(sh10a_tmp.getNumber());
						BigDecimal weight_tmp = AppUtils.getBigDecimal(sh10a_tmp.getWeight());
						num_tmp = num_tmp.add(num);
						weight_tmp = weight_tmp.add(weight);
						sh10a_tmp.setNumber(num_tmp);
						sh10a_tmp.setWeight(weight_tmp);
						shjc10aDao.update(sh10a_tmp);
					}//如果不一样
					else{
						Tbsh10a sh10a = new Tbsh10a();
						transItem = shjc10aDao.genTransItem(transNo);
						//组车载明细的List。判断是否已有登记车号，如果有则update
						AppUtils.copyProperties(sh10, sh10a);
						sh10a.setCarNo(carNo);
						sh10a.setNumber(num);
						sh10a.setWeight(weight);
						sh10a.setLoadingNoNg(loadingNoNg);
						sh10a.setDeliverStatus("1");
						sh10a.setTransItem(transItem);
						sh10a.setSh10aId(AppUtils.generateUniqueKey());
						sh10a.setCompId(AppUtils.getCompId());
						sh10a.setCreateDate(new Date());
						sh10a.setCreateEmp(AppUtils.getUserName());
						shjc10aDao.save(sh10a);
					}
				}
				sh10b.setTransItem(transItem);
				//新增货物明细。标记为已挑选。
				shjc10bDao.update(sh10b);
				//=============
				//组车载明细的List。判断是否已有登记车号，如果有则update
				String sh10a1Qry = " from Tbsh10a1 where compId='"+AppUtils.getCompId()+"' and loadingNoNg = '"+loadingNoNg+"' ";
				List sh10a1List = shjc10a1Dao.query(sh10a1Qry);
				if(!CollectionUtils.isEmpty(sh10a1List)){
					for (int j=0;j<sh10a1List.size();j++){
						Tbsh10a1 sh10a1_tmp =(Tbsh10a1) sh10a1List.get(j);
						String loadingNoNg_tmp=sh10a1_tmp.getLoadingNoNg();
						String heigtStr = AppUtils.toValidString(sh10b.getHeight());
						String widthStr = AppUtils.toValidString(sh10b.getWidth());
						String lengthStr = AppUtils.toValidString(sh10b.getLength());
						String spec = heigtStr +"*" +widthStr+"*"+lengthStr;
						if(loadingNoNg.equals(loadingNoNg_tmp)){
							sh10a1.setTransItem(sh10a1_tmp.getTransItem());
							sh10a1.setSh10a1Id(sh10a1_tmp.getSh10a1Id());
							sh10a1.setUpdateDate(new Date());
							sh10a1.setUpdateEmp(AppUtils.getUserName());
							sh10a1.setSpec(spec);
							shjc10a1Dao.update(sh10a1);
							sh10a1List_update.add(sh10a1);
						} 
					}
				}else{
					String heigtStr = AppUtils.toValidString(sh10a1.getHeight());
					String widthStr = AppUtils.toValidString(sh10a1.getWidth());
					String lengthStr = AppUtils.toValidString(sh10a1.getLength());
					String spec = heigtStr +"*" +widthStr+"*"+lengthStr;
					sh10a1.setSpec(spec);
					sh10a1.setTransItem(transItem);
					sh10a1.setSh10a1Id(AppUtils.generateUniqueKey());
					sh10a1.setCompCode(AppUtils.getCompId());
					sh10a1.setCreateDate(new Date());
					sh10a1.setCreateEmp(AppUtils.getUserName());
					shjc10a1Dao.save(sh10a1);
					sh10a1List_insert.add(sh10a1);
				}
				//TODO 第二步：新增TBSH10A。将TBSH10A1中相同车号的重量和件数加起来
			
				count++;
			}
//			shjc10a1Dao.batchTransaction(sh10a1List_insert, sh10a1List_update, null);
//			shjc10aDao.batchTransaction(sh10aList_insert, sh10aList_update, null);
		} catch (Exception e) {
			// TODO: handle exception
		}
		prop.put("msg", "挑选成功");
		prop.put("flag", flag);
		return prop;
	}
	
}
