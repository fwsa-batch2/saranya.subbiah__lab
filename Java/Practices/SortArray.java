package Practices;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] a = new int [] {1,2,3,4,5,6,7,8,9,10};  
         
        Arrays.sort(a);   
        System.out.println("Elements of array: ");  
        
        for (int i = 0; i < a.length; i++)   
        {       
        System.out.println(a[i]);   
        }   
    }  
}  
   
