Problem Statement
Given three integers A, B, and C, your task is to print the sum of these three integers.
  
  Sample Input
1 2 3

Sample Output:-
6
  
  CODE IMPLEMENTATION <----------------->
  
 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if ((a>=1 && a<=100) && (b>=1 && b<=100) && (c>=1 && c<=100))
    {
        int sum = a+b+c;
        System.out.println(sum);
    }
    }
}
