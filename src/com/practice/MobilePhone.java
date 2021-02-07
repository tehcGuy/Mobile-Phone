package com.practice;

import java.util.ArrayList;

/*CrrayList object is in this class
we also have have Contact class here

idea:
we operate with the amount of contact by using the object of the class Contact

object contact has 2 fields. in methods I assign those fields according what class was passed
if i want create more contacts on the ArrayList, I need to initiate more objects

 */
public class MobilePhone {
    private ArrayList<Contact> myContacts; //Contacs in <> is like a data type of the ArrayList
    // meaning it will consist of fields in the Contacs class

    public MobilePhone() {
        this.myContacts = new ArrayList<>();
    }

    //exemplary way of doing the method
    public boolean addNewContact(Contact newContact) {
//        making the unique entries
/*        if(findContact(newContact.getContactName()) >= 0) { //using getContactName from Contact class
            System.out.println("Contact already present");
            return false; //if exists -> false
        }*/
        this.myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(findContact(oldContact.getContactName()) < 0) { //using getContactName from Contact class
            System.out.println("Contact is not present");
            return false;
        }
        this.myContacts.set(this.myContacts.indexOf(oldContact), newContact);
        System.out.println("Contact is updated");
        return true;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact.getContactName());
        if(index < 0) { //using getContactName from Contact class
            System.out.println("Contact is not present");
            return false;
        }
        this.myContacts.remove(index); //or ? .remove(contact)
        System.out.println("Contact is deleted");
        return true;
    }

    public void printContacts() {
        System.out.println("Printing all contacs");
        for(int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getContactName()
                    + " -> " + myContacts.get(i).getContactNumber());
        }
//get(i) gets the object (name, number). to retrieve a name I need to have .getContactName() also.
// get(i)  without .getContactName() will give me only the address to an object
    }


    private int findContact(String searchedContact) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getContactName().equals(searchedContact)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        int index = findContact(contactName);
        if(findContact(contactName) >= 0) {
            return myContacts.get(index);                         //which Contact instance
        }
        return null;
    }

}
