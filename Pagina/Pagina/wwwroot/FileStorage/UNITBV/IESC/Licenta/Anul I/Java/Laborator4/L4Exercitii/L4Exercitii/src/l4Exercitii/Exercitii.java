package l4Exercitii;

import java.util.Scanner;

//Laborator 4
//Instructiuni repetitive si de salt

/*
  FOR - instructiune repetitiva cu numar cunoscut de 
  pasi si test initial
  
  for(initializare; conditia de continuare; modul de parcurgere)
  {
  	bloc de instructiuni;
  }
  
  WHILE - instructiune repetitiva cu numar necunoscut de 
  pasi si test initial
  
  while(conditia)
  {
   bloc de instructiuni;
  }
  
  DO-WHILE - instructiune iterativa cu numar necunoscut de
  pasi si test final
  		   - !!!! blocul de instructiuni se executa cel putin o data
  		   
  do
  {
  	bloc de instructiuni;
  }while(conditia);
  
  Instructiuni de salt:
  - break - opreste executia instructiunii repetitive
  - continue - sare la iteratia urmatoare
  - return - opreste executia instructiunii unde a fost executat
  si revine in metoda din care a fost apelat
  		   - poate returna sau nu o valoare;
 */

public class Exercitii {
	
	// Ex1. Descoperiți pătratele perfecte din intervalul [1-100].
	public static void exercitiul1()
	{
		// varianta 1
		// se parcurg toate numerele de la 1 la 100, inclusiv
		for(int i=1; i<=100; i++)
		{
			// se calculeaza radicalul lui i
			int radical = (int)Math.sqrt(i);
			if(radical*radical == i) // se verifica daca este p.p.
			{
				System.out.print(i + " "); // se afiseaza numarul p.p.
			}
		}
		System.out.println();
		
		// varianta 2
		// se parcurg toate numerele de la 1 la 100, inclusiv
		for(int i=1; i<=100; i++)
		{
			// se calculeaza radicalul lui i
			double radical = Math.sqrt(i);
			if(radical == (int)Math.sqrt(i)) // se verifica daca este p.p.
			{
				System.out.print(i + "\t"); // se afiseaza p.p.
			}
		}
		System.out.println();
		
		// varinta 3
		// se parcurg toate numerele de la 1 la 100, inclusiv
		for(int i=1; i<=100; i++)
		{
			// se parcurg toate numerele de la 1 la 10 (10 = sqrt(100))
			for(int j=1; j<=10; j++)
			{
				if(j*j == i) // se verifica daca este p.p.
				{
					System.out.print(i + " "); // se afiseaza p.p. 
				}
			}
		}
		System.out.println();
		
		// varianta 4
		// se parcurg toate numerele de la 1 la radacina lui 100
		for(int i=1; i*i<=100;i++)
		{
			System.out.print(i*i + " "); // se afiseaza patratul radacinii
		}
	}

	// Ex2. Calculați suma primelor 100 de numere naturale impare și produsul 
	//primelor 100 de numere naturale pare (folosind instrucțiunea WHILE).
	public static void exercitiul2()
	{
		long suma = 0;
		double produs = 1;
		
		int i = 1; // se initializeaza contorul
		// se verifica conditia
		while(i<=200)
		{
			// se verifica daca numarul este impar sau par
			if(i%2 == 1) 
			{
				suma += i; // suma = suma + i;
			}
			else
			{
				produs *= i; // produs = produs * i;
			}
			i++; // se incrementeaza contorul
		}
		
		System.out.println("suma = "+ suma);
		System.out.println("produs = "+ produs);
	}
	
