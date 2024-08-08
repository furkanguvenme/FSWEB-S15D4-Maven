package org.example;


import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("Test"));
        System.out.println(checkForPalindrome("Welcome"));

        System.out.println("---------------------------");
        WorkintechList list = new WorkintechList();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        list.sort();
        System.out.println(list);

        System.out.println("------------------------------");

        WorkintechList list1 = new WorkintechList();
        list1.add("Mehmet");
        list1.add("Zeynep");
        list1.add("Zeynep");
        list1.add("Mehmet");
        list1.add("Ali");
        list1.add("Ali");
        list1.remove("Ali");
        System.out.println(list1);
    }

    public static boolean checkForPalindrome(String string){
        String text = string.replaceAll("[?.,!_\\- ]","").toLowerCase(Locale.ROOT);
        StringBuilder mahmut = new StringBuilder(text).reverse();
        return text.equals(mahmut.toString());
    }

    public static String convertDecimalToBinary(int number){
        String binary = "";
        while(number > 0){
            binary += String.valueOf(number % 2);
            number = number / 2;
        }
        StringBuilder newBinary = new StringBuilder(binary);
        return newBinary.reverse().toString();
    }

}