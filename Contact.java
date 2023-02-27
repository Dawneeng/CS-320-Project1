package main;

public class Contact {

	private String contactID;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNum;

public Contact() {
	
}
public Contact(String contactID, String firstName, String lastName, String address, String phoneNum) {
	if(contactID == null || contactID.length() > 10) { 
	   throw new IllegalArgumentException("Invalid ID");
	   }
	
	if(firstName == null || firstName.length() > 10) { 
	   throw new IllegalArgumentException("Invalid First Name");
	   }
	 
	 if(lastName == null || lastName.length() > 10) { 
	   throw new IllegalArgumentException("Invalid Last Name");
	   }
	  
	 if(address == null || address.length() > 30) {
	   throw new IllegalArgumentException("Invalid Address");
	   }
	 
	 if(phoneNum == null || phoneNum.length() > 10) { 
	   throw new IllegalArgumentException("Invalid Phone #");
	   }
	 
	   this.contactID = contactID;
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.address = address;
	   this.phoneNum = phoneNum;
	 }
public String getFirstName() {
	return firstName;
	 }

public void setFirstName (String firstName) {
	this.firstName = firstName;
	  if(firstName == null || firstName.length() > 10) { 
	   throw new IllegalArgumentException("Invalid First Name");
	  }
	 }

public String getLastName () {
	return lastName;
	 }
public void setLastName (String lastName) {
	this.lastName = lastName;
	  if(lastName == null || lastName.length() > 10) { 
	   throw new IllegalArgumentException("Invalid Last Name");
	  }
	  
	}
public String getAddress() {
	return address;
	 }

public void setAddress(String address) {
	this.address = address;
	  if(address == null || address.length() > 30) {
	   throw new IllegalArgumentException("Invalid Address");
	  }
	 }

public String getPhoneNum () {
	return phoneNum;
	 }

public void setPhoneNum (String phoneNum) {
	this.phoneNum = phoneNum;
	  if(phoneNum == null || phoneNum.length() > 10) { 
	   throw new IllegalArgumentException("Invalid Phone #");
	  }
	 }

public String getContactID ( ) {
	return contactID;
	 }
}

