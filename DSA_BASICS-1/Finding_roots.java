Problem Statement
Write a program to find roots of a quadratic equation.
  
  Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25+i2.22
-0.25-i2.22
  
  CODE IMPLEMENTATION <-------------------------->
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
      double a, b, c;
        double root1, root2, imaginary, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = (b * b) - (4 * a *c);
        if(d > 0)
        {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(String.format("%.2f",root1));
            System.out.println(String.format("%.2f",root2));
        }
        else if(d == 0)
        {
            root1 = root2 = -b / (2 * a);
            //System.out.println(+Math.round(root1 * 100.0) / 100.0);
            //System.out.println(+Math.round(root2 * 100.0) / 100.0);
            System.out.println(String.format("%.2f",root1));
            System.out.println(String.format("%.2f",root2));
        }
        else if(d<0)
        {

            root1 = root2 = -b / (2 * a);
            imaginary = Math.sqrt(-d ) / (2 * a);
             System.out.println((+Math.round(root1 * 100.0) / 100.0) + "+"+"i" +Math.round(imaginary * 100.0) / 100.0);
             System.out.println((+Math.round(root2 * 100.0) / 100.0) + "-"+"i" +Math.round(imaginary * 100.0) / 100.0);
        }
    }
}
