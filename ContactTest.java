package Application;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void createContact() {
		Contact contact = new Contact("0001", "Sarafina", "Garner", "7077129944", "9617 Magazine St");
		assertNotNull(contact);
	}
	
	@Test
	void nullIDTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Sarafina", "Garner", "7077129944", "9617 Magazine St");
		});
		assertTrue(exception.getMessage().contains("Contact ID Null or Too Long"));
		
	}
	
	@Test
	void invalidNumberTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0001", "Sarafina", "Garner", "1707712994114", "9617 Magazine St");
		});
		assertTrue(exception.getMessage().contains("Invalid Phone Number"));
	}

}
