Problem Statement
There is a charity which has N people. Penny wants to donate some of her clothes to the charity in such a way that all people receive equal clothes and each individual receives more than 1 . If she has M clothes with her what is the maximum number of clothes one individual can get?
  
  Sample Input
6 20

Sample Output
3

Sample Input
8 5

Sample Output
-1
  
  CODE IMPLEMENTATION <------------------------------>
  static int Charity(int N, int M){
int k=(M/N);
if (M<(2*N))
      return -1;
if(M%N==0)
      return k;
if(M>N)
      return k;
else
      return -1;
}
