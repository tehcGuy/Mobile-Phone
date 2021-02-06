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
    private String myNumber;
    private ArrayList<Contact> myContacts; //Contacs in <> is like a data type of the ArrayList
    // meaning it will consist of fields in the Contacs class

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
//exemplary way of doing the method
    public boolean addNewContact(Contact newContact) {
        if(findContact(newContact.getContactName()) >= 0) { //using getContactName from Contact class
            System.out.println("Contact already present");
            return false; //if exists -> false
        }
        this.myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(findContact(oldContact.getContactName()) < 0) { //using getContactName from Contact class
            System.out.println("Contact is not present");
            return false;
        }
        this.myContacts.set(this.myContacts.indexOf(oldContact), newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact.getContactName());
        if(index < 0) { //using getContactName from Contact class
            System.out.println("Contact is not present");
            return false;
        }
        this.myContacts.remove(index); //or ? .remove(contact)
        return true;
    }

    private int findContact(Contact searchedContact) {
        return this.myContacts.indexOf(searchedContact);
    }

    //he did this differently
    //check whether my implemetnation works
    private int findContact(String searchedContact) { //return the index position
        if(this.myContacts.contains(searchedContact))   //String is an object, thus, it is possible to use .contains()
        return (this.myContacts.indexOf(searchedContact));
    }

    public Contact queryContact(Contact contactName) {
        if(findContact(contactName) >= 0) {
            return contactName.getContactName();                         //which Contact instance
        }
        return null;
    }

    public void printContacts() {
/*has no parameters and doesn't return anything. Print the contacts in the following format:

Contact List:
1. Bob -> 31415926
2. Alice -> 16180339
3. Tom -> 11235813
4. Jane -> 23571113
*/
    }


}

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
/*Create a program that implements a simple mobile phone with the following capabilities.

1. Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:

     `Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
`
 A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.

 And seven methods, they are (their functions are in their names):

 addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
 updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
 removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
 findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
 findContact(), same as above, only it has one parameter of type String.
 queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
 printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:

Contact List:
1. Bob -> 31415926
2. Alice -> 16180339
3. Tom -> 11235813
4. Jane -> 23571113
*/