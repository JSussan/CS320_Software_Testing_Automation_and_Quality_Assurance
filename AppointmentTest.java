/*
 * Title:	AppointmentTest.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/22/2021
 */

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import appointment.Appointment;

import org.junit.jupiter.api.Assertions;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

class AppointmentTest {

	@Test
	void testAppointmentClass() {
		Date today = new Date();
		Appointment appointment = new Appointment("801312", today, "Spiderman is booked");
		assertTrue(appointment.getApptId().equals("801312"));
		assertTrue(appointment.getApptDate().equals(today));
		assertTrue(appointment.getInfo().equals("Spiderman is booked"));
	}
	
	// test appointment id, 2 tests
	@Test
	void testApptIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("801312801312", new Date(), "Spiderman is booked");
		});
	}
	
	@Test
	void testApptIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, new Date(), "Spiderman is booked");
		});
	}
	
	// test date, 2 tests
	@Test
	void testDatePast() throws ParseException {
		Date pastDate = new SimpleDateFormat("MMM D, YYYY").parse("November 22, 2020");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("801312", pastDate, "Spiderman is booked");
		});
	}
	
	@Test
	void testDateNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("801312", null, "Spiderman is booked");
		});
	}
	
	// test info, 2 tests
	@Test
	void testInfoLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("801312", new Date(), "Parker is Spiderman information cannot be longer than 50 characters.");
		});
	}
	
	@Test
	void testInfoNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("801312", new Date(), null);
		});
	}
}
