package com.WrapperClass;
import java.util.ArrayList;

public class Unboxing {
    public static void main(String[] args) {
    ArrayList <Integer> arr = new ArrayList<Integer>();
    arr.add(40);
    int num = arr.get(0);
    System.out.print(num);
}
}