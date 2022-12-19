Problem Statement
Given an 8*8 empty chessboard in which a knight is placed at a position (X, Y). Your task is to find the number of positions in the chessboard knight can jump into in a single move .

Note:- Rows and Columns are numbered through 1 to N.
  Sample input:-
4 5

Sample Output:-
8

Explanation:-
Positions:- (3, 3), (5, 3), (3, 7), (5, 7), (6, 6), (6, 4), (2, 6), (2, 4)

Sample input:-
1 1

Sample Output:-
2

Explanation:-
Positions:- (3, 2), (2, 3)
  
  CODE IMPLEMENTATION <-------------------------->
  static int Knight(int X, int Y){
int Z[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
int A[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
 
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int x = X + Z[i];
            int y = Y + A[i];
            if (x >= 1 && y >= 1 && x < 8 && y < 8)
                count++;
        }
 
        // Return number of possible moves
        return count;
    }
