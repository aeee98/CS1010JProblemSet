/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #04: PS1_Ex04_Hypotenuse.java
 * 
 * This program calculates the hypotenuse for a right angle
 * triangle with known sides a and b.
 * 
 * Benjamin Kok Jiaming
 */

import java.util.Scanner;

class Hypotenuse {
  
  public static void main(String[] args) {
    double a, b, c;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a and b: ");
    a = sc.nextDouble();
    b = sc.nextDouble();
    
    c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    
    System.out.println("c = " + c);
  }
}