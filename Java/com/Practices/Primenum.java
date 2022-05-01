package com.Practices;

import java.util.Scanner;





public class Primenum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num==1) {
            System.out.println("This number is neither a prime number nor a composite number");
        }
        else if(num==2) {
            System.out.println("This is a prime number");
        }
        else {
            for (int i=2;i<num;i++) {
              int result=num%i;
             if(result==0) {
                 System.out.println("This is a composite number");
                 break;
             }
             else {
                System.out.println("This is a prime number");
             }
        }
            }
        }
    }
    

