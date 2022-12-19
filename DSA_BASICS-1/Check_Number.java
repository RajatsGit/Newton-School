Problem Statement
Write a program to check whether a number is positive, negative or zero using switch case.
  
  Sample Input :
13

Sample Output :
Positive

Sample Input :
-13

Sample Output :
Negative

CODE IMPLEMENTATION <-------------------------->
  
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a>0)
        System.out.println("Positive");
      else if(a<0)
        System.out.println("Negative");
      else
        System.out.println("Zero");
      }
}
