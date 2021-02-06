package com.practice;
/*
2. Implement the Contact class with the following attributes:

 Two fields, both String, one called name and the other phoneNumber.

 A constructor that takes two Strings, and initialises name and phoneNumber.

 And Three methods, they are:

  getName(), getter for name.

  getPhoneNumber(), getter for phoneNumber.

createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.

 In MobilePhone, use findContact() in the other methods (except printContacts()) to check if it exists before proceeding.

 Two Contact objects are equal if they have the same name.

 Be extremely careful about spaces in the printed message.

 All fields are private.

NOTE Constructors should be defined as public.
NOTE All methods should be defined as public (except for the two findContact() methods which are private).
NOTE Do not add a main method to the solution code.

 If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments.
*/

public class Contact {
 private String contactName;
 private String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

//createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.
    static public Contact createContact(String personName, String phoneNumber){
        return new Contact(personName, phoneNumber);
    }
}