	// Ex3. Calculați suma primelor 100 de numere naturale impare și produsul 
	//primelor 100 de numere naturale pare (folosind instrucțiunea  DO-WHILE).
	public static void exercitiul3()
	{
		long suma = 0;
		double produs = 1;
		
		int i = 1; // se initializeaza contorul
		// se executa blocul de instructiuni cat timp conditia este adevarata
		do
		{
			// se verifica daca numarul este impar sau par
			if(i%2 == 1)
			{
				suma += i; // suma = suma + i;
			}
			else
			{
				produs *= i; // produs = produs * i;
			}
			i++; // se incrementeaza contorul
		}while(i<=200);
		
		System.out.println("suma = "+ suma);
		System.out.println("produs = "+ produs);
	}
	
	// Ex4. Valoarea lui π poate fi calculată cu ajutorul formulei:
	// π/4 = 1-1/3+1/5-1/7+1/9-...
	//Scrieți un program care calculează valoarea lui π. 
	public static void exercitiul4()
	{
		// varianta 1
		int i = 1;
		double pi = 0;
		
		while(i <= 1000000)
		{
			pi += Math.pow(-1, i+1) * 1/(2*i-1);
			i++;
		}
		pi *= 4;
		System.out.println("pi (v1) = " + pi);
		
		// varianta 2
		double pi2 = 1;
		int i2 = 1;
		int j2 = 1;
		
		while(i2 <= 1000000)
		{
			pi2 += Math.pow(-1, i2)*1/(j2+2);
			i2++;
			j2 += 2;
		}
		pi2 *= 4;
		System.out.println("pi (v2) = " + pi2);
		
		// varianta 3
		double i3 = 1;
		double pi3 = 0;
		
		while(i3 <= 1000000)
		{
			pi3 += 1/i3;
			i3 += 4;
		}
		i3=3;
		while(i3 <= 1000000)
		{
			pi3 -= 1/i3;
			i3 += 4;
		}
		pi3 *= 4;
		System.out.println("pi (v3) = " + pi3);

		System.out.println("PI = " + Math.PI);
	}
	
	
	// Ex5. Scrieți un program pentru a rezolva următoarea problemă: 
	//un depozit bancar cu capitalizare conține 1000 de lei. 
	//Dobânda anuală este de 6% (0.5% pe lună). În fiecare lună, 
	//la termen, sunt retrași 50 de lei pentru o rată. 
	//În câți ani se vor cheltui toți banii?
	//Scrieți un program pentru a rezolva următoarea problemă: un depozit 
	//bancar cu capitalizare conține 1000 de lei. Dobânda anuală este 
	//de 6% (0.5% pe lună). În fiecare lună, la termen, sunt retrași 50 de 
	//lei pentru o rată. În câți ani se vor cheltui toți banii?
	
	public static void exercitiul5()
	{
		double depozit = 1000;
		double dobanda = 0.5;
		int rata = 50;
		int contor = 0;
		
		// cat timp mai exista bani in depozit se retrage rata si dobanda
		while(depozit>0)
		{
			depozit -= rata + dobanda/100*depozit;
			contor++; // fiecare parcurgere reprezinta inca o luna 
		}
		
		// se afiseaza numarul de luni in formatul x ani si y luni
		System.out.println("banii s-au terminat in: " + contor/12 + "ani si " + contor%12 + " luni");
		
	}
	
	public static void main(String[] args) {

		// meniu pentru exercutarea unui anumit exercitiu
		Scanner tastatura = new Scanner(System.in);
		int optiune;
		System.out.println("Introduceti numarul exercitiului (1-5):");
		optiune = tastatura.nextInt();
		
		switch(optiune)
		{
		case 1:
		{
			System.out.println("Exercitiul1:");
			exercitiul1();
		}
		break;
		case 2:
		{
			System.out.println("Exercitiul2:");
			exercitiul2();
		}
		break;
		case 3:
		{
			System.out.println("Exercitiul3:");
			exercitiul3();
		}
		break;
		case 4:
		{
			System.out.println("Exercitiul4:");
			exercitiul4();
		}
		break;
		case 5:
		{
			System.out.println("Exercitiul5:");
			exercitiul5();
		}
		}
	}

}
