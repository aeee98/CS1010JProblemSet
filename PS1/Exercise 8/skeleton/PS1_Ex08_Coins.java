/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #08: PS1_Ex08_Coins.java
 * 
 * Min-max coins in your wallet?
 * 
 * 
 * Benjamin Kok Jiaming
 */

import java.util.*;

class Coins {
  
  public static void main(String[] args) {
    int totalCents, coinCount = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter amount in cents: ");
    totalCents = sc.nextInt();
    //We will run down the coin breakdown one by one.
    //I will use for-loop and arrays to do this elegantly. However, there is a longer way to do it without using these items (as for-loop is not taught yet and I kinda cheated by knowing these)
    int[] coinList = {100, 50, 20, 10, 5, 1};
    for(int i = 0; i < coinList.length; i++)
    {
      int numberOfCoinsUsedInIteration = totalCents/coinList[i];
      coinCount += numberOfCoinsUsedInIteration;
      totalCents -= (numberOfCoinsUsedInIteration)*coinList[i];
    }
    System.out.println("Minimum number of coins needed: "+coinCount);
  }
}