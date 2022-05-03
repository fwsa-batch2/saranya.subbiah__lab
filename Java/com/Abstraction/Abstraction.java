package com.Abstraction;

abstract class Dress {
    public abstract void Womens();
   public void Kurti() {
       System.out.println("Black");
   }
}

class Chudithar extends Dress {
    public void Womens() {
        System.out.println("I am comfortable wearing chudithar");
    }
}

class Clothing {
    public static void main(String[] args) {
        Chudithar obj = new Chudithar();
        obj.Womens();
        obj.Kurti();
    }
}