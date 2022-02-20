/*
 * Title:	Appointment.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/22/2021
 */

package appointment;

import java.util.Date;

public class Appointment {
	// member variables
	private final String apptId;
	private Date apptDate;
	private String info;
	
	// constructors
	public Appointment (String apptId, Date apptDate, String info) {
		// validate constructors
		// appointment id may not be null or have more than 10 characters
		if (apptId == null || apptId.length() > 10) {
			throw new IllegalArgumentException("Error, please enter a valid appointment ID.");
		}
		// appointment date may not be null or be in the past
		if (apptDate == null || apptDate.before(new Date())) {
			throw new IllegalArgumentException("Error, please enter a valid appointment date.");
		}
		// info may not be null or have more than 50 characters
		if (info == null || info.length() > 50) {
			throw new IllegalArgumentException("Error, please enter valid information.");
		}
		
		this.apptId = apptId;
		this.apptDate = apptDate;
		this.info = info;
	}
	
	// accessors
	public String getApptId()			{ return apptId; }
	public Date getApptDate()			{ return apptDate; }
	public String getInfo()				{ return info; }
	
	// mutators
	public void setApptDate(Date newApptDate)		{ apptDate = newApptDate; }
	public void setInfo(String newInfo)				{ info = newInfo; }
	
}
