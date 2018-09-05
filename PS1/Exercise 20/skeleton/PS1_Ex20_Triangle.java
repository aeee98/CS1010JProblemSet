/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #20: PS1_Ex20_Triangle.java
 * 
 * Check the kind of triangle the object is, if it even is a triangle.
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;

class Triangle {
  
  public static void main(String[] args) {
    
    //Declare variables
    int side1,side2,side3;
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    //Standard Parse, I think I don't need to comment for this anymore, right?
    String[] inputs = input.split("\\s+");
    side1 = Integer.parseInt(inputs[0]);
    side2 = Integer.parseInt(inputs[1]);
    side3 = Integer.parseInt(inputs[2]);
    //now run a series of boolean checks to get the result.
    if (isTriangle(side1, side2, side3))
    {
      //first check if equilateral
      if (isEquilateral(side1, side2, side3))
      {
        System.out.println("Equilateral");
      }
      //then check if it is isoceles
      else if (isIsosceles(side1, side2, side3))
      {
        System.out.println("Isosceles");
      }
      //else it is definitely a scalene triangle.
      else
      {
        System.out.println("Scalene");
      }
    }
    else //is not Triangle
    {
      System.out.println("Not a triangle");
    }
  }
  
  //if length of any side is longer or equal to the sum of the other two sides, it is NOT a triangle
  //that means length of 2 sides must always be greater than the third side for it to be a triangle
  public static boolean isTriangle(int side1, int side2, int side3)
  {
    if ( ((side1 + side2) > side3) && ((side2 + side3) > side1) && ((side3 + side1) > side2) )
      return true;
    else
      return false;
  }
  
  //if all sides are equal it is equilateral
  public static boolean isEquilateral(int side1, int side2, int side3)
  {
    if ( (side1 == side2) && (side2 == side3) )
      return true;
    else
      return false;
  }
  
  //cast this after we know it is NOT equilateral.
  //if any 2 sides are equal it is isosceles
  public static boolean isIsosceles(int side1, int side2, int side3)
  {
    if ( (side1 == side2) || (side2 == side3) || (side3 == side1) )
      return true;
    else 
      return false;
  }
}