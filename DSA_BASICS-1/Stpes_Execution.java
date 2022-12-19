Problem Statement
Take 4 digit number input from the user, add 8 to it and then divide it by 3(Only take integer part) Now, the modulus of that number is taken with 5 and then multiply the resultant value by 5. Display the final result.
  
  Sample Input :
2345

Sample Output :
20
  
  CODE MPLEMENTATION <----------------------->
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num>=1000 && num<=9999){
        int x = (num+8)/3;
        int y = x%5;
        int z = y*5;
        System.out.println(z);
    }
    }
}
