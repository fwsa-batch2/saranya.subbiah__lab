package com.Collections;
import java.util.*;

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i=1; i<=10; i++) {
            a.add(i);
            System.out.println(a);
            a.remove(3);
            System.out.println(a);
            for (int j=0; j<a.size(); j++);
            System.out.println(a.get(i) + " ");
        }
    }
}
