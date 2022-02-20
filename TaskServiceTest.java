/*
 * Title:	TaskServiceTest.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/17/2021
 */

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import task.Task;
import task.TaskService;

class TaskServiceTest {

	// test task and task service object
	@Test
	void testTaskService() {
		TaskService taskService = new TaskService();
		Task task = new Task("801312", "Peter", "Is Spiderman");
		assertFalse(taskService == null);
		assertFalse(task == null);
	}
	
	// test adding a task
	@Test
	void testTaskAdd() {
		TaskService taskService = new TaskService();
		Task task = new Task("901312", "Peter", "Is Spiderman");
		taskService.addTask(task);;
		assertTrue(taskService.getTasks().containsValue(task));
	}
	
	// test deleting a task
	@Test
	void testTaskDelete() {
		TaskService taskService = new TaskService();
		Task temp = new Task("901312", "Peter", "Is Spiderman");
		taskService.addTask(temp);
		assertTrue(taskService.getTasks().containsValue(temp));
		taskService.deleteTask("901312");
		assertFalse(taskService.getTasks().containsValue(temp));
	}
	
	// test updating a task
	@Test
	void testTaskUpdate() {
		TaskService taskService = new TaskService();
		Task temp = new Task("801312", "Peter", "Is Spiderman");
		taskService.addTask(temp);
		assertTrue(taskService.getTasks().containsValue(temp));
		assertTrue(temp.getName().equals("Peter"));
		taskService.updateTask("801312", "Bruce", "Is Batman");
		assertTrue(taskService.getTasks().containsValue(temp));
		assertFalse(temp.getName().equals("Peter"));
	}
}
