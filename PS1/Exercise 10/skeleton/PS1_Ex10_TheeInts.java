/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #10: PS1_Ex10_TheeInts.java
 * 
 * This program reads three positive integers,
 * prints out their digits in hundredth position.
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;

class TheeInts {
  
  public static void main(String[] args) {
    int hundredth1, hundredth2, hundredth3;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 3 positive integers: ");
    hundredth1 = getHundredth(sc.nextInt());
    hundredth2 = getHundredth(sc.nextInt());
    hundredth3 = getHundredth(sc.nextInt());
    
    System.out.println(hundredth1+ " " + hundredth2 + " " + hundredth3);
  }
  
  // Take a number and return the digit in hundredth position
  public static int getHundredth(int num) {
    return num/100 % 10;
  }
}