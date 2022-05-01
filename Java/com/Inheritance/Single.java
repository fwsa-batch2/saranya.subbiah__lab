package com.Inheritance;

public class Single {
    public void Name() {
      System.out.println("Saran");
    }
}

class Number extends Single {
     public void Class() {
         System.out.println("Abi,Jeru,Swetha");
     }
}

class New {
    public static void main(String[] args) {
        Number obj = new Number();
            obj.Class();
            obj.Name();
        
    }
}