package com.zzg.common.controller;

import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzg.util.converter.SimpleTypeConverterUtil;



public abstract class AbstractController<T> {
	public static final String PAGE = "page";
	
	public static final String LIMIT = "limit";
	
	/**
	 * 参数分页参数转换校验
	 * 
	 * @param param
	 * @return
	 */
	protected Page<T> initPageBounds(Map<String, Object> param) {
		int page = SimpleTypeConverterUtil.convertIfNecessary(param.get(PAGE), int.class);
		int limit = SimpleTypeConverterUtil.convertIfNecessary(param.get(LIMIT), int.class);
		// 页码和页数取消最大限制
		page = (page <= 0) ? 1 : page;
		limit = (limit <= 0) ? 10 : limit;
		return new Page<T>(page, limit);
	}
}
