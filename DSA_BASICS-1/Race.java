Problem Statement
Naruto and Sasuke are on a S- Rank mission. Now They got bored and thought of competing in a race against each other in a horizontal plane. They decides a common spot C at which both of them will try to reach. Whoever reaches first wins the race, both of them run at the same speed.
Given initial positions of Naruto and Sasuke as A and B recpectively.
you need to tell which of them will win the race. If Naruto wins print "N" ( without the quotes ), if Sasuke wins print "S" ( without the quotes ).
if both of them reach the common spot at the same time, print "D" (for draw, without the quotes ).
  
  Sample Input
1 2 3

Sample Output
S

Sample Input
1 3 2

Sample Output
D

CODE IMPLEMENTATION <-------------------------->
  static char Race(int A,int B,int C){
//if ((A==B) || (Math.abs(A-C)==Math.abs(B-C)))
//return 'D';
if (Math.abs(A-C)>Math.abs(B-C))
return 'S';
if (Math.abs(A-C)<Math.abs(B-C))
return 'N';
else 
return 'D';
}
