/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #18: PS1_Ex18_Magnitude.java
 * 
 * A pretty easy question about classifying magnitude
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;

class Magnitude {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Magnitude: ");
    double magnitude = sc.nextDouble();
    
    
    if (magnitude < 4.0)
    System.out.println("Classification: Minor");
    else if (magnitude < 6.0)
    System.out.println("Classification: Moderate");
    else if (magnitude < 6.9)
    System.out.println("Classification: Strong");
    else // magnitude >= 6.9
    System.out.println("Classification: Major");
  }
}