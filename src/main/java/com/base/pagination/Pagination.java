package com.base.pagination;

import java.util.List;

/**
 * 一个用来保存分页信息的普通类
 * @author jacky.gao
 * @create date 2011-3-29 上午10:35:58
 */
public class Pagination <T>{

	public final static int PAGESIZE = 30;

	private int pageSize = PAGESIZE;
	private int pageIndex=1;

	private List<T> results;

	private int totalCount;

	public Pagination(int pageIndex,int pageSize){
		this.pageIndex=pageIndex;
		this.pageSize=pageSize;
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

	public int getPageSize() {
		return pageSize;
	}
	
	public int getPageIndex() {
		return pageIndex;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount =totalCount;
	}

}
