/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #14: PS1_Ex14_AM_GM.java
 * 
 * Arithatic means and Geometric Means!
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;
import java.text.*;

class Means {
  
  public static void main(String[] args) {
    
    int a, b, c;
    double amean, gmean;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter 3 positive integers: ");
    String input = sc.nextLine();
    String[] inputs = input.trim().split("\\s+");
    a = Integer.parseInt(inputs[0]);
    b = Integer.parseInt(inputs[1]);
    c = Integer.parseInt(inputs[2]);
    
    amean = computeAM(a, b ,c);
    gmean = computeGM(a, b, c);
    
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("Arithmetic mean = " + df.format(amean));
    System.out.println("Geometric mean = " + df.format(gmean));
  }
  
  // Compute arithmatic mean (aka (a + b + c)/3
  public static double computeAM(int a, int b, int c) {
    
    return ((double)(a+b+c))/3;
  }
  
  // <Write a short description of the method here>
  public static double computeGM(int a, int b, int c) {
    
    return Math.cbrt((double)(a * b * c));
  }
}