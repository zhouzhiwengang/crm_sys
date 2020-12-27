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
import com.zzg.entity.Room;
import com.zzg.entity.Worker;
import com.zzg.service.WorkerService;

@RestController
@RequestMapping("/api/worker")
public class WorkerController extends AbstractController<Worker> {
	@Autowired
	private WorkerService workerService;
	
	// 增
		@RequestMapping(value = "/insert", method = { RequestMethod.POST }, produces = "application/json;charset=UTF-8")
		public Object insert(@RequestBody Worker worker) {
			return workerService.save(worker);
		}

		// 改
		@RequestMapping(value = "/update", method = { RequestMethod.POST }, produces = "application/json;charset=UTF-8")
		public Object update(@RequestBody Worker worker) {
			return workerService.updateById(worker);
		}

		// 删
		@RequestMapping(value = "/delete/{id}", method = { RequestMethod.DELETE })
		public Object delete(@PathVariable("id") String workerid) {
			return workerService.removeById(workerid);
		}

		// 查
		@RequestMapping(value = "/getId", method = { RequestMethod.GET })
		public Object getId(@RequestParam String workerid) {
			return workerService.getById(workerid);
		}

		// 查
		@RequestMapping(value = "/getPage", method = { RequestMethod.POST })
		public Object getPage(@RequestBody Map<String, Object> parame) {
			Page<Worker> page = this.initPageBounds(parame);
			return workerService.page(page);
		}
}
