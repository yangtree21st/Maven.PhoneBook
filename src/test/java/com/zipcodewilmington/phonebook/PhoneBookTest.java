package com.zipcodewilmington.phonebook;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    @Test

    public void addTest1() {

//       Creat key and value instance;
       String name = "name";
       String phoneNumber = "";
//      creat a Arraylist for expected number(value)
        ArrayList<String> expected = new ArrayList<String>();
        expected.add(phoneNumber);

        // Creat a Phonebook object phonebook

        PhoneBook phonebook = new PhoneBook();


       // When a new name is added to the phonebook
        phonebook.add(name, phoneNumber);
        ArrayList<String> actual = phonebook.lookup(name);

        // Then the retrieved number(value ) should equal the phone number associated with the name added
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        // Given a phonebook exists with a contact (name & number) pre-existing; and a new phone number exists

        String name = "name";
        String initialPhoneNumber = "123456";
        String newPhoneNumber = "234567";


//        Actual
        PhoneBook phonebook = new PhoneBook();
        phonebook.add(name, initialPhoneNumber);
        phonebook.add(name, newPhoneNumber);
        ArrayList<String> actual = phonebook.lookup(name);

//        Expect
        ArrayList<String> expected = new ArrayList<String>();
        expected.add(initialPhoneNumber);
        expected.add(newPhoneNumber);



        // Then the retrieved number should equal the phone number associated with the name added
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeRecordTest() {
        // Given a phonebook
        PhoneBook phonebook = new PhoneBook();
        String name = "name";
        String phoneNumber = "";
        phonebook.add(name, phoneNumber);

        // When we remove the number
        phonebook.removeNumber(name);
        ArrayList<String> retrievedNumbers = phonebook.lookup(name);

        // Then the retrieved list of numbers
    }

    @Test
    public void lookupTest() {
        // Given a phonebook exists with a given name and number
        PhoneBook phonebook = new PhoneBook();
        String name = "name";
        String phoneNumber1 = "";
        phonebook.add(name, phoneNumber1);
        String phoneNumber2 = "";
        phonebook.add(name, phoneNumber2);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add(phoneNumber1);
        expected.add(phoneNumber2);

        // When we lookup the person by their name,
        ArrayList<String> actual = phonebook.lookup(name);

        // Then the retrieved number should match the number we added to the phonebook
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseLookupTest() {
        // Given a phonebook exists and a name and set of numbers are added to it
        PhoneBook phonebook = new PhoneBook();
        String expected = "name";
        String phoneNumber1 = "";
        phonebook.add(expected, phoneNumber1);
        String phoneNumber2 = "";
        phonebook.add(expected, phoneNumber2);

        // When we reverse lookup a person by their number, their name should be returned
        String actual = phonebook.reverseLookup(phoneNumber1);

        // Then the retrieved name should match the name we added to the phonebook
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void displayTest() {
        // Given a phonebook exists and a bunch of names and numbers are added to it
        PhoneBook phonebook = new PhoneBook();
        phonebook.add("aaa", "4434343");
        phonebook.add("bbb", "45454545");
        phonebook.add("aaa", "6565656");
        phonebook.add("bbb", "767676");
        phonebook.add("eeee", "8787878");
        String expected = "aaa 4434343 6565656\nbbb 45454545 767676\neeee 8787878";

        // When the display function is called, an alphabetical list of names and numbers should be returned
        String actual = phonebook.display();

        // Then the list of numbers should show Audrey, Daniel, and Elsa (and their numbers) in that order
        Assert.assertEquals(expected, actual);
    }
}


