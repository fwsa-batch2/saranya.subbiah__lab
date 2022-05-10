package Practices;

public class Stringbuffer{
    public static void main(String[] args) {
        // append method 
        StringBuffer a = new StringBuffer("Student");
        a.append("Name");
        System.out.println(a);

        // insert method 
        StringBuffer b = new StringBuffer("Student");
        b.insert(3, "Name");
        System.out.println(b);

        // replace method
        StringBuffer c = new StringBuffer("Saranya");
        c.replace(0, 5, "Saran");
        System.out.println(c);

        // delete method
        StringBuffer d = new StringBuffer("Saranya");
        d.delete(5, 7);
        System.out.println(d);

        // reverse method
        StringBuffer e = new StringBuffer("Saranya");
        e.reverse();
        System.out.println(e);

        // capacity method
        StringBuffer f = new StringBuffer();
        System.out.println(f.capacity());
        f.append("Saranya");
        System.out.println(f.capacity());
    }
}
