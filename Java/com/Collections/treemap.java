package com.Collections;
import java.util.*;

public class treemap {
    public static void main(String[] args) {
         TreeMap<Integer, String> names = new TreeMap<>();
         names.put(1, "Saranya");
         names.put(2, "Abisha");
         names.put(3, "Jerusheya");
         names.put(4, "Swetha");
         System.out.println(names);
         System.out.println(names.keySet());
         System.out.println(names.values());
         System.out.println(names.entrySet());
         names.replace(1, "Saranya");
         System.out.println(names);
         String girls = names.remove(1);
         System.out.println(girls);
         System.out.println(names);


    }
}
