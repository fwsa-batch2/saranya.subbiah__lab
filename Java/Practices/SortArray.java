package Practices;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(a, 6,7);
        System.out.println("NewArray[]: %s"  Arrays.toString(a));
    }
}
