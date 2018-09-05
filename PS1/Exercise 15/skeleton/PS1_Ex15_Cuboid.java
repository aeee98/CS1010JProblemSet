/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #15: PS1_Ex15_Cuboid.java
 * 
 * A simple application to get surface area and diagonal of any given cuboid
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;
import java.text.*;
import java.lang.*;

class Cuboid {
  
  public static void main(String[] args) {

    int length, width, height, surfaceArea;
    double diagonal;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter length: ");
    length = sc.nextInt(); 
    System.out.print("Enter width : ");
    width = sc.nextInt();
    System.out.print("Enter height: ");
    height = sc.nextInt();
    
    surfaceArea = computeSurfaceArea(length,width,height);
    diagonal = computeDiagonal(length, width, height);
    
    System.out.println("Surface area = "+surfaceArea);
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("Diagonal = " + df.format(diagonal));
  }
  
  // Computes the surface area of the cuboid
  public static int computeSurfaceArea(int length, int width, int height) {
    //Surface Area is simple. Because it is a cuboid, there are 2 of 3 kinds of planes: length x width, length x height and width x height.
    return (length * width + length * height + width * height) * 2;
  }
  
  // Returns the diagonal of the cuboid
  public static double computeDiagonal(int length, int width, int height) {
    //Now this is a little tricky. Thankfully this is not a oddshape so we can safely use the basic diagonal formula.
    //first we find the diagonal of the base via Pythagoras Theorem
    double baseDiag = Math.sqrt(Math.pow(length,2) + Math.pow(width,2));
    //then using this diagonal, we find the diagonal when comparing the height.
    double finalDiag = Math.sqrt(Math.pow(baseDiag,2) + Math.pow(height,2));
    return finalDiag;
  }
}