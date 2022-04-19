import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String noToString = Integer.toString(num);
        Double cube = 0.0;
        int result = 0;
        for(int i=0; i<noToString.length();i++) {
          int lenofString = noToString.length();
          char digit = noToString.charAt(i);
          int value = Integer.parseInt(String.valueOf(digit));
          cube += Math.pow(value, lenofString);
          result = cube.intValue();
        }
        sc.close();

      if(result == num) {
          System.out.println("This is an Armstrong Number");
      }
      else {
          System.out.println("This is not an Armstrong Number");
      }
    }
}
