/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #25: PS1_Ex25_Packing.java
 * 
 * Packing Stuff Calculations? No problem!
 * 
 * 
 * Benjamin Kok Jiaming
 */

//import stuff
import java.util.*;

class Packing {
  
  public static void main(String[] args) {
    
    //declare variables
    int trayLen, trayBred, slabLen, slabBred; //declare use of lengths and breadths of the tray and slab. Len = Length, Bred = Breadth (Talking about Bread will make us hungry so yeah)
    int unusedAreaPortrait, unusedAreaLandscape, minUnusedArea; //you can declare all of these in one line, but doing it like this makes it clearer for what it is used for
    
    //Activate our scanner
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of tray: ");
    String trayStr = sc.nextLine();
    System.out.print("Enter size of slab: ");
    String slabStr = sc.nextLine();
    
    //parse our details.
    String[] trayDetail = trayStr.split("\\s+");
    String[] slabDetail = slabStr.split("\\s+");
    //in this question we assume first value of each detail to be length and second to be breadth. it is okay if this isn't the case as we are going to caclulate for both ways anyway
    trayLen = Integer.parseInt(trayDetail[0]);
    trayBred = Integer.parseInt(trayDetail[1]);
    slabLen = Integer.parseInt(slabDetail[0]);
    slabBred = Integer.parseInt(slabDetail[1]);
    //get min unused area portrait and landscape
    unusedAreaPortrait = returnUnusedAreaPortrait(trayLen, trayBred, slabLen, slabBred);
    unusedAreaLandscape = returnUnusedAreaLandscape(trayLen, trayBred, slabLen, slabBred);
    //use math.min to get the minimum unused area.
    minUnusedArea = Math.min(unusedAreaPortrait, unusedAreaLandscape);
    
    System.out.println("Minimum unused area = "+minUnusedArea);
  }
  
  //returns unused area if you put all slabs in portrait mode (breadth of slab to length of tray, length of slab to breadth of tray);
  public static int returnUnusedAreaPortrait(int trayLen, int trayBred, int slabLen, int slabBred)
  {
    //get area of tray
    int areaOfTray = returnArea(trayLen,trayBred);
    //get total number of columns and rows of slabs
    int numberOfColumns = trayLen / slabBred; //it is okay to divide the numbers like these as the remainder is essentially wasted space
    int numberOfRows = trayBred / slabLen;
    // For the sake of clarity we find the total area taken by slabs and then subtract. It is okay to do all of these in one swoop but I believe it can get confusing even for veterans.
    int areaTakenBySlab = (slabLen * numberOfRows) * (slabBred * numberOfColumns);
    return areaOfTray - areaTakenBySlab;
  }
  
  //returns unused area if you put all slabs in landscape mode (length of slab to length of tray, breadth of slab to breadth of tray)
  public static int returnUnusedAreaLandscape(int trayLen, int trayBred, int slabLen, int slabBred)
  {
    //get area of tray
    int areaOfTray = returnArea(trayLen,trayBred);
    //get total number of columns and rows of slabs
    int numberOfColumns = trayLen / slabLen; // again it is okay to divide the numbers like these as the remainder is essentially wasted space
    int numberOfRows = trayBred / slabBred;
    int areaTakenBySlab = (slabLen * numberOfRows) * (slabBred * numberOfColumns);
    return areaOfTray - areaTakenBySlab;
  }
  
  //To be honest this method may have cost me more time than doing the actual thing normally, but I just leave this here to show that methods can be used in this context
  public static int returnArea (int length, int breadth)
  {
    return length * breadth;
  }
}