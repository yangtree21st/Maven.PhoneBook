package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    TreeMap<String, ArrayList<String>> people;

    public PhoneBook() {
        people = new TreeMap<String, ArrayList<String>>();
    }

    public void add(String name, String phoneNumber) {
        if (people.containsKey(name)) {
            ArrayList<String> retrievedNumbers = people.get(name);
            retrievedNumbers.add(phoneNumber);
            people.put(name, retrievedNumbers);
        } else {
            ArrayList<String> newNumber = new ArrayList<String>();
            newNumber.add(phoneNumber);
            people.put(name, newNumber);
        }
    }

    public void removeNumber(String name){

        people.remove(name);

    }

    public ArrayList<String> lookup(String name) {
           ArrayList<String> value ;

           return value = people.get(name);

    }

    public String reverseLookup(String phoneNumber) {

        String name = "";

        for (Map.Entry<String, ArrayList<String>> e: people.entrySet()) {

            ArrayList<String> numbers = e.getValue();
            for(  String i : numbers) {
                if (phoneNumber == i)
                    name = e.getKey();
            }
        }
        return name;
    }

    public String reverseLookup2(String phoneNumber) {
        String name = "";
        ArrayList<String> values;
        Set<String> keyList = people.keySet();

        for (String key : keyList) {
            values = people.get(key);
            for (String value : values) {
                if (value.equals(phoneNumber)) {


                    name = key;

                }

            }
        } return name;
    }


    public String display() {
        String allNames = "";
        for (Map.Entry<String, ArrayList<String>> entry: people.entrySet()) {
            allNames += entry.getKey() + " ";
            ArrayList<String> values = entry.getValue();
            for (String number: values) {
                allNames += number + " ";
            }

            allNames += "\n";
        }
        allNames = allNames.trim();
        return allNames;
    }

}



