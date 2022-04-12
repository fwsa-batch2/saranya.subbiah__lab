import java.util.Scanner;

public class fiboseries {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int Num = num.nextInt();
        int num1 ,num2 , num3;
        num1=0;
        num2=1;
        num3=2;
        for (int i=0; i<=Num; i++) {
            System.out.println(num1);
            num3=num1+num2;
            num1=num2;
            num2=num3;
        }
   
    }
}
