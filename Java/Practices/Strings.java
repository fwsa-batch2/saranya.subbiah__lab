package Practices;

public class Strings {
    public static void main(String[] args) {
        // concat method
        String a = "I am Saran";
        System.out.println(a);

        // split method
        String s = "Saranya Subbiah";
        String[] two = s.split(" ", 2);
        for (String b : two)
        System.out.println(b);

        // length method
        String c = "I Love Icecream";
        System.out.println(c.length());

        // substring method
        String d = "SSaranya";
        System.out.println(d.substring(1,6));
    }

}
