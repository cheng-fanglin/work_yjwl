package com.jghz.sh.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.domain.Tbupload;

@Repository("uploadDao")
public class UploadDao extends BaseDao{

	/**
	 * 
	 * 方法描述：      保存附件信息到数据库
	 * 创建人：          lichangyu   
	 * 创建时间：       2014-12-3 下午5:19:00
	 * @param:  
	 * @return: boolean
	 *
	 * 修改人：            
	 * 修改时间：        2014-12-3 下午5:19:00   
	 * 修改备注：         
	 * @version  
	 *
	 */
	public boolean saveFile(Tbupload upload){
		return this.save(upload);
	}
	
	
	/**
	 * 
	 * 方法描述：      根据附件id串，获取附件列表
	 * 创建人：          lichangyu   
	 * 创建时间：       2014-12-3 下午5:25:58
	 * @param:  
	 * @return: List<Tbupload>
	 *
	 * 修改人：            
	 * 修改时间：        2014-12-3 下午5:25:58   
	 * 修改备注：         
	 * @version  
	 *
	 */
	public List<Tbupload> getUploadList(String ids){
		String hql = "from Tbupload u where u.id in("+ids+")";
		return (List<Tbupload>) this.getListByHQL(hql);
	}
	public Tbupload getUploadById(Long id){
		String hql = "from Tbupload u where u.id = "+id;
		return   (Tbupload) this.getOneResultByHQL(hql);
	}
	
	/**
	 * 
	 * 方法描述：      根据附件id串，获取附件列表
	 * 创建人：          lichangyu   
	 * 创建时间：       2014-12-3 下午5:25:58
	 * @param:  
	 * @return: List<Tbupload>
	 *
	 * 修改人：            
	 * 修改时间：        2014-12-3 下午5:25:58   
	 * 修改备注：         
	 * @version  
	 *
	 */
	public List<Tbupload> getUploadListByUserId(Long userId){
		String hql = "from Tbupload u where u.userId ="+userId;
		return (List<Tbupload>) this.getListByHQL(hql);
	}
	
	/**
	 * 方法描述：      根据ID删除upload记录
	 * 创建人：          xuJie   
	 * 创建时间：       2014-12-10 下午5:25:58
	 * @param: id Long  
	 * 修改人：            
	 * 修改时间：        2014-12-10下午5:25:58   
	 * 修改备注：         
	 * @version  
	 */
	public boolean delUploadById(Long id) {
		String sql = "delete from base_sys_upload u where u.id =?" + id;
		List<Long> params = new ArrayList<Long>();
		params.add(id);
		return this.deleteBySQL(sql, params);
	}
	
	/**
	 * 方法描述：根据id串查询图片个数
	 * @param ids 传过来的id串
	 * @return
	 */
	public int countUploadPicByIds(String ids){
		String sql = "select count(id) from base_sys_upload u where u.id in (" + ids + ")" ;
		return this.getCountsBySQL(sql, null) ;
	}
}

