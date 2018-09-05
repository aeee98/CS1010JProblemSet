/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #19: PS1_Ex19_LeapYear.java
 * 
 * Feels good to see a February 29th every year, ain't it?
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;

class LeapYear {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int year;
    System.out.print("Enter year: ");
    year = sc.nextInt();
    
    if (isLeapYear(year))
    {
    System.out.println(year+" is a leap year.");
    }
    else // is not leap year
    {
    System.out.println(year+" is not a leap year.");
    }
  }
  
  // Handle Leap Year mechanics (divisible by 4 but not by 100 or divisible by 400)
  public static boolean isLeapYear(int year) {
    if ( ((year % 4 == 0) && (year%100 != 0)) || (year%400 == 0) ) //if divisible modulo is 0, else it has a remainder.
      return true;
    else 
      return false;
  }
}