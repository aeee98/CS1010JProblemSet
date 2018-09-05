/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #05: PS1_Ex05_CompositeShape.java
 * 
 * This program computes the area of the given composite shape.
 * 
 * Benjamin Kok Jiaming
 */

import java.util.Scanner;
import java.text.DecimalFormat;  // to format real number output

class CompositeShape {
  
  public static void main(String[] args) {
    double length, width, area;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of rectangle: ");
    length = sc.nextDouble();
    System.out.print("Enter width of rectangle: ");
    width = sc.nextDouble();
    //calculate area of rectangle first
    area = length * width;
    //add semicircle (radius of half length)
    area += 0.5 * Math.PI * Math.pow(length/2, 2);
    DecimalFormat df = new DecimalFormat("0.0000");//4 decimal places
    System.out.println("Area = "+df.format(area));
  }
}
