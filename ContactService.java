/*
 * Title:	ContactService.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/10/2021
 */

package main;

import java.util.HashMap;

public class ContactService {
	
	private HashMap<String, Contact> contacts;
	
	public ContactService() {
		contacts = new HashMap<>();
	}
	
	// add contacts
	public void addContact(Contact contact) {
		contacts.put(contact.getContactId(), contact);
	}
	
	// delete contacts
	public void deleteContact(String contactId) {
		contacts.remove(contactId);
	}
	
	// update contacts
	public void updateContact(String contactId, String fName, String lName, String phoneNum, String address) {
		Contact update = contacts.get(contactId);
		update.setFirstName(fName);
		update.setLastName(lName);
		update.setPhoneNum(phoneNum);
		update.setAddress(address);
	}
	
	public HashMap<String, Contact> getContacts() {
		return contacts;
	}
}
