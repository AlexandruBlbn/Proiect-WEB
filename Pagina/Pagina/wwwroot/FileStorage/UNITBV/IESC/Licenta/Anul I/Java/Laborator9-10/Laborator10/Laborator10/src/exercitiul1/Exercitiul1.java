package exercitiul1;

import java.util.Arrays;
import java.util.Scanner;

// Laborator 10
// Tratarea exceptiilor

/*
 Exista 2 tipuri de erori: de compilare (de scriere) si de executie
 Erorile se corecteaza folosind procedura de tratare a exceptiilor:
 	- throws
 		void metodaMea() throws ArrayIndexOutOfBoundsException, ArithmeticException
 		{
 		...
 		}
 		
 	- try - catch - finally
 		void metodaMea()
 		{
	 		...
	 		try
	 		{
		 		int a = 0;
		 		int b = 5/a;
	 		}
	 		catch(ArithmeticException e)
	 		{
	 			System.out.println(e);
	 		}
	 		catch(Exception e) // superclasa Exception contine toate celelalte tipuri de exceptii
	 		{
	 		....
	 		}
	 		//finally nu este obligatoriu, si codul se executa indiferent daca a aparut sau nu eroare
	 		finally
	 		{
	 		.....
	 		}
	 	}
 */

public class Exercitiul1 {

	public static void main(String[] args) {
		/*
		 	EX1. Creați un program care definește un șir de caractere și 
		5 numere întregi. Inițializați toate elementele tabloul cu valoarea 1, 
		respectiv șirul de caractere cu mesajul „Laboratorul 10”.
		Citiți valori de la tastatură pentru toate aceste elemente. 
		Asigurați-vă că indiferent de valorile introduse de utilizator orice 
		posibilă eroare va fi tratată.
		Afișați valorile tabloului și a șirului de caractere indiferent dacă 
		s-a produs sau nu o eroare.
		 */
		
		// definire variabile
		String str;
		int tab[] = new int[5];
		
		// initializare valori
		str = "Laboratorul 10";
		Arrays.fill(tab, 1);
		
		try {
			// citire valori
			Scanner t = new Scanner(System.in);
			System.out.println("Introduceti un sir:");
			str = t.nextLine();
			System.out.println("Introduceti 5 nr:");
			for(int i=0; i<tab.length; i++)
			{
				tab[i] = t.nextInt();
			}
		}
		catch(Exception e)
		{
			System.out.println("Eroarea aparuta: " + e);
		}
		
		finally {
			// afisare valori
			System.out.println(str);
			for(int i=0; i<5; i++)
			{
				System.out.print(tab[i] + " ");
			}
		}
	}

}
