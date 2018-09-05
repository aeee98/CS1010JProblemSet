/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #17: PS1_Ex17_MaxInt.java
 * 
 * Simple Get max integer of 3 numbers.
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;

class MaxInteger {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int int1, int2, int3, maxInt;
    System.out.print("Enter three integers: ");
    String input = sc.nextLine();
    String[] inputs = input.split("\\s+");
    int1 = Integer.parseInt(inputs[0]);
    int2 = Integer.parseInt(inputs[1]);
    int3 = Integer.parseInt(inputs[2]);
    maxInt = getMax(int1, int2, int3);
    System.out.println("Maximum input integer is "+maxInt);
  }
  
  // Do a reference number one by one.
  //for n variables in the future with an array you probably want to do a for loop.
  public static int getMax(int num1, int num2, int num3) {
    int max;
    max = Math.max(num1, num2);
    max = Math.max(max, num3);
    return max;
  }
}