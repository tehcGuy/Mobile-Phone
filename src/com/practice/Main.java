package com.practice;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("+1 559 931 5423");

    public static void main(String[] args) {
        boolean quit = false;
        while(!quit) {
            menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); //handling "Enter" key
            switch(choice) {
                case 0:
                    menu();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
/*                case 2:
                    Main.update();
                    break;*/
                case 3:
                    add();
                    break;
/*                case 4:
                    mobilePhone.removeContact();
                    break;*/
/*                case 5:
                    find();
                    break;*/
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Please select the number from a range 0 - 6");
            }
        }
    }
/*
    public static void update() {
        String personName = scanner.nextLine();
        String personPhone = scanner.nextLine();

        mobilePhone.updateContact()
    }*/

    public static void add() {
        System.out.println("add name");
        String personName = scanner.nextLine();
        System.out.println("add number");
        String personPhone = scanner.nextLine();

        Contact.createContact(personName, personPhone);
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