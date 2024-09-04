package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public Map<String, Integer> book = new HashMap<>();
    public int count = 0;

    public int add(String name, Integer number) {
        if (!book.containsKey(name)) {
            book.put(name, number);
            count++;
        }
        return count;
    }
}
