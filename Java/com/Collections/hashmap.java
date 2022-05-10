package com.Collections;
import java.util.*;



public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> num = new HashMap<>();
        num.put(1, "Saran");
        num.put(2, "Abi");
        num.put(3, "Jeru");
        num.put(4, "Swetha");
        num.put(5, "Saranya");
        System.out.println("Map: " + num);
        System.out.println("Key: " + num.keySet());
        System.out.println("Value: " + num.values());
        System.out.println("Entry: " + num.entrySet());
        String value = num.remove(5);
        System.out.println("Removed value: " + value);
        System.out.println("Entry: " + num.entrySet());
        
    }
}
