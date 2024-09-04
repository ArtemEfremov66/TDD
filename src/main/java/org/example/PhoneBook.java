package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    public Map<String, Integer> book = new HashMap<>();
    public int count = 0;

    public int add(String name, Integer number) {
        if (!book.containsKey(name)) {
            book.put(name,number);
            count++;
        }
        return count;
    }

    public String findByNumber(int number) {
        Set<Map.Entry<String,Integer>> entrySet = book.entrySet();
        for (Map.Entry<String,Integer> pair : entrySet) {
            if (number == pair.getValue()) {
                return pair.getKey();
            }
        }
        return null;
    }

    public int findByName(String name) {
        return book.get(name);
    }
}
