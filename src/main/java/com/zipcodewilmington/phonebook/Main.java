package com.zipcodewilmington.phonebook;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> phonebooks = new HashMap<String, String>();
        System.out.println(" asdfasdf ".trim());

        phonebooks.put("suyuang", "123");
        phonebooks.put("linfeng", "234");
        phonebooks.put("zhangsan", "345");
        phonebooks.put("lisi", "456");
        for (Map.Entry<String, String> entry: phonebooks.entrySet()) {
               System.out.println(entry.getKey() + " ==> " + entry.getValue() );
        }
        System.out.println("=========");

        phonebooks.remove("123");
        for (Map.Entry<String, String> entry: phonebooks.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue() );
        }

    }
}
