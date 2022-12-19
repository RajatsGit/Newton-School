Problem Statement
Sara has A number of Pokeballs with her and there are B pokemons in front of Sara. Considering each pokemon takes one Pokeball, your task is to tell Sara if she can catch all the pokemons or not.
Sara can catch a pokemon if she is having at least one pokeball for that pokemon.
  
  Sample Input:-
4 3

Sample Output:-
1
  
  CODE IMPLEMENTATION<--------------------------------->
  static int PokemonMaster(int A, int B){
if (A>=B)
     return 1;
else
      return 0;
}
