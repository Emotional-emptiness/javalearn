package Encapsulation;

import java.util.Arrays;

public class TelephoneBook {
    String[] phoneBook = new String[] {"+3889999191", "+388999912121", "+38899991213", "+3889999421"};
    public String[] getPhoneBook() {
        return Arrays.copyOf(phoneBook, phoneBook.length -1);
    }


}
