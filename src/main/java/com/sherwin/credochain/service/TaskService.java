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
	
	public Task updateTask(int taskId ,Task task) {
		Task dbTask = new Task();
		Task updatedTask = new Task();
		dbTask = repo.findById(taskId).get();
		if (repo.findById(taskId).isPresent()){
			updatedTask.setTaskId(taskId);
			if(task.getAssignedTo() == null) {
				updatedTask.setAssignedTo(dbTask.getAssignedTo());
			}
			else {
				updatedTask.setAssignedTo(task.getAssignedTo());
			}
			
			if(task.getCompletedOn() == null) {
				updatedTask.setCompletedOn(dbTask.getCompletedOn());
			}
			else {
				updatedTask.setCompletedOn(task.getCompletedOn());
			}
			
			if(task.getDescription() == null) {
				updatedTask.setDescription(dbTask.getDescription());
			}
			else {
				updatedTask.setDescription(task.getDescription());
			}
			
			if(task.getStatus() == null) {
				updatedTask.setStatus(dbTask.getStatus());
			}
			else {
				updatedTask.setStatus(task.getStatus());
			}
			
			if(task.getTitle()== null) {
				updatedTask.setTitle(dbTask.getTitle());
			}
			else {
				updatedTask.setTitle(task.getTitle());
			}
			
			return this.repo.save(updatedTask);
		}
		else {
			return null;
		}
	}
	
	public Task assignTask(int taskId, Task task) {
		Task dbTask = new Task();
		Task updatedTask = new Task();
		dbTask = repo.findById(taskId).get();
		if (repo.findById(taskId).isPresent()){
			updatedTask.setTaskId(taskId);
			if(task.getAssignedTo() == null) {
				updatedTask.setAssignedTo(dbTask.getAssignedTo());
			}
			else {
				updatedTask.setAssignedTo(task.getAssignedTo());
			}
			
			if(task.getCompletedOn() == null) {
				updatedTask.setCompletedOn(dbTask.getCompletedOn());
			}
			else {
				updatedTask.setCompletedOn(task.getCompletedOn());
			}
			
			if(task.getDescription() == null) {
				updatedTask.setDescription(dbTask.getDescription());
			}
			else {
				updatedTask.setDescription(task.getDescription());
			}
			
			if(task.getStatus() == null) {
				updatedTask.setStatus(dbTask.getStatus());
			}
			else {
				updatedTask.setStatus(task.getStatus());
			}
			
			if(task.getTitle()== null) {
				updatedTask.setTitle(dbTask.getTitle());
			}
			else {
				updatedTask.setTitle(task.getTitle());
			}
			
			return this.repo.save(updatedTask);
		}
		else {
			return null;
		}
	}
	
	public Set<Task> getAllTask() {
		return new HashSet<>(this.repo.findAll());
	}

//	public Task searchTask(int taskId, String title) {
//		// TODO Auto-generated method stub
//		return this.repo.findByIdAndTitle(taskId,title);
//	}

}
