package Practices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner a = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            int val1 = a.nextInt();
            try (Scanner b = new Scanner(System.in)) {
                System.out.println("Enter the second number:");
                int val2 = b.nextInt();
                System.out.println("Sum of numbers " + add(val1, val2));
                System.out.println("Subtraction of numbers " + sub(val1, val2));
                System.out.println("Multiplication of numbers " + multiple(val1, val2));
                System.out.println("Division of numbers " + divide(val1, val2));
                System.out.println("Exponent of numbers " + exponent(val1, val2));
            }
        }
    }
    public static int add(int a, int b) {
        return a+b;
    }
    public static int sub(int a, int b) {
        return a-b;

    }
    public static int multiple(int a, int b) {
        return a*b;
    }
    public static float divide(float a, float b) {
        return a/b;
    }
    public static int exponent(int a, int b) {
        int Ans=1;
        for (int i=1; i<=b;i++) {
            Ans = Ans*a;
        }
        return Ans;
    }
}
