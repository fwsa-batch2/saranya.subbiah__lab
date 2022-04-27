public class SingleInheritance {
    public void Name() {
      System.out.println("Saran");
    }
}

class Number extends SingleInheritance {
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