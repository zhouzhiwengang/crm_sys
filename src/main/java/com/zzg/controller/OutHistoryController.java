package com.zzg.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzg.common.controller.AbstractController;
import com.zzg.entity.OutHistory;
import com.zzg.service.OutHistoryService;

@RestController
@RequestMapping("/api/outhistory")
public class OutHistoryController extends AbstractController<OutHistory> {
	@Autowired
	private OutHistoryService outHistoryService;

	// 增
	@RequestMapping(value = "/insert", method = { RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public Object insert(@RequestBody OutHistory outHistory) {
		return outHistoryService.save(outHistory);
	}

	// 改
	@RequestMapping(value = "/update", method = { RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public Object update(@RequestBody OutHistory outHistory) {
		return outHistoryService.updateById(outHistory);
	}

	// 删
	@RequestMapping(value = "/delete/{id}", method = { RequestMethod.DELETE })
	public Object delete(@PathVariable("id") String outid) {
		return outHistoryService.removeById(outid);
	}

	// 查
	@RequestMapping(value = "/getId", method = { RequestMethod.GET })
	public Object getId(@RequestParam String outid) {
		return outHistoryService.getById(outid);
	}

	// 查
	@RequestMapping(value = "/getPage", method = { RequestMethod.POST })
	public Object getPage(@RequestBody Map<String, Object> parame) {
		Page<OutHistory> page = this.initPageBounds(parame);
		return outHistoryService.page(page);
	}

}
