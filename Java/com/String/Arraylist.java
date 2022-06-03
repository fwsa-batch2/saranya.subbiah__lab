import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList arraylist=new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        LinkedList linklist=new LinkedList<>(arraylist);
        System.out.println(linklist);
    }
}
