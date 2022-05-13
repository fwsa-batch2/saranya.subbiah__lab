package com.Collections;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String> Queens = new TreeSet<>();
       
        Queens.add("Saran");
        Queens.add("Abi");
        Queens.add("Jeru");
        Queens.add("Swetha");
        Queens.add("Saran");

        System.out.println(Queens);

        String check = "K";
        System.out.println("K"  +  Queens.contains(check));

        System.out.println(Queens.first());
        System.out.println(Queens.last());
        System.out.println(Queens.pollFirst());
        System.out.println(Queens.pollLast());
        System.out.println(Queens);
    }
}
