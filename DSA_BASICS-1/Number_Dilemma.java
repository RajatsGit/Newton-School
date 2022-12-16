Problem Statement
Nobita likes a number if it is stored in an integer while Doraemon likes it when it is stored in a String. Your task is to write a code so that they can easily convert an integer to a string or a string to an integer whenever they want.
  
Return an integer in StringToInt() while return a integer integer in IntToString(). The driver code will print "Nice Job" if your code is correct otherwise "Wrong answer".
  
Sample Input:-
12

Sample Output:-
Nice Job

CODE IMPLEMENTATION <----------->
  
  static int StringToInt(String S){
int M = Integer.valueOf(S);
return M;
}

static String IntToString(int N){
String D = String.valueOf(N);
return D;
}
