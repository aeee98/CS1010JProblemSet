/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #03: PS1_Ex03_Freezer.java
 * 
 * This program estimates the temperature in a freezer 
 * given the elapsed time (hours) since a power failure.
 * 
 * Benjamin Kok Jiaming
 */

import java.util.Scanner;

class Freezer {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter hours and minutes since power failure: ");
    
    String input = sc.nextLine();
    String[] hoursAndMinutes = input.split("\\s+");
    int hours;
    int minutes;
    double totalTime;
    double temperature;
    // Handle proper array length first.
    try
    {
      if (hoursAndMinutes.length != 2)
      {
        System.out.println("Error. please enter hours and minutes correctly.");
      }
      else
      {
        //Take out hours and minutes
        hours = Integer.parseInt(hoursAndMinutes[0]);
        minutes = Integer.parseInt(hoursAndMinutes[1]);
        if (hours < 0 || minutes < 0)
        {
          System.out.println("Error. please enter hours and minutes correctly.");
        }
        else
        {
        //Calculate total time
        totalTime = hours + (double)minutes/60;
        //Calculate Temperature
        temperature = (4 * totalTime * totalTime)/(totalTime+2) - 20;
        //Print out Temperature
        System.out.println("Temperature in freezer = " + temperature);
        }
      }
    }
    catch (Exception e) // good practice to always catch exceptions in case there are bad values.
    {
      System.out.println(e.toString());
    }
  }
}