package Practices;

import java.util.Scanner;

public class Strongnum {
   public static void main(String[] args) {
     System.out.println("Enter a Number: ");
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     String numString = Integer.toString(num);
        int result = 0;
        for (int i=0; i<numString.length(); i++) {
          Character dig = numString.charAt(i);
          int value = Integer.parseInt(String.valueOf(dig));
          int fact = 1;
          int a;
          for ( a = 1; a <= value; a++);
          {
            fact = a * fact;
          }
            System.out.println(fact); 
            result += fact;
          }
          System.out.println("result:"  +result);
          if (result==num) {
            System.out.println("Strong Number");
          }
          else {
            System.out.println("Not a Strong Number");
          }
   }
  }
