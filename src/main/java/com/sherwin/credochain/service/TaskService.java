package com.sherwin.credochain.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherwin.credochain.model.Task;
import com.sherwin.credochain.repo.RepositoryTask;

@Service
public class TaskService {
	
	@Autowired
	private RepositoryTask repo;
	
	public Task createTask(Task task) {
		return this.repo.save(task);
	}
	
	public Set<Task> getAllTask() {
		return new HashSet<>(this.repo.findAll());
	}
}
