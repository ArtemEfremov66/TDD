package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void addTest() {
        String name = "Artem";
        Integer number = 2345;
        int result = phoneBook.add(number, name);
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void findByNumberTest() {
        phoneBook.add(666, "Stiv");
        int number = 666;
        String result = phoneBook.findByNumber(number);
        Assertions.assertEquals(result, "Stiv");
    }

    @Test
    public void findByNameTest() {
        phoneBook.add(666, "Stiv");
        String name = "Stiv";
        int result = phoneBook.findByName(name);
        Assertions.assertEquals(result, 666);
    }

}
