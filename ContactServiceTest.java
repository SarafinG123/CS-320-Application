package Application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	private ContactService service;

	@BeforeEach
	void testSetUp() {
		service = new ContactService();
	}
	
	@Test
	void createContact() {
		Contact contact = new Contact("0001", "Sarafina", "Garner", "7077129944", "9617 Magazine St");
		service.addContact(contact);
		assertNotNull(contact);
		
	}
	
	@Test
	void deleteContact() {
		Contact contact = new Contact("0001", "Sarafina", "Garner", "7077129944", "9617 Magazine St");
		service.addContact(contact);
		service.deleteContact("0001");
		assertDoesNotThrow(() -> service.deleteContact("0001"));
	}

}
