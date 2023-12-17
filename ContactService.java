package Application;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	
private final Map<String, Contact> contactList = new HashMap<>();
	
public void addContact(Contact contact) {
	if (contact == null || contactList.containsKey(Contact.getContactID())) {
		throw new IllegalArgumentException("Contact Already Exsists or Invalid Entry");
		}
		contactList.put(Contact.getContactID(), contact);
	}

	public void deleteContact (String contactID) {
		contactList.remove(contactID);
	}

	public void updateContact(String contactID, String firstName, String lastName, String Number, String Address) {
		Contact contact = contactList.get(contactID);
		if (contact == null) {
			throw new IllegalArgumentException ("Contact Not Found");
		}
		
		if (firstName != null) contact.setFirstName(firstName);
		if (lastName != null) contact.setLastName(lastName);
		if (Number != null) contact.setNumber(Number);
		if (Address != null) contact.setAddress(Address);
	}
	}

