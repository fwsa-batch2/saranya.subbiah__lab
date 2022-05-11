package com.ExceptionHandling;

public class Trycatch {
    public static void main(String[] args) {
        try {
            int[] a = {1,2,3,4,5};
            System.out.println(a[20]);
        }
        catch (Exception e) {
            System.out.println("Wrong");
        }
    }
}
