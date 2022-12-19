Problem Statement
Sara has an MCQ exam containing 100 questions this sunday but she isn't prepared. She came to know that in her exam
- >P number of Questions will have A as the correct option
- >Q number of Questions will have B as the correct option
- >R number of Questions will have C as the correct option
- >S number of Questions will have D as the correct option
Sara doesn't know the order of the questions. If Sara filled the MCQs optimally (same option for each question) using the above information what will be the maximum marks she can get.
  
  Sample Input:-
8 10 20 62

Sample Output:-
62
  
  CODE IMPLEMENTATION <----------------------------->
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    int s = sc.nextInt();
   int sum = (p+q+r+s);
   if (sum == 100)
   {
       int num = Math.max(p,q);
       int lum = Math.max(r,s);
       int comp = Math.max(num,lum);
       System.out.println(comp);
   }

    }
}
