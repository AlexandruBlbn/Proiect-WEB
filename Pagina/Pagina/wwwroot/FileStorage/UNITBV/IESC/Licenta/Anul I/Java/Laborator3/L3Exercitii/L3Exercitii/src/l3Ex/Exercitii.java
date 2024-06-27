package l3Ex;

import java.util.Scanner;

// Laborator 3

public class Exercitii {
	
	/*
	  EX 1 
	  Scrieți un program care cere utilizatorului 3 numere întregi.
		•	Dacă toate cele 3 numere sunt pozitive, calculați maximul dintre ele.
		•	Dacă toate cele 3 numere sunt negative, calculați minimul dintre ele.
		•	Altfel, calculați produsul celor 3 numere.
	*/
	public static void ex1()
	{
		int a,b,c;
		int max, min, produs;
		
		//obiectul de tip Scanner pentru citire
		Scanner tastatura = new Scanner(System.in);
		
		//citirea numerelor
		System.out.print("a = ");
		a = tastatura.nextInt();
		System.out.print("b = ");
		b = tastatura.nextInt();
		System.out.print("c = ");
		c = tastatura.nextInt();
		
		if(a>0 && b>0 && c>0)
		{
			//daca numerele sunt pozitive, calculam maximul
			max = Math.max(a, Math.max(b, c));
			System.out.println("Maximul este " + max);
		}
		else if(a<0 && b<0 && c<0)
		{
			//daca numerele sunt negative, calculam minimul
			min = Math.min(a, Math.min(b, c));
			System.out.println("Minimul este " + min);
		}
		else
		{
			//altfel, calculam produsul
			produs = a * b * c;
			System.out.println("Produsul este " + produs);
		}
	}
	
	
	/*
	  EX 2
	  Scrieți un program care cere o cifră și afișează corespondentul în cuvinte.
	*/
	public static void ex2()
	{
		int cifra; // declarare variabila
		Scanner tastatura = new Scanner(System.in); // definirea obiectului pentru citire
		
		// citirea valorii pentru variabila
		System.out.println("Introduceti o cifra");
		cifra = tastatura.nextInt();
		
		// in functie de cifra introdusa se va afisa corespondentul in cuvinte
		switch(cifra)
		{
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("unu");
			break;
		case 2:
			System.out.println("doi");
			break;
		case 3:
			System.out.println("trei");
			break;
		case 4:
			System.out.println("patru");
			break;
		case 5:
			System.out.println("cinci");
			break;
		case 6:
			System.out.println("sase");
			break;
		case 7:
			System.out.println("sapte");
			break;
		case 8:
			System.out.println("opt");
			break;
		case 9:
			System.out.println("noua");
			break;
		default:
			System.out.println("Nu ati introdus o cifra");
		}
	}
	
	
	/*
	  EX 3
	  Trebuie să decizi dacă ar trebui să mergi cu mașina sau  cu trenul la locul de muncă. 
	  Cunoști lungimea drumului dintre casă și locul de muncă și consumul de carburant al 
	  mașinii (în l/100km). De asemenea, cunoști prețul unui bilet de tren. Se iau în 
	  considerare un preț al carburantului de 5 lei/l și costul uzurii mașinii de 5 bani 
	  pentru fiecare kilometru. 
	  Scrieți un program care să indice care variantă este mai ieftină. (folositi instructiunea de decizie)
	*/
	public static void ex3()
	{
		double lungimeDrum, consum, pretBilet; // declararea variabilelor necesare
		
		Scanner tastatura = new Scanner(System.in); // definirea obiectului de tip Scanner
		
		// citirea valorilor variabilelor
		System.out.println("Lungime drum:");
		lungimeDrum= tastatura.nextDouble();
		
		System.out.println("Consum in l/100km:");
		consum = tastatura.nextDouble();
		
		System.out.println("Pret bilet tren:");
		pretBilet = tastatura.nextDouble();
		
		// calculul pretului necesar transportului cu masina
		double pretMasina = lungimeDrum*consum/100 * 5 + 0.05 * lungimeDrum;
		
		// verificarea variantei mai ieftine
		if(pretMasina < pretBilet)
			System.out.println("E mai ieftin cu masina");
		else
			System.out.println("E mai ieftin cu trenul");
		//sau
		if(pretMasina<pretBilet)
			System.out.println("E mai ieftin cu masina.");
		else if(pretMasina == pretBilet)
			System.out.println("Variantele sunt egale. Alege cu ce vrei sa mergi.");
		else
			System.out.println("E mai ieftin cu trenul.");
		
	}

	
	public static void main(String[] args) {
		
		System.out.println("Rezolvare exercitiul 1: ");
		ex1(); // apelul metodei ex1()
		
		System.out.println("\n\nRezolvare exercitiul 2: ");
		ex2(); // apelul metodei ex2()
		
		System.out.println("\n\nRezolvare exercitiul 3: ");
		ex3(); // apelul metodei ex3
	}

}
