package com.Collections;

import java.util.*;

public class Operationset {
    public static void main(String[] args) {
        Set<Integer> x = new HashSet<>();
        x.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9}));
        Set<Integer> y = new HashSet<>();
        y.addAll(Arrays.asList(new Integer[] {2,4,6,8}));

        Set<Integer> Union = new HashSet<>(x);
        Union.addAll(y);
        System.out.println("Union of the Set");
        System.out.println(Union);

        Set<Integer> Intersection = new HashSet<>(x);
        Intersection.retainAll(y);
        System.out.println("Intersection of the Set");
        System.out.println(Intersection);

        Set<Integer> Difference = new HashSet<>(x);
        Difference.removeAll(y);
        System.out.println("Difference of the Set");
        System.out.println(Difference);


    }
}
