package Practices;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i=1; i<=10; i++) {
            a.add(i);
            System.out.println(a);
            a.remove(4);
            System.out.println(a);
            for (int j=0; j<a.size(); j++);
            System.out.println(a.get(i) + " ");
        }
    }
}
