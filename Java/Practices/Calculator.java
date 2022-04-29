import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int value1 = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the second number:");
        int value2 = num2.nextInt();
        System.out.println("Sum of numbers " + add(value1, value2));
        System.out.println("Subtraction of numbers " + sub(value1, value2));
        System.out.println("Multiplication of numbers " + multiple(value1, value2));
        System.out.println("Division of numbers " + divide(value1, value2));
        System.out.println("Exponent of numbers " + exponent(value1, value2));
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
