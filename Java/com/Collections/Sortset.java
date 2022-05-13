package com.Collections;
import java.util.*;

public class Sortset {
   public static void main(String[] args) {
       SortedSet<String> a = new TreeSet<String>();
           a.add("S");
           a.add("W");
           a.add("E");
           a.add("P");
           a.add("N");
           a.add("A");
           a.add("S");
           System.out.println("Sorted Set : " + a);
         
           String check = "Y";
           System.out.println("Contains "   + check +   "  "  + a.contains(check));

           System.out.println("FirstValue: " + a.first());
           System.out.println("LastValue: " + a.last());

           System.out.println("Iterating");
           Iterator<String> b = a.iterator();
           while (b.hasNext())
               
              System.out.println(b.next()); 
           
       }
   } 

