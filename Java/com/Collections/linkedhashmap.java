package com.Collections;
import java.util.*;

public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> Girls = new LinkedHashMap<>();
        Girls.put("One", "Saranya");
        Girls.put("Two", "Jerusheya");
        Girls.put("Three", "Abisha");
        Girls.put("Four", "Swetha");
        Girls.put("Five", null);
        Girls.put(null, "S" );
        System.out.println(Girls);
        System.out.println(Girls.keySet());
        System.out.println(Girls.values());
        System.out.println(Girls.entrySet());
        String name = Girls.remove("One");
        System.out.println(name);
        System.out.println(Girls.entrySet());

    }
}
