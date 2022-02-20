/*
 * Title:	ContactServiceTest.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/10/2021
 */

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Contact;
import main.ContactService;

class ContactServiceTest {

	// test contact service object
	@Test
	void testContactService() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("801312", "Peter", "Parker", "8185551313", "Queens, New York");
		assertFalse(contactService == null);
		assertFalse(contact == null);
	}
	
	// test adding a contact
	@Test
	void testContactAdd() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("801312", "Peter", "Parker", "8185551313", "Queens, New York");
		contactService.addContact(contact);;
		assertTrue(contactService.getContacts().containsValue(contact));
	}
	
	// test deleting a contact
	@Test
	void testContactDelete() {
		ContactService contactService = new ContactService();
		Contact temp = new Contact("801312", "Peter", "Parker", "8185551313", "Queens, New York");
		contactService.addContact(temp);
		assertTrue(contactService.getContacts().containsValue(temp));
		contactService.deleteContact("801312");
		assertFalse(contactService.getContacts().containsValue(temp));
	}
	
	// test updating a contact
	@Test
	void testContactUpdate() {
		ContactService contactService = new ContactService();
		Contact temp = new Contact("801312", "Peter", "Parker", "8185551313", "Queens, New York");
		contactService.addContact(temp);
		assertTrue(contactService.getContacts().containsValue(temp));
		assertTrue(temp.getFirstName().equals("Peter"));
		contactService.updateContact("801312", "Bruce", "Wayne", "8055551313", "Gotham City");
		assertTrue(contactService.getContacts().containsValue(temp));
		assertFalse(temp.getFirstName().equals("Peter"));
	}
}
