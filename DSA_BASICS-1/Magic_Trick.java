Problem Statement
Sara is trying a new magic trick on you, The magic trick goes in 6 steps:-
1. Think of a number X(don't tell Sara)
2. Add A(Given by Sara) to it.
3. Double the sum in your mind.
4. Add an even number B(Given by Sara) to it.
5. Half the amount
6. Subtract the initial number which you had taken from the sum
After this Sara will tell the resulting amount without knowing the initial number, can you print the result for her?
                       
Sample Input:-
3 4

Sample Output:-
5

                       CODE IMPLEMENTATION <------------------------->
                       
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 5;
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a>=1 && b<=1000 && (b%2==0)){
        int sum = (((x+a)*2)+b)/2;
        int z = sum-x;
        System.out.print(z);
    }
    }
}
