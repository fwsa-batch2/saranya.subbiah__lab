using System;

namespace StoryTime
{
  class Program
  {
    static void Main(string[] args)
    {
      // Declare the variables
       string beginning = "Once upon a Time";
       string middle = "She has lost her confidence";
       string end = "She have successfully completed her course";
      // Concatenate the string and the variables
        string story = beginning + " and in the middle " + middle + " in the end " + end + ".";

      // Print the story to the console 
        Console.WriteLine(story);
    }
  }
}
