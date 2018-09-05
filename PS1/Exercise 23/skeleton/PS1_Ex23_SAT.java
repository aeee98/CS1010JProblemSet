/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #23: PS1_Ex23_SAT.java
 * 
 * Attempt 5 : Assuming PE1 setting
 * All comments debating code are mostly checking if shortcuts can actually be used in examinations or coding-style points will be deducted for bad structure.
 * 
 * Benjamin Kok Jiaming
 */

//import the scanner. Note that .* imports everything in the division before. While only scanner is needed, this code
//saves time on us if we need more java.util items. Also less things to memorise!
import java.util.*;
import java.text.*;

class SAT {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    // Instantiate Variables.
    int satVerbal, satMaths, satWriting, percentile;
    double IQ;
    //Since we want two decimal places for IQ, we declare DecimalFormat. We can actually also do this in computeIQScore
    //as well, but I prefer to keep the full value in case more calculations are needed and only show the concatted results on console.
    DecimalFormat df = new DecimalFormat("#0.00");
    // Ask user to post scores
    System.out.print("Enter scores: ");
    //Take scores
    satVerbal = sc.nextInt();
    satMaths = sc.nextInt();
    satWriting = sc.nextInt();
    
    //use the functions to compute IQ and percentile.
    percentile = computePercentile(satVerbal, satMaths, satWriting);
    IQ = computeIQScore(satVerbal, satMaths);
    
    //Show percentile
    System.out.println("The SAT score is in the " + percentile + " percentile.");
    System.out.println("The IQ score is " + df.format(IQ));
    
    //Not really elegant shortcut but the following code also works:
    /*
     * System.out.println("The SAT score is in the " +computePercentile(satVerbal, satMaths, satWriting)+ " percentile.");
     * System.out.println("The IQ score is " + df.format(computeIQScore(satVerbal, satMaths);));
     */
    
    //Check if you are amazing.
    if ((satVerbal > 600 && satMaths > 600 && satWriting > 600) || IQ >=120)
    {
      System.out.println("Wow, this is amazing!");
    }
  }
  
  //Compute the percentile via comparing to table method
  public static int computePercentile(int verbal, int maths, int writing) {
    //do if-else with >= function.
    int satScore = verbal + maths + writing;
    if (satScore >= 2200)
      return 99;
    else if (satScore >= 2000)
      return 95;
    else if (satScore >=1500)
      return 50;
    else return 10; //satScore < 1500
  }
  
  //calculate the score
  public static double computeIQScore(int verbal, int maths) {
    //IQ = (0.095 * Maths) + (0.003 * Verbal) + 50.241
    double finalIQ = (0.095 * maths) + (0.003 * verbal) + 50.241;
    return finalIQ;
    //altenatively
    // return ((0.095 * maths) + (0.003 * verbal) + 50.241);
  }
}