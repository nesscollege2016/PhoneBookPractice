package edu.tomer.ness;

/**
 * Created by Dev on 21/03/2016.
 */
public class PhoneBook {
    //Properties:
    Contact[] contacts;
    int currentIndex;

    //Constructor
    public PhoneBook(int numOfContacts) {
        contacts = new Contact[numOfContacts];
        currentIndex = 0;
    }

    //Actions / methods:
    void insertContact(){
        Contact c = new Contact();
        contacts[currentIndex] = c;
        currentIndex++;
    }

    void insertContact(String firstName ,String lastName, String phone){
        Contact c = new Contact(firstName, lastName, phone);
        contacts[currentIndex] = c;
        currentIndex++;
    }

    void dispAllContacts(){
        for (int i = 0; i < currentIndex; i++) {
            Contact c = contacts[i];
            c.dispDetails();
        }
    }

    void dispDetails(String name){
        for (int i = 0; i < currentIndex; i++) {
            if (contacts[i].firstName.startsWith(name)
                    || contacts[i].lastName.startsWith(name)){
                contacts[i].dispDetails();
            }
        }
    }

    void dispDetails(int index){
        Contact c = contacts[index];
        if (c != null)
            c.dispDetails();
        else{
            System.out.println("No Such contact");
        }
    }
}
