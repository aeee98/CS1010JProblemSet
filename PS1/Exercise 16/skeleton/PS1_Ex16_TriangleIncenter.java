/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #16: PS1_Ex16_TriangleIncenter.java
 * 
 * Advanced Geometry (incenter of a Triangle!)
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;
import java.text.*;
import java.lang.*;

class TriangleIncenter {
  
  public static void main(String[] args) {
    double xa, ya, xb, yb, xc, yc;
    double lengthAB, lengthBC, lengthAC, totalLength;
    double incenterX, incenterY;
    String input;
    String[] inputs;
    Scanner sc = new Scanner(System.in);
    
    //get coordinates!
    System.out.print("Coordinates of 1st vertex: ");
    input = sc.nextLine();
    inputs = input.trim().split("\\s+");
    xa = Double.parseDouble(inputs[0]);
    ya = Double.parseDouble(inputs[1]);
    System.out.print("Coordinates of 2nd vertex: ");
    input = sc.nextLine();
    inputs = input.trim().split("\\s+");
    xb = Double.parseDouble(inputs[0]);
    yb = Double.parseDouble(inputs[1]);
    System.out.print("Coordinates of 3rd vertex: ");
    input = sc.nextLine();
    inputs = input.trim().split("\\s+");
    xc = Double.parseDouble(inputs[0]);
    yc = Double.parseDouble(inputs[1]);
    
    //now that we have gotten all the coordinates it is time to find out the length of each line;
    lengthAB = computeLength(xa,ya,xb,yb);
    lengthBC = computeLength(xb,yb,xc,yc);
    lengthAC = computeLength(xa,ya,xc,yc);
    
    totalLength = lengthAB + lengthBC + lengthAC;
    
    //consider an example of a triangle, the side opposite vertice A would be side BC
    //thus we can make a conclusion that L(A)xa = length of BC(xa)
    
    incenterX = ((xa * lengthBC) + (xb * lengthAC) + (xc * lengthAB))/totalLength;
    incenterY = ((ya * lengthBC) + (yb * lengthAC) + (yc * lengthAB))/totalLength;
    //print out answer
    DecimalFormat df = new DecimalFormat("0.00"); //2 decimal places
    System.out.println("Coordinates of incenter = (" + df.format(incenterX) +  ", " + df.format(incenterY) + ")");
  }
  
  // Compute the length of any line given 2 coordinates
  // We will use Pythagoras' Theorem to find out any line's length.
  public static double computeLength(double x1, double y1, double x2, double y2) {
    // the length is the tangent of x1+x2 and y1+y2, making a right-angled triangle perfect for this theorem to work.
    return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));  
  }
}