
import java.util.Scanner;
class ReverseStringDowhileloop{
public static void main(String args[]){
    String str;
    char ch;
    System.out.println("Enter a String as you wish: ");
Scanner scan=new Scanner(System.in);
    
   str =scan.nextLine();
   System.out.println("Reverse of given String "+str+" is : ");
   int j=str.length();
   do{
       System.out.print(str.charAt(j-1));
        j--;
   }
   while(j>0);
}
}

