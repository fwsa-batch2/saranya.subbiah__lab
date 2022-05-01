package com.Inheritance;

class Hybrid {
     public void  Colors() {
        System.out.println("Hybrid");
    }
}

 class Orange extends Hybrid {
     @Override
     public void Colors() {
        System.out.println("Orange");
    }
}

class Red extends Hybrid{
    @Override
     public void Colors() {
        System.out.println("Red");
    }
}


public class Green extends Orange {
    @Override
    public void Colors() {
        System.out.println("Green");
    }


public static void main(String[] args) {
    Green obj = new Green();
    obj.Colors();
}
}