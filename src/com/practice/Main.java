package com.practice;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        while(!quit) {
            menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); //handling "Enter" key
            switch(choice) {
                case 0:
                    Main.menu();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    Main.update();
                    break;
                case 3:
                    Main.add();
                    break;
                case 4:
                    Main.remove();
                    break;
                case 5:
                    find();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Please select the number from a range 0 - 6");
            }
        }
    }

    public static void find() {
        System.out.println("Enter name of existing contact name that you want to find:");
        String personName = scanner.nextLine();
        Contact toFind = mobilePhone.queryContact(personName);

        if(toFind == null) {
            System.out.println("Contact is not found");
        } else {
            System.out.println("Contact is found");
        }
    }

    public static void remove() {
        System.out.println("Enter name of existing contact name that you want to remove:");
        String personName = scanner.nextLine();
        Contact toRemove = mobilePhone.queryContact(personName);

        if(toRemove == null) {
            System.out.println("Contact not found");
            return;
        }
        mobilePhone.removeContact(toRemove);
    }

    public static void update() {
        System.out.println("Enter name of existing contact:");
        String personName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(personName);

        if(oldContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter a new contact name");
        personName = scanner.nextLine();

        System.out.println("Enter a new contact phone");
        String personPhone = scanner.nextLine();

        Contact newContact = Contact.createContact(personName, personPhone);
        mobilePhone.updateContact(oldContact, newContact);

    }

    public static Contact add() {
        System.out.println("add name");
        String personName = scanner.nextLine();
        System.out.println("add number");
        String personPhone = scanner.nextLine();

        Contact newContact = Contact.createContact(personName, personPhone); // !!newContact will be deleted after the method will had ran
        mobilePhone.addNewContact(newContact);
        System.out.println("New contact with " + personName + " name, and (" + personPhone + ") phone number was added");
        return newContact;

    }

    static public void menu() {
        System.out.println("\nPress any of the following keys in order to manage your contacs:");
        System.out.println("0 -- to review this menu");

        System.out.println("1 -- to print contacts");
        System.out.println("2 -- to update");
        System.out.println("3 -- to add");
        System.out.println("4 -- to remove");
        System.out.println("5 -- to find");

        System.out.println("6 -- to quit");
    }
}