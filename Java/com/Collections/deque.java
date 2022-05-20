package com.Collections;
import java.util.*;

public class deque {
    public static void main (String[] args) {
        Deque<Integer> num = new ArrayDeque<>();
        num.offerFirst(1);
        num.offerLast(2);
        num.offerLast(3);
        num.offerLast(4);
        System.out.println(num);
        System.out.println("First Number " + " " + num.getFirst());
        System.out.println("Last Number " + " " + num.getLast());
    }
}
