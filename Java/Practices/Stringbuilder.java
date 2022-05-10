package Practices;

public class Stringbuilder {
    public static void main(String[] args) {
        // append method
        StringBuilder a = new StringBuilder("Student");
        a.append("Name");
        System.out.println(a);

        // insert method
        StringBuilder b = new StringBuilder("Student");
        b.insert(2, "Name");
        System.out.println(b);

        // replace method
        StringBuilder c = new StringBuilder("Student");
        c.replace(0, 0, "New");
        System.out.println(c);

        // delete method
        StringBuilder d = new StringBuilder("Saranya");
        d.delete(5, 7);
        System.out.println(d);

        // reverse methhod
        StringBuilder e = new StringBuilder("Saranya");
        e.reverse();
        System.out.println(e);

        // capacity method
        StringBuilder f = new StringBuilder();
        System.out.println(f.capacity());
        f.append("I Love Icecream");
        System.out.println(f.capacity());
    }
}
