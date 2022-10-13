using System;

namespace SwitchStatement
{
  class Program
  {
    static void Main(string[] args)
    {
     Console.WriteLine("Choose a movie genre: ");
      string genre = Console.ReadLine();
      switch (genre){
        case "Drama":
         Console.WriteLine("genre is Drama");
         break;
         case "Comedy":
          Console.WriteLine("genre is Comedy");
          break;
          case "Adventure":
          Console.WriteLine("genre is Adventure");
          break;
          case "Science Fiction":
          Console.WriteLine("genre is Science Fiction");
          break;
          case "Horror":
          Console.ReadLine("genre is Science Horror");
          break;
          default:
          
          Console.WriteLine("No movie found");
          
          break;
      }


    }
  }
}
