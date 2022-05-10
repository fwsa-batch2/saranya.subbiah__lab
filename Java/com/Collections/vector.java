package com.Collections;

import java.util.*;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<Integer>();
        for (int i=1; i<=10; i++) {
            num.add(i);
            System.out.println(num);
            num.remove(8);
            System.out.println(num);
            for (int j=0;j<num.size(); j++);
            System.out.println(num.get(i) + " ");
        }
    }
}
