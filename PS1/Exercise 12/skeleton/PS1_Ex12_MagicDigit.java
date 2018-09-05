/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #12: PS1_Ex12_MagicDigit.java
 * 
 * Digits are magical...
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;

class MagicDigit {
  
  public static void main(String[] args) {
    
    int num, magicNum;
    Scanner sc = new Scanner(System.in);
    //enter 1st num
    System.out.print("Enter 1st number: ");
    num = sc.nextInt(); 
    magicNum = getMagic(num);
    System.out.println("Magic digit = "+magicNum);
    System.out.print("Enter 2nd number: ");
    num = sc.nextInt();
    magicNum = getMagic(num);
    System.out.println("Magic digit = "+magicNum);
  }
  
  // Take a number and return the magic digit
  public static int getMagic(int num) {
    //get 10000 place, 100 place and 1 place by using num/placing modulo 10
    int magic1 = num/10000 % 10; 
    int magic2 = num/100 % 10;
    int magic3 = num % 10;
    int finalMagic = magic1 + magic2 + magic3;
    return (finalMagic % 10);
  }
}