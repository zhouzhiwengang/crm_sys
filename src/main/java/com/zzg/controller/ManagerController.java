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
import com.zzg.entity.Manager;
import com.zzg.service.ManagerService;

@RestController
@RequestMapping("/api/manager")
public class ManagerController extends AbstractController<Manager> {
	@Autowired
	private ManagerService managerService;

	// 增
	@RequestMapping(value = "/insert", method = { RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public Object insert(@RequestBody Manager manager) {
		return managerService.save(manager);
	}

	// 改
	@RequestMapping(value = "/update", method = { RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public Object update(@RequestBody Manager manager) {
		return managerService.updateById(manager);
	}

	// 删
	@RequestMapping(value = "/delete/{id}", method = { RequestMethod.DELETE })
	public Object delete(@PathVariable("id") String managerid) {
		return managerService.removeById(managerid);
	}

	// 查
	@RequestMapping(value = "/getId", method = { RequestMethod.GET })
	public Object getId(@RequestParam String managerid) {
		return managerService.getById(managerid);
	}

	// 查
	@RequestMapping(value = "/getPage", method = { RequestMethod.POST })
	public Object getPage(@RequestBody Map<String, Object> parame) {
		Page<Manager> page = this.initPageBounds(parame);
		return managerService.page(page);
	}

}
