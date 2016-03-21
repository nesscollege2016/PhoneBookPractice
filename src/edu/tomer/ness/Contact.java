package edu.tomer.ness;

import java.util.Scanner;

/**
 * Created by Dev on 21/03/2016.
 */
public class Contact {

    //Properties
    String firstName;
    String lastName;
    String phone;

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    //Constructor
    public Contact() {
        Scanner scanner = new Scanner(System.in);
        //Input the firstName
        System.out.println("Enter First Name:");
        this.firstName = scanner.next();

        //Input the lastName
        System.out.println("Enter Last Name:");
        this.lastName = scanner.next();

        //Input the phone
        System.out.println("Enter Phone:");
        this.phone = scanner.next();
    }

    //actions / methods

    void dispDetails(){
        System.out.printf("FirstName: %s\nLastName: %s\nPhone: %s\n___\n",
        firstName, lastName, phone);
    }
}
