package test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Contact;
import main.ContactService;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {
	private static ContactService contactService;
	
	@BeforeEach
	void setUpContactService() {
		contactService = new ContactService();
		contactService.addContact(new Contact("1234567","Joe","Rogan","221B Bakers Street","090078601"));
	}

    @Test
    void updateFirstName(){

        Contact c = new Contact("1234567","Joe","Rogan","221B Bakers Street","090078601");
        ContactService cs = new ContactService();
        cs.addContact(new Contact("1234567","Joe","Roland","221B Bakers Street","090078601"));
        cs.updateLastName("1234567","Rogan");
        Assert.assertEquals(c.getLastName(),cs.getContact("1234567").getLastName());
    }
    
    @Test
    void addContactFailsTest() {
    	contactService.addContact(new Contact("1234567","Test","Rogan","221B Bakers Street","090078601"));
    	Assertions.assertFalse(contactService.getContact("1234567").getFirstName().equals("Test"));

    };
    
    @Test
    void deleteContactSucceedsTest() {
    	Assertions.assertTrue(contactService.deleteContact("1234567"));
    }
    
    @Test
    void updateAddress() {
    	contactService.updateAddress("1234567", "new Address");
    	Assertions.assertEquals(contactService.getContact("1234567").getAddress(), "new Address");
    }
}