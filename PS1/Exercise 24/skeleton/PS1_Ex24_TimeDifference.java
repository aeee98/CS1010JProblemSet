/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #24: PS1_Ex24_TimeDifference.java
 * 
 * Now you are going to see the difference in time taken
 * In this example I am honestly quite lazy to handle errors so I am just going to assume that my user is smart and actually follows the output correctly because I am kinda pessimistic that users actually do so.
 * 
 * Benjamin Kok Jiaming
 */

import java.text.*;
import java.util.*;

class TimeDifference {
  
  public static void main(String[] args) {
    int startHour, startMin, startSec; //declare start-time variables
    int endHour, endMin, endSec; //declare end-time variables
    int startTimeInSeconds;
    int endTimeInSeconds;
    //Declare the scanner all the time since we are always using System.in
    Scanner sc = new Scanner(System.in);
    //In this example I am going to convert all into raw time in seconds, subtract the seconds and then parse back into HH:MM:SS. This is the standard and in most cases the simplest solution for most time calculation algorithms involving seconds as no negatives are needed.
    String startTimeStr = sc.nextLine();
    String endTimeStr = sc.nextLine();
    String[] startTimeDetail = startTimeStr.split("\\s+"); //standard space split
    String[] endTimeDetail = endTimeStr.split("\\s+");
    //set the variables!
    startHour = Integer.parseInt(startTimeDetail[0]);
    startMin = Integer.parseInt(startTimeDetail[1]);
    startSec = Integer.parseInt(startTimeDetail[2]);
    endHour = Integer.parseInt(endTimeDetail[0]);
    endMin = Integer.parseInt(endTimeDetail[1]);
    endSec = Integer.parseInt(endTimeDetail[2]);
    //find out time in seconds
    startTimeInSeconds = returnTimeInSeconds(startHour,startMin,startSec);
    endTimeInSeconds = returnTimeInSeconds(endHour,endMin,endSec);
    //print out HH:MM:DD
    printTimeDifference(endTimeInSeconds - startTimeInSeconds);
  }
  
  //Basically returns the 24hour time in seconds
  public static int returnTimeInSeconds(int hour, int min, int sec)
  {
    //1 minute = 60 seconds
    //1 hour = 60 * 60 = 3600 seconds
    return (hour*3600 + min*60 + sec);
  }
  
  //parses the seconds to HH:MM:DD and display the result 
  public static void printTimeDifference(int differenceInSeconds)
  {
    int diffHour = differenceInSeconds / 3600; // this is okay as you only want the integer slot.
    int diffMin = (differenceInSeconds - diffHour * 3600)/ 60; //if you only want the minutes slot you need to subtract the hours factored into diffHour. You can alternatively do this by finding total minutes and then change to HH:MM 
    int diffSec = differenceInSeconds % 60; //you use modulo since you just want the remainder from the hours and minutes.
    
    // To show output as two digits with possible leading zero.
    // For example, df.format(8) will show 8 as 08
    DecimalFormat df = new DecimalFormat("00");
    
    System.out.println("Time difference: " + df.format(diffHour) + ":" + df.format(diffMin) + ":" + df.format(diffSec));
  }
}