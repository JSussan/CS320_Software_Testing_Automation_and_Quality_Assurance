/*
 * Title:	TaskTest.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/17/2021
 */

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import task.Task;

class TaskTest {

	@Test
	void testTaskClass() {
		Task task = new Task("801312", "Peter", "Is Spiderman");
		assertTrue(task.getTaskId().equals("801312"));
		assertTrue(task.getName().equals("Peter"));
		assertTrue(task.getInfo().equals("Is Spiderman"));
	}
	
	// test task id, 2 tests
	@Test
	void testTaskIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("801312801312", "Peter", "Is Spiderman");
		});
	}
	
	@Test
	void testTaskIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Peter", "Is Spiderman");
		});
	}
	
	// test name, 2 tests
	@Test
	void testNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("801312", "Peter is Spiderman is too long", "Is Spiderman");
		});
	}
	
	@Test
	void testNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("801312", null, "Is Spiderman");
		});
	}
	
	// test info, 2 tests
	@Test
	void testInfoLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("801312", "Peter", "Parker is Spiderman information cannot be longer than 50 characters.");
		});
	}
	
	@Test
	void testInfoNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("801312", "Peter", null);
		});
	}
}
