/*
 * Title:	Task.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/17/2021
 */

package task;

public class Task {
	// member variables
	private final String taskId;
	private String name;
	private String info;
	
	// constructors
	public Task (String taskId, String name, String info) {
		// validate constructors
		// task id may not be null or have more than 10 characters
		if (taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Error, please enter a valid task ID.");
		}
		// name may not be null or have more than 20 characters
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Error, please enter a valid name.");
		}
		// info may not be null or have more than 50 characters
		if (info == null || info.length() > 50) {
			throw new IllegalArgumentException("Error, please enter valid information.");
		}
		
		this.taskId = taskId;
		this.name = name;
		this.info = info;
	}
	
	// accessors
	public String getTaskId()		{ return taskId; }
	public String getName()			{ return name; }
	public String getInfo()			{ return info; }
	
	// mutators
	public void setName(String newName)		{ name = newName; }
	public void setInfo(String newInfo)		{ info = newInfo; }
	
}
