Problem Statement
Some Data types are given below:-
Integer
Long
float
Double
char
Your task is to take input in the given format and print them in the same order.
  
  Sample Input:-
2
2312351235
1.21
543.1321
c

Sample Output:-
2
2312351235
1.21
543.1321
c

CODE IMPLEMENTATION <------------------>
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long b = sc.nextLong();
    float c = sc.nextFloat();
    double d = sc.nextDouble();
    char e = sc.next().charAt(0);
    System.out.println(a);
    System.out.println(b);
    System.out.println( String.format("%.2f",c));
    System.out.println( String.format("%.4f",d));
    System.out.println(e);
    }
}
