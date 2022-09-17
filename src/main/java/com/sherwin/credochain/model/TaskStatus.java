package com.sherwin.credochain.model;

import java.util.Date;

public class TaskStatus {
	private Date created;
	
	private boolean pending;
	
	private boolean inProgress;
	
	private boolean done;

	public TaskStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaskStatus(Date created, boolean pending, boolean inProgress, boolean done) {
		super();
		this.created = created;
		this.pending = pending;
		this.inProgress = inProgress;
		this.done = done;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public boolean isPending() {
		return pending;
	}

	public void setPending(boolean pending) {
		this.pending = pending;
	}

	public boolean isInProgress() {
		return inProgress;
	}

	public void setInProgress(boolean inProgress) {
		this.inProgress = inProgress;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	
}
