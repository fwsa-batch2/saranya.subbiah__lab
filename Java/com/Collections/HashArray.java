package com.Collections;
import java.util.*;

public class HashArray {
    
    private static final int i = 0;

    public static void main(String[] args) {
        Set<String> a = new HashSet<>();
        a.add("S");
        a.add("W");
        a.add("E");
        a.add("P");
        a.add("N");
        a.add("A");
        System.out.println("The Set: " + a);

        Object[] b = a.toArray();
        System.out.println("The Array: ");
        for(int i=0; i<b.length; i++);
        System.out.println(b[i]);
    }
}
