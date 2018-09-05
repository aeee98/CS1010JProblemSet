/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #13: PS1_Ex13_Travel.java
 * 
 * Caculate the total distance travelled by Mr. Zhou!
 * 
 * 
 * Benjamin Kok Jiaming
 */
import java.util.*;
import java.lang.*;
import java.text.*;

class Travel {
  
  public static void main(String[] args) {
    double homeX, homeY, officeX, officeY, ntucX, ntucY;
    double totalDistance;
    Scanner sc = new Scanner(System.in);
    String input;
    String[] inputs;
    //get input
    System.out.print("Enter X Y coordinates for Home: ");
    input = sc.nextLine();
    inputs = input.trim().split("\\s+");
    
    homeX = Double.parseDouble(inputs[0]);
    
    homeY = Double.parseDouble(inputs[1]);
    System.out.print("Enter X Y coordinates for Office: ");
    input = sc.nextLine();
    inputs = input.trim().split("\\s+");
    officeX = Double.parseDouble(inputs[0]);
    officeY = Double.parseDouble(inputs[1]);
    System.out.print("Enter X Y coordinates for NTUC: ");
    input = sc.nextLine();
    inputs = input.trim().split("\\s+");
    ntucX = Double.parseDouble(inputs[0]);
    ntucY = Double.parseDouble(inputs[1]);
    
    //Calculate this one by one.
    totalDistance = distance(homeX,homeY, officeX, officeY); //Home to Office
    totalDistance += distance(officeX,officeY, ntucX, ntucY); //Office to NTUC
    totalDistance += distance(ntucX, ntucY, homeX, homeY); //NTUC to Home
    
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("Distance of travel is " + df.format(totalDistance));
  }
  
  // Since we will be using this quite a bit, we will make distance between any two points as a function
  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1,2));
  }
}