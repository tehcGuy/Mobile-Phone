package com.practice;

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

    static public Contact createContact(String personName, String phoneNumber) {
        return new Contact(personName, phoneNumber);
    }
}
