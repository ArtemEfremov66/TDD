package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public Map<Integer, String> book = new HashMap<>();
    public int count = 0;

    public int add(Integer number, String name) {
        if (!book.containsKey(number)) {
            book.put(number, name);
            count++;
        }
        return count;
    }

    public String findByNumber(int number) {
        return book.get(number);
    }

    public int findByName(String name) {
        return 0;
    }
}
