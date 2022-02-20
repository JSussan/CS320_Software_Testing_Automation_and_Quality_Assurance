/*
 * Title:	AppointmentServiceTest.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/22/2021
 */

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

import appointment.Appointment;
import appointment.AppointmentService;

class AppointmentServiceTest {

	// test task and task service object
	@Test
	void testAppointmentService() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment appointment = new Appointment("801312", new Date(), "Spiderman is booked");
		assertFalse(appointmentService == null);
		assertFalse(appointment == null);
	}
	
	// test adding an appointment
	@Test
	void testAppointmentAdd() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment appointment = new Appointment("801312", new Date(), "Spiderman is booked");
		appointmentService.addAppt(appointment);
		assertTrue(appointmentService.getAppts().containsValue(appointment));
	}
	
	// test deleting a task
	@Test
	void testAppointmentDelete() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment temp = new Appointment("901312", new Date(), "Spiderman is booked");
		appointmentService.addAppt(temp);
		appointmentService.deleteAppt("901312");
		assertFalse(appointmentService.getAppts().containsValue(temp));
	}
	
	// test updating a task
	@Test
	void testAppointmentUpdate() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment temp = new Appointment("801312", new Date(), "Spiderman is booked");
		appointmentService.addAppt(temp);
		assertTrue(appointmentService.getAppts().containsValue(temp));
		assertTrue(temp.getInfo().equals("Spiderman is booked"));
		appointmentService.updateAppt("801312", new Date(), "Batman is booked");
		assertTrue(appointmentService.getAppts().containsValue(temp));
		assertFalse(temp.getInfo().equals("Spiderman is booked"));
	}
}
