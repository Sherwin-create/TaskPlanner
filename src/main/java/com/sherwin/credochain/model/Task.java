package com.sherwin.credochain.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Task {
	@Id
	private int taskId;
	private String title;
	private String description;
	private String assignedTo;
	private String completedOn;
	private String Status;
	
	public Task(int taskId, String title, String description, String assignedTo, String completedOn, String status) {
		super();
		this.taskId = taskId;
		this.title = title;
		this.description = description;
		this.assignedTo = assignedTo;
		this.completedOn = completedOn;
		Status = status;
	}
	
	public Task() {
		super();
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getCompletedOn() {
		return completedOn;
	}

	public void setCompletedOn(String completedOn) {
		this.completedOn = completedOn;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
}
