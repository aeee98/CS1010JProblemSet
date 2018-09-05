/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #07: PS1_Ex07_Investment.java
 * 
 * This program computes the amount earned given principal amount,
 * interest rate, and number of years, based on compound interest.
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;
import java.text.*;

class Investment {
  
  public static void main(String[] args) {
    int principal,rate,numYears;
    double finalAmount;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter principal amount: ");
    principal = sc.nextInt();
    System.out.print("Enter interest rate   : ");
    rate = sc.nextInt();
    System.out.print("Enter number of years : ");
    numYears = sc.nextInt();
    finalAmount = ((double)principal * (1 - Math.pow(((double)rate/100), (numYears+1))))/(1-(double)rate/100);
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("Amount = $"+df.format(finalAmount));
  }
}