package main;

import java.util.ArrayList;

public class ContactService {
    private ArrayList<Contact> contacts;
    public ContactService() {
        contacts= new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(String id){
        for (Contact contact:contacts){
            if(contact.getContactID().equalsIgnoreCase(id))
                return contact;
        }
        return null;
    }

    public void addContact(Contact c){
        for(Contact contact:contacts){
            if(contact.getContactID().equalsIgnoreCase(c.getContactID()))
                return;
        }
        contacts.add(c);
    }

    public boolean deleteContact(String id){
        for(Contact contact:contacts){
            if(contact.getContactID().equalsIgnoreCase(id)){
                contacts.remove(contact);
                return true;
            }
        }
        return false;
    }

    public boolean updateLastName(String id,String newLastName){
        for(Contact contact:contacts){
            if(contact.getContactID().equalsIgnoreCase(id)){
                contact.setLastName(newLastName);
                return true;
            }
        }
        return false;
    }

    public boolean updateAddress(String id,String newAddress){
        for(Contact contact:contacts){
            if(contact.getContactID().equalsIgnoreCase(id)){
                contact.setAddress(newAddress);
                return true;
            }
        }
        return false;
    }
    public boolean updateNumber(String id,String newNumber){
        for(Contact contact:contacts){
            if(contact.getContactID().equalsIgnoreCase(id)){
                contact.setPhoneNum(newNumber);
                return true;
            }
        }
        return false;
    }
    public boolean updateFirstName(String id,String newFirstName){
        for(Contact contact:contacts){
            if(contact.getContactID().equalsIgnoreCase(id)){
                contact.setFirstName(newFirstName);
                return true;
            }
        }
        return false;
    }
}
