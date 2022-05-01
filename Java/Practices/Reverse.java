package Practices;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        int reminder;
        while (num != 0) {
            reminder=num%10;
            reverse=reverse*10+reminder;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
