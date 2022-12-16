Problem Statement
Nobita wants to score well in his upcoming test, but he is not able to solve the simple division problems, seeing Nobita's determination Doraemon gives him a gadget that can do division problems easily but somehow Nobita deleted the internal program which calculates the division.
As an excellent coder, Nobita came to you for help. Help Nobita to write a code for his gadget.
You will be given two integers D and Q, you have to print the value of D/Q rounded down .
  
  
Sample Output:-
1

Explanation:-
8/5 = 1.6 = 1(floor)
  
  CODE IMPLEMENTATION <-------------------------->
  
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int q = sc.nextInt();
    if (d>=0 && q>0 && q<=100){
        int div = d/q;
        System.out.println(div);
    }  
    else{
        System.out.println("-1");
    }  
    }
}
