Problem Statement
Ram is studying in Class V and has four subjects, each subject carry 100 marks. He passed with flying colors in his exam, but when his neighbour asked how much percentage did he got in exam, he got stuck in calculation. Ram is a good student but he forgot how to calculate percentage. Help Ram to get him out of this problem.
Given four numbers a , b , c and d denoting the marks in four subjects . Calculate the overall percentage (rounded down ) Ram got in exam.
  
  Sample Input 1:
75 25 75 25

Sample Output 1:
50
  CODE IMPLEMENTATION <------------>
  
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
Scanner m = new Scanner(System.in);
int[] arr = new int[4];
int sum = 0;
for (int i= 0;i<4;i++){
arr[i] = m.nextInt();
sum += arr[i];
} 
 sum = sum/4;
 System.out.print(sum);
 }
}
