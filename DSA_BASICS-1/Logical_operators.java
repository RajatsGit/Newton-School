Problem Statement
Given two integers a and b, your task is to check following conditions:-
1. If a <= 10 and b >= 10 (Logical AND).
2. Atleast one from a or b will be even (Logical OR).
3. if a is not equal to b (Logical NOT).
  
  Sample Input:-
3 12
Sample Output:-
true true true
Explanation
So a = 3 and b = 12, so a<=10 and b>=10 hence first condition true, a is not even but b is even so atleast one of them is even hence true, third a != b which is also true hence the final output comes true true true.

Sample Input:-
10 10
Sample Output:-
true true false
  
  
  CODE IMPLEMENTATION <----------------------->
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   String ad = (((a>=1)&&(a<=10)) && ((b>=10)&&(b<=100)))? "true " : "false ";
   System.out.print(ad);
   String am = ((a%2==0)||(b%2==0))?"true ":"false ";
   System.out.print(am); 
   String as = (a!=b)?"true ":"false ";
   System.out.print(as);
}
}
