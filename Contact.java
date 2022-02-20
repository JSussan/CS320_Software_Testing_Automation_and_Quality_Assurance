/*
 * Title:	Contact.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/10/2021
 */

package main;

public class Contact {
	// member variables
	private final String contactId;
	private String fName;
	private String lName;
	private String phoneNum;
	private String address;
	
	// constructors
	public Contact(String contactId, String fName, String lName, String phoneNum, String address) {
		
		// validate constructors
		if (contactId == null || contactId.length() < 1 || contactId.length() > 10) {
			throw new IllegalArgumentException("Error, please enter a valid contact ID.");
		}
		if (fName == null || fName.length() < 1 || fName.length() > 10) {
			throw new IllegalArgumentException("Error, please enter a valid first name.");
		}
		if (lName == null || lName.length() < 1 || lName.length() > 10) {
			throw new IllegalArgumentException("Error, please enter a valid last name.");
		}
		if (phoneNum == null || phoneNum.length() != 10) {
			throw new IllegalArgumentException("Error, please enter a valid phone number.");
		}
		if (address == null || address.length() < 1 || address.length() > 30) {
			throw new IllegalArgumentException("Error, please enter a valid address.");
		}
		
		this.contactId = contactId;
		this.fName = fName;
		this.lName = lName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	// accessors
	public String getContactId() 				{ return contactId; }	
	public String getFirstName() 				{ return fName; }	
	public String getLastName()  				{ return lName; }	
	public String getPhoneNum() 				{ return phoneNum; }	
	public String getAddress() 					{ return address; }
	
	// mutators
	public void setFirstName(String fName) 		{ this.fName = fName; }
	public void setLastName(String lName) 		{ this.lName = lName; }
	public void setPhoneNum(String phoneNum) 	{ this.phoneNum = phoneNum; }
	public void setAddress(String address) 		{ this.address = address; }

}
