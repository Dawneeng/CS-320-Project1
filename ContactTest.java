package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest {
	
	private static Contact contact;
	
	@BeforeEach
	void resetContact() {
		contact = new Contact();
	}

	@Test
	void testContactID() {
		Contact contactID = new Contact("0987654321","Joe","Graham","address","893483424");
		Assertions.assertTrue(contactID.getContactID().equals("0987654321"));
		Assertions.assertTrue(contactID.getAddress().equals("address"));
		Assertions.assertTrue(contactID.getFirstName().equals("Joe"));
		
		
		
		assertThrows(IllegalArgumentException.class, () -> {
		new Contact("09876543231","Joe","Graham","address","893483424");
		}); 
	}
	
	@Test
	void testSetPhoneNum() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhoneNum("34242424580454");
		});
	}
	
	@Test
	void testSetAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress("3424242hljljkhjknljknjklnljnlkjnjjklnljk4580454");
		});
	}
	
	@Test
	void testSetFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName(";klfdjaskljdfsakljffjkalsd;jdilj;sak");
		});
	}
	
	@Test
	void testSetLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName(";klfdjaskljdfsakljffjkalsd;jdilj;sak");
		});
	}
}


