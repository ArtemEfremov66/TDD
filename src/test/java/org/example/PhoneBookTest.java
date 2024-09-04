package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void addTest() {
        String name = "Artem";
        Integer number = 2345;
        int result = phoneBook.add(name, number);
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void findByNumberTest() {
        int number = 2345;
        String result = phoneBook.findByNumber(number);
        Assertions.assertEquals(result, "Artem");
    }

}
