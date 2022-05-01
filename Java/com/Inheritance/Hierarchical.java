package com.Inheritance;

public class Hierarchical {
    void Chocolates() {
        System.out.println("I Love to eat Chocolates than Sweets");
    }
}

class Chocolate1 extends Hierarchical  {
    void DairyMilk() {
        System.out.println("My Favourite Chocolate is DairyMilk");
    }
}

class Chocolate2 extends Hierarchical {
    void FiveStar() {
        System.out.println("I Love to eat FiveStar");
    }
}

class Chocolate3 extends Hierarchical {
    void KitKat() {
        System.out.println("The Chocolate KitKat is so sweet");
    }


public static void main(String[] args) {
   Chocolate1 obj1 = new Chocolate1();
   Chocolate2 obj2 = new Chocolate2();
   Chocolate3 obj3 = new Chocolate3();
     obj1.Chocolates();
     obj1.DairyMilk();
     obj2.Chocolates();
     obj2.FiveStar();
     obj3.Chocolates();
     obj3.KitKat();

}
}