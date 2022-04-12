import java.util.Scanner;


public class factorial {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        int no = Num.nextInt();
        int factorial = 1;
        for(int i=1; i<=no; i++) {
           factorial = i*factorial;
        }
           System.out.println(factorial);
    }
}