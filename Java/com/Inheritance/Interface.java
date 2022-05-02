package com.Inheritance;

public class Interface {
    interface Saran {
        final int no=3;
        void Abi();
    }
class Jeru implements Saran {
      public void Abi() {
          System.out.println("Three Idiots");
      }
}
public class Swetha {
    public void main(String[] args) {
        Jeru obj = new Jeru();
        obj.Abi();
        System.out.println(Saran.no);
    }
}
}

