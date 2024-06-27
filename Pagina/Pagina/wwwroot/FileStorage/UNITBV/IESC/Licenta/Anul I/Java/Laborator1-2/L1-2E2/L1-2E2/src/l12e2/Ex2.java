package l12e2;

import java.util.Scanner;

//Laborator 1-2

/*
  EX 2
  Scrieți un program care cere utilizatorului un număr reprezentând o rază de cerc și afișează 
  aria și circumferința cercului și volumul și aria sferei de rază specificată. 
  Se va folosi constanta PI a clasei Math (Math.PI).
 */

public class Ex2 {

	public static void main(String[] args) {

		double raza; // declararea unei variabile pentru raza
		
		Scanner tastatura = new Scanner(System.in); // obiect pentru citirea variabilelor
		
		System.out.println("raza = "); // mesaj afisat in consola
		raza = tastatura.nextDouble(); // citirea valorii variabilei 
		
		double aria = Math.PI * raza * raza; // definirea variabilei pentru arie
		System.out.println("Aria este: " + aria); // afisarea

		double perimetru = 2 * Math.PI * raza; // definirea variabilei pentru circumferinta
		System.out.println("Circumferinta este: " + perimetru); // afisarea
		
		double arieS = 4 * Math.PI * raza * raza; // definirea variabilei pentru aria sferei
		System.out.println("Aria sferei este: " + arieS); // afisarea
		 
		double volumS = 4 * Math.PI * Math.pow(raza, 3) /3; // definirea variabilei pentru volumul sferei
		System.out.println("Volumul sferei este: "+ volumS); // afisarea
	}

}
