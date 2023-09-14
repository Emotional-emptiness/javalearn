package Encapsulation;

import java.util.Arrays;

public class Encapsulation {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        System.out.println("Before change: " + Arrays.toString(telephoneBook.getPhoneBook()));

        String[] phoneBook = telephoneBook.getPhoneBook();
        phoneBook[1] = "1";
        System.out.println("Changed: " + Arrays.toString(phoneBook));
        System.out.println("Original: " + Arrays.toString(telephoneBook.getPhoneBook()));
    }
}
