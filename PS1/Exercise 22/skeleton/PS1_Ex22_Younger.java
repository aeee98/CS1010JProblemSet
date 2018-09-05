/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #22: PS1_Ex22_Younger.java
 * 
 * Find who is younger: Tamil or Alice
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;

class Younger {
  
  public static void main(String[] args) {
    //Declare the scanner
    Scanner sc = new Scanner(System.in);
    //get values from the person
    System.out.print("Enter birthday for Tamil (day month year): ");
    String tamilBdStr = sc.nextLine();
    System.out.print("Enter birthday for Alice (day month year): ");
    String aliceBdStr = sc.nextLine();
    
    //Without parsing the string at all, you can actually tell if they are of the same age if the strings are the same.
    if (tamilBdStr.equals(aliceBdStr)) // do not use == when comparing strings. Use string1.equals(string2) instead.
    {
      System.out.println("Tamil and Alice are of the same age");
    }
    else if (aliceYounger(aliceBdStr, tamilBdStr)) //alice is younger
    {
      System.out.println("Alice is younger");
    }
    else //Tamil is younger
    {
    System.out.println("Tamil is younger");
    }
  }
  
  //returns true if alice is younger, otherwise returns false
  public static boolean aliceYounger(String aliceBd, String tamilBd)
  {
    //declare variables
    int aliceDay, aliceMonth, aliceYear, tamilDay, tamilMonth, tamilYear;
    //split string and populate variables
    String[] aliceArray = aliceBd.split("\\s+");
    aliceDay = Integer.parseInt(aliceArray[0]);
    aliceMonth = Integer.parseInt(aliceArray[1]);
    aliceYear = Integer.parseInt(aliceArray[2]);
    String[] tamilArray = tamilBd.split("\\s+");
    tamilDay = Integer.parseInt(tamilArray[0]);
    tamilMonth = Integer.parseInt(tamilArray[1]);
    tamilYear = Integer.parseInt(tamilArray[2]);
    //use selection statement
    if (aliceYear != tamilYear)
    {
      return (aliceYear > tamilYear); // if aliceYear > tamilYear, alice is younger.
    }
    else if (aliceMonth != tamilMonth) // if year is same check month
    {
      return (aliceMonth > tamilMonth);
    }
    else //then check day. No need to check for similarity since we did it in an earlier step!
    {
      return (aliceDay > tamilDay);
    }
  }
}