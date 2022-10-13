using System;

namespace MethodOverloading
{
  class Program
  {
    static void Main(string[] args)
    {
      NamePets("Jezzie","Tommy");
      NamePets("Pattu", "tiger", "mani");
      NamePets();
    }
     static void NamePets(string Jezzie,string Tommy)
     {
      Console.WriteLine($"Your pets {Jezzie} and {Tommy} will be joining your voyage across space!");
     }
     static void NamePets(string Pattu, string tiger, string mani)
     {
     Console.WriteLine($"Your pets {Pattu}, {tiger} and {mani} will be joining your voyage across space!");
     }
     static void NamePets() 
     {
       Console.WriteLine("Aw, you have no spacefaring pets :(");
     }
    }
    
}
