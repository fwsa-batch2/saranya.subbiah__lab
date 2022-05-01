package com.Inheritance;

public class Multilevel {
    public void Coffee() {
        System.out.println("Coffee is too hot");
    }
}

class curd extends Multilevel {
    public void Curdrice() {
        System.out.println("Curd Rice is South Indian Traditional Food");
    }
}

class butter extends curd {
    public void Ghee() {
        System.out.println("My Mother made Ghee from milk");
    }

    public static void main(String args[]) {
        butter obj = new butter();
        obj.Coffee();
        obj.Curdrice();
        obj.Ghee();
    }
}
