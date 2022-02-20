/*
 * Title:	TaskService.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/17/2021
 */

package task;

import java.util.HashMap;

public class TaskService {
	
	private HashMap<String, Task> tasks;
	
	public TaskService() {
		tasks = new HashMap<>();
	}
	
	// add tasks
	public void addTask(Task uniqueId) {
		tasks.put(uniqueId.getTaskId(), uniqueId);
	}
	
	// delete tasks
	public void deleteTask(String taskId) {
		tasks.remove(taskId);
	}
	
	// update tasks
	public void updateTask(String taskId, String newName, String newInfo) {
		tasks.get(taskId).setName(newName);;
		tasks.get(taskId).setInfo(newInfo);;
	}
	
	public HashMap<String, Task> getTasks() {
		return tasks;
	}
}
