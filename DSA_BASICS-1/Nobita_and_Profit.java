Problem Statement
Nobita wants to become rich so he came up with some ideas. Nobita buys some gadgets from the future at a price of C and sells them at a price of S to his friends. Now Nobita wants to know how much he gains by selling 1 gadget. As we all know Nobita is weak in maths help him to find the profit he gets

Sample Input:-
3 5

Sample Output:-
2

Sample Input:-
9 15

Sample Output:-
6
  
  CODE IMPLEMENTATION <-------------->
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int s = sc.nextInt();
        int profit = s-c;
        System.out.println(profit);
    }
}
