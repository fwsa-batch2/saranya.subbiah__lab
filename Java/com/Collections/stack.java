package com.Collections;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> Queens = new Stack<String>();
        Queens.push("Saran");
        Queens.push("Abi");
        Queens.push("Jeru");
        Queens.push("Swetha");
        Queens.push("Saranya");
        Queens.pop();
        System.out.println(Queens);
    }
}
