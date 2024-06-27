package l12e3;

import java.util.Scanner;

//Laborator 1-2

/*
  EX 3
  Scrieți un program care citește un număr și afișează pătratul, cubul și numărul ridicat la puterea 4. 
 */

public class Ex3 {
	public static  void main( String[] args)
	{
		int n; // declararea unei variabile
		
		Scanner tastatura = new Scanner(System.in); // obiect pentru citirea valorilor variabilelor
		
		System.out.println("Introduceti un numar: "); // mesaj afisat in consola
		n = tastatura.nextInt(); // citirea valorii variabile n
		
		int patratul = n*n; // definirea variabilei pentru patratul numarului
		System.out.println("Patratul numarului " + n + " este: " + patratul); // afisarea valorii
		
		int cubul = (int)Math.pow(n, 3); // definirea variabilei pentru calculul cubului numarului
		System.out.println("Cubul numarului " + n + " este: " + cubul); // afisarea valorii
		
		int puterea4 = (int)Math.pow(n, 4); // definirea variabilei pentru ridicarea la puterea a 4-a
		System.out.println("Puterea a 4-a a numarului " + n + " este: " + puterea4); // afisarea valorii
	}

}