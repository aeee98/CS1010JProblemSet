/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #21: PS1_Ex21_BMI.java
 * 
 * Tell them if they need to lose weight, gain weight or maintain their weight!
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;

class BMI {
  
  public static void main(String[] args) {
    
    int gender, bodyType;
    double weight, height;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your gender (0 for female, 1 for male): ");
    gender = Integer.parseInt(sc.nextLine());
    System.out.print("Enter your weight (kg) and height (m): ");        
    String weightHeightStr = sc.nextLine();
    //parse the weight and height into the variables
    String[] weightHeightArr = weightHeightStr.split("\\s+");
    weight = Double.parseDouble(weightHeightArr[0]);
    height = Double.parseDouble(weightHeightArr[1]);
    bodyType = bodyType(gender, weight, height);
    
    //Switch Statements would make the most sense here.
    switch (bodyType)
    {
      case -1: System.out.println("Stuff yourself with more food!");
      break;
      case 0: System.out.println("Great! Maintain it!");
      break;
      case 1: System.out.println("Time to join the gym!");
      break;
      default: System.out.println("Error!");
    }
  }
  
  // Based on a table, find the body type.
  // Note : -1 = underweight, 0 = acceptable, 1 = overweight
  public static int bodyType(int gender, double weight, double height) {
    double BMI = weight / Math.pow(height,2);
    if (gender == 0) //female
    {
      if (BMI > 24)
        return 1; //overweight
      else if (BMI > 19)
        return 0; //acceptable
      else //weight <= 19
        return -1; //underweight
    }
    else if (gender == 1) //male
    {
      if (BMI > 25)
        return 1; //overweight
      else if (BMI > 20)
        return 0;
      else 
        return -1;
    }
    else //You legit made an error and type a wrong digit in gender
      return -999;
  }
}