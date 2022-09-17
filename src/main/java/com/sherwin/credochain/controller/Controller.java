	package com.sherwin.credochain.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sherwin.credochain.model.Task;
import com.sherwin.credochain.service.TaskService;

@RestController
@RequestMapping("/task")
public class Controller {
	
	@Autowired
	private TaskService service;
	
	@PostMapping("/create")
	public Task createTask(@RequestBody Task task) {
		return this.service.createTask(task);
	}
	
	@GetMapping("/show")
	public ResponseEntity<?> getAllTask() {
		return ResponseEntity.ok(this.service.getAllTask());
	}
	
	@GetMapping("/test")
	public String test() {
		return "hello world";	
	}
	
	@PutMapping("/update/{taskId}")
	public Task updateTask(@PathVariable("taskId") int taskId,@RequestBody Task task) {
		return this.service.updateTask(taskId,task);
	}
	
	@PutMapping("/assign/{taskId}")
	public Task assignTask(@PathVariable("taskId") int taskId,@RequestBody Task task) {
		return this.service.assignTask(taskId, task);
	}
	
//	public Task searchTask(@PathVariable("taskID") int taskId,@PathVariable("title") String title) {
//		return this.service.searchTask(taskId, title);
//	}
}
