package Practices;
import java.util.Scanner;
public class Weirdnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        
         if(num % 2 != 0) {
             System.out.println("Weird");
         }
         else{
             if(2 <= num && num <= 5) {
                 System.out.println("Not Weird");
             }
             if(6 <= num && num <= 20) {
                 System.out.println("Weird");
             }
             if(20 < num) {
                 System.out.println("Not Weird");
             }
         }

   sc.close();
}
}

