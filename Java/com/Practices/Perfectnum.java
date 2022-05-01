package com.Practices;

import java.util.Scanner;

public class Perfectnum {
    public static void main(String[]args) {
        int i, num, Sum = 0;
    System.out.println("Enter any Number");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();

    for(i=0; i<num; i++) {
       if (num%i==0) {
           Sum = Sum + i;
       }
    }

    if(Sum==num) {
        System.out.println(num + "is a Perfect Number");
    }
    else {
        System.out.println(num + "is not a Perfect Number");
    }
    }
}
