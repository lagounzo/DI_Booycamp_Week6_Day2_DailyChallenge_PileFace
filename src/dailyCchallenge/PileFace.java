/**
 * @param N'ZO LAGOU PRIVAT N'GUESSAN
 */




/**
 * Le code ci-dessous choisit un nombre aléatoire qui est 0 ou 1 et stocke le résultat dans la variable n.

Ajoutez des instructions if pour que le programme imprime au hasard "Pile" ou "Tail".

Exécutez le programme plusieurs fois pour vous assurer que vous obtenez finalement les deux résultats.
 */




package dailyCchallenge;

import java.util.Random;

public class PileFace {

	public static void main(String[] args) {
		 Random rand = new Random();

		    // pick a random number between 0 and 1:
		    int n = rand.nextInt(2);
		    if(n==0){
		      System.out.println("Heads " + n);
		  }else 
		  if(n==1)
		  {
		    System.out.println("Tails " + n);
		  }
	}
}
