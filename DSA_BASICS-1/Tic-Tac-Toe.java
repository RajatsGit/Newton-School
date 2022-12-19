Problem Statement
Rick's family and Jerry are playing Tic Tac Toe. Rules are simple:
Game is played in pairs.
If Rick plays against anyone, Rick wins.
If Jerry plays against anyone, Jerry Loses.
A game between any other players is a draw.
Given a pair of players, find who wins the game or if the game is draw.

Input
Input Contains two space separated characters denoting the players that will have the match.
R denotes Rick.
J denotes Jerry.
B denotes Beth.
M denotes Morty.
S denotes Summer.
  Sample Input 1
R S

Sample Output 1
R
 
 CODE IMPLEMENTATION <------------------------------>
  
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    char Rick = 'R';
    char Jerry = 'J';
    char Beth = 'B';
    char Morty = 'M';
    char Summer = 'S';
    Scanner sc = new Scanner(System.in);
    char x = sc.next().charAt(0);
    char y = sc.next().charAt(0);
    if (x==Rick || y==Rick){
        System.out.println(Rick);
    }
    if ((x==Beth || x==Morty || x==Summer) && (y==Beth || y==Morty || y==Summer))
    {
        System.out.println("D");
    }
     if (x==Jerry && (y==Beth || y==Morty || y==Summer)){
     System.out.println(y);
     }
     if (y==Jerry && (x==Beth || x==Morty || x==Summer)){
     System.out.println(x);
    }
}
}
