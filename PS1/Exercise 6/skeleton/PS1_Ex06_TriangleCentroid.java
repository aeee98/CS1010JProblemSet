/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #06: PS1_Ex06_TriangleCentroid.java
 * 
 * This program computes the centroid (G) of a triangle
 * given the coordinates of three vertices.
 * 
 * Benjamin Kok Jiaming
 */

import java.util.Scanner;
import java.text.DecimalFormat;

class TriangleCentroid {
  
  public static void main(String[] args) {
    double x1, y1, x2, y2, x3, y3;
    double xCentroid, yCentroid;
    Scanner sc = new Scanner(System.in);
    System.out.print("Coordinates of 1st vertex: ");
    x1 = sc.nextDouble();
    y1 = sc.nextDouble();
    System.out.print("Coordinates of 2nd vertex: ");
    x2 = sc.nextDouble();
    y2 = sc.nextDouble();
    System.out.print("Coordinates of 3rd vertex: ");
    x3 = sc.nextDouble();
    y3 = sc.nextDouble();
    
    xCentroid = (x1 + x2 + x3)/3;
    yCentroid = (y1 + y2 + y3)/3;
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("Coordinates of centroid = (" + df.format(xCentroid) + ", " + df.format(yCentroid) + ")");
  }
}