package Application;

public class Contact {
	private static String contactID; // Non-updatable variable
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	
	//Constructor
	public Contact(String contactID, String firstName, String lastName, String Number, String Address) {
	{
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Contact ID Null or Too Long");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First Name Null or Too Long");
	}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last Name Null or Too Long");
	}
		if(Number == null || Number.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
	}
		if(Address == null || Address.length() > 30) {
			throw new IllegalArgumentException("Home Address too Long");
	}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Number = Number;
		this.Address = Address;
	}

}
	
	//Getters
	public static String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getNumber() {
		return Number;
	}
	public String getAddress() {
		return Address;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		if (firstName != null && firstName.length() <= 10) {
			this.firstName = firstName;
		}
		else {
			throw new IllegalArgumentException ("Invalid First Name");
		}
	}
	
	public void setLastName (String lastName) {
		if (lastName != null && lastName.length() <= 10) {
			this.lastName = lastName;
		}
		else {
			throw new IllegalArgumentException ("Invalid Last Name");
		}
	}
	
	public void setNumber (String Number) {
		if (Number != null && Number.length() != 10) {
			this.Number = Number;
		}
		else {
			throw new IllegalArgumentException ("Invalid Phone Number");
		}
	}
	public void setAddress (String Address) {
		if (Address != null && Address.length() >= 30) {
			this.Address = Address;
		}
		else {
			throw new IllegalArgumentException ("Invalid Address");
		}
	}

	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
}
