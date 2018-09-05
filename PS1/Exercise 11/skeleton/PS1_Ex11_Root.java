/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #11: PS1_Ex11_Root.java
 * 
 * Root of a Linear Equation.
 * 
 * Benjamin Kok Jiaming
 */


import java.util.*;
import java.text.*;

class Root {
  
  public static void main(String[] args) {
    double a, b, c, root;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter coefficients (a b c): ");
    String input = sc.nextLine();
    String[] inputs = input.trim().split("\\s+");
    a = Double.parseDouble(inputs[0]);
    b = Double.parseDouble(inputs[1]);
    c = Double.parseDouble(inputs[2]);
    root = getRoot(a,b,c);
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("Bigger root is "+df.format(root));
    
  }
  
  // Take the three coefficients and return the bigger root
  public static double getRoot(double a, double b, double c) {
    double sq, constant;
    double root1, root2;
    //We need to use Complete the Square method to get the answer programmatically as this is the easiest way to utilise all 3 variables.
    //Method source: http://www.sosmath.com/algebra/quadraticeq/complsquare/complsquare.html
    //First we need to make sure the x^2 coefficient = 1, as such, we need to divide the x coefficient and constant by a.
    b /= a;
    c /= a;
    //At this point we can move c over to the other side. We will call the resultant sq.
    sq = c * -1;
    //In order to generate a perfect square we add c^2 to both sides of the equation. Since c will be used we will just add the power to the other side instead
    
    sq += Math.pow(b/2,2); //num has been changed so it is safe to do this.
    //from there we can do (x+b)^2 = sq
    //(x+b) = +/- sqrt sq
    // x = -b + sqrt sq or -b - sqrt sq;
    root1 = (0 - b/2 + Math.sqrt(sq));
    root2 = (0 - b/2 - Math.sqrt(sq));

    return Math.max(root1, root2);
  }
}