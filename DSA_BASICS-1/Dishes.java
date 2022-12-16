Problem Statement
Sheldon and Leonard are gone for lunch but none of them have money so they decided to wash dishes. In total, they washed T dishes from which N dishes are washed by Leonard. Now Leonard wants to know the number of dishes Sheldon washed. Help him to find it.
  
  Sample Input:-
3 6

Sample Output:-
3
  
  CODE IMPLEMENTATION <--------------------------->
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int t = sc.nextInt();
     if (n>=1 && n<=t && t>=n && t<=1000){
      int s = t-n;
      System.out.println(s);  
     }
    }
}
