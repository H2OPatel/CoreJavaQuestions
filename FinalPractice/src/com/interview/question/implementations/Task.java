package com.interview.question.implementations;

public class Task {
	public String job;
	public int priority;

	@Override
	public String toString() {
		return "Task [job=" + job + ", priority=" + priority + "]";
	}

	public Task(String job, int priority) {

		this.job = job;
		this.priority = priority;
	}

}
