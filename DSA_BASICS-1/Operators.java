Problem Statement
Given two integers a and b, your task is to calculate and print the following four values:-
a+b
a-b
a*b
a/b

Sample Input:
15 3
Sample Output:
18
12
45
5
Explanation
First operation is a+b so 15+3 = 18
Second Operation is a-b so 15-3 = 12
Third Operation is a*b so 15*3 = 45
Fourth Operation is a/b so 15/3 = 5
  
  CODE IMPLEMENTATION <------------->
  
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if ((b>=1 && b<=a) && (a>=b && a<=1000))
    {
    int sum , sub, mult, div;
    sum = a+b;
    System.out.println(sum);
    sub = a-b;
    System.out.println(sub);
    mult = a*b;
    System.out.println(mult);
    div = a/b;
    System.out.println(div);
    }
    }
}
