package l3Teorie;

import java.util.Scanner;

//Laborator 3
//Instructiuni de decizie/selectie

/*
 	IF
 	  - evalueaza o conditie
 	  - daca expresia este adevarata => se executa un bloc de instructiuni
 	  - daca expresia este falsa => se omite 
 	  
 	  if(cond)
 	  {
 	  	bloc de instructiuni;
 	  }
 	  
	- clauza ELSE
 	  - se executa daca expresia este falsa
 	  
 	  if(cond)
 	  {
 	  	bloc de instructiuni DA;
 	  }
 	  else
 	  {
 	  	bloc de instructiuni NU;
 	  }
 	  
 	  - dupa conditie nu se pune ;
*/

/*
 	SWITCH
 		- alternativa pentru o serie de if-else-uri
 		- se executa pana la break;
 		- default se foloseste pentru cazurile neincluse
 		
 		switch(cond)
 		{
 		case caz1:
 			{bloc de instructiuni;}
 			break;
 		case caz2:
 			{bloc de instructiui;}
 			break;
 		....
 		default:
 			{bloc de instructiuni;}
 		}
*/

public class Teorie {

	public static void main(String[] args) {

		System.out.println("Exemplificare IF - calculul modulului unui numar");
		
		int n; // declararea unei variabile
		Scanner tastatura = new Scanner(System.in); // definirea unui obiect se tip Scanner
		
		// citirea numarului n
		System.out.println("Introduceti un nr:");
		n = tastatura.nextInt();
		
		// daca valoarea este negativa, schimba semnul
		if(n < 0)
		{
			n = -n;
		}
		// afisarea valorii lui n
		System.out.println("n = " + n);
		
		
		
		System.out.println("Exemplificare IF-ELSE - gasiti maximul dintre doua numere");
		
		int a,b; // declararea variabilelor
		
		// citirea variabilelor
		System.out.println("a = ");
		a = tastatura.nextInt();
		System.out.println("b = ");
		b = tastatura.nextInt();
		
		// declararea variabilei max
		int max;
		
		// calcularea maximului
		if(a>b)
		{
			max = a;
		}
		else
		{
			max = b;
		}
		// afisarea maximului
		System.out.println("Max : " + max);
		
		
		
		System.out.println("Exemplificare IF-ELSE-IF - compararea a doua numere");
		
		// compararea numerelor a si b folosind clauza else-if
		if(a>b)
		{
			System.out.println("a mai mare decat b");
		}
		else if(a == b)
		{
			System.out.println("a = b");
		}
		else
		{
			System.out.println("a mai mic decat b");
		}
		
		
		
		System.out.println("Exemplificare SWITCH - crearea unui meniu");
		
		// declararea variabilei
		String optiune;
		
		// citirea variabilei 
		System.out.println("Introduceti o litera:");
		tastatura.nextLine(); // se face o citire in gol pentru a prelua datele corect
		optiune = tastatura.nextLine();
		
		int nr = 0; // definirea variabilei din meniu
		
		// la introducerea unei litere se realizeaza un anumit caz
		switch(optiune)
		{
		case "a":
			nr = tastatura.nextInt();
			break;
		case "b":
			System.out.println("nr = " + nr);
			break;
		case "e":
			System.out.println("La revedere!!");
			break;
		default:
			System.out.println("Nu ati introdus o optiune valida!");
		}
		
	}

}
