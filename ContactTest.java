/*
 * Title:	ContactTest.java
 * Author:	Jonathan Sussan
 * Class:	SNHU CS 320
 * Date:	11/10/2021
 */

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import main.Contact;

class ContactTest {

	// test contact id, 3 tests
	@Test
	void testContactId() {
		Contact contact = new Contact("801312", "Peter", "Parker", "8185551313", "Queens, New York");
		assertTrue(contact.getContactId().equals("801312"));
		assertTrue(contact.getFirstName().equals("Peter"));
		assertTrue(contact.getLastName().equals("Parker"));
		assertTrue(contact.getPhoneNum().equals("8185551313"));
		assertTrue(contact.getAddress().equals("Queens, New York"));
	}
	
	@Test
	void testContactIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312801312", "Peter", "Parker", "8185551313", "Queens, New York");
		});
	}
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Peter", "Parker", "8185551313", "Queens, New York");
		});
	}
	
	// test first name, 2 tests
	@Test
	void testFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312", "Peter is Spiderman", "Parker", "8185551313", "Queens, New York");
		});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312", null, "Parker", "8185551313", "Queens, New York");
		});
	}
	
	// test last name, 2 tests
	@Test
	void testLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312", "Peter", "Parker is Spiderman", "8185551313", "Queens, New York");
		});
	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312", "Peter", null, "8185551313", "Queens, New York");
		});
	}
	
	// test phone number, 4 tests
	@Test
	void testPhoneNumLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312", "Peter", "Parker", "818555131313", "Queens, New York");
		});
	}
	
	@Test
	void testPhoneNumShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312", "Peter", "Parker", "81855513", "Queens, New York");
		});
	}
	
	@Test
	void testPhoneNumNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312", "Peter", "Parker", null, "Queens, New York");
		});
	}
	
	@Test
	void testPhoneNumDigits() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312", "Peter", "Parker", "818555131z", "Queens, New York");
		});
	}
	
	// test address, 2 tests
	@Test
	void testAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312", "Peter", "Parker", "8185551313", "Queens, New York in the United States of America");
		});
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("801312", "Peter", "Parker", "8185551313", null);
		});
	}
}
