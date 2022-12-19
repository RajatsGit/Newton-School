Problem Statement
Given a year(an integer variable) as input, find if it is a leap year or not.
Note: Leap year is the year that is multiple of 4.But, multiples of 100 which are not multiples of 400 are not leap years.
  
  Sample Input:
2000

Sample Output:
YES

Sample Input:
2003

Sample Output:
NO

Sample Input:
1900

Sample Output:
NO

CODE IMPLEMENTATION <-------------------------------->
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    long l = sc.nextInt();
    if(l%4==0 && l%100!=0 || l%400==0){     // This is the logic.....
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
    }
}
