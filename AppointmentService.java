/*
 * Title:	AppointmentService.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/22/2021
 */

package appointment;

import java.util.Date;
import java.util.HashMap;

public class AppointmentService {
	
	private HashMap<String, Appointment> appts;
	
	public AppointmentService() {
		appts = new HashMap<>();
	}
	
	// add appointments
	public void addAppt(Appointment appt) {
		appts.put(appt.getApptId(), appt);
	}
	
	// delete appointments
	public void deleteAppt(String apptId) {
		appts.remove(apptId);
	}
	
	// update appointments
	public void updateAppt(String apptId, Date newApptDate, String newInfo) {
		appts.get(apptId).setApptDate(newApptDate);
		appts.get(apptId).setInfo(newInfo);
	}
	
	public HashMap<String, Appointment> getAppts() {
		return appts;
	}
}
