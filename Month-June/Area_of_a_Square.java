Problem Statement
Given a side of a square, your task is to calculate its area.

Sample Input:-
3

Sample Output:-
9

CODE IMPLEMENTATION <------------>  
import java.io.*; // for handling input/output
import java.util.*;
import java.util.Scanner;
// contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
  int num, area;
  Scanner j = new Scanner(System.in);
  num = j.nextInt();
  area = num*num;
  if(num >= 1 && num <= 100)
   {   
      System.out.print(area);
   }
  }
}
