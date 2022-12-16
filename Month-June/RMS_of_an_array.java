
Given an array A of size N. You need to find the root mean square (RMS) of the array i. e you first need to square all values of array and take its mean. 
Then you need to return the square root of mean. Print the answer with precision upto 6 decimal places.

Sample Input 1:
4
1 2 3 4

Output:
2.738613
    
Explanation:
Sum of squares = 1 + 4 + 9 + 16 = 30
Mean = 30 / 4 = 7.5
Taking square root of 7.5 gives 2.738613

// CODE IMPLEMENTATION <---->
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
  double sum = 0;
  Scanner t = new Scanner(System.in);
  int n = t.nextInt();
  double[] array = new double[n];
  for(int i=0;i<n;i++){
    array[i] = t.nextFloat();
    sum = (array[i]*array[i])+sum;
  }
  sum = sum/n;
  double rms = Math.sqrt(sum);
  System.out.format("%.6f", rms);
    }
}
