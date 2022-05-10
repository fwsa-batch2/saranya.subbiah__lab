package Practices;

public class Smalllargearray {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5,6};
 
       
        int small = a[0];
        int large = a[0];
        
        for(int i=1; i< a.length; i++)
        {
        if(a[i] > large)
        large = a[i];
        else if (a[i] < small)
        small = a[i];
        
        }
        System.out.println("Smallest Number is : " + small);
        System.out.println("Largest Number is : " + large); 
        }
       }
        
   