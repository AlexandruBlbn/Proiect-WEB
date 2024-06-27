package l12e1;

import java.util.Scanner;

//Laborator 1-2

/*
  EX 1
  Scrieți un program care cere utilizatorului 2 numere întregi și afișează: 
  suma, diferența, produsul, media, distanța dintre ele (modulul diferenței), maximul și minimul.
 */

public class Ex1 {

	public static void main(String[] args) {

		// declararea celor 2 variabile
		int a,b;
		
		// citirea de la tastatura
		Scanner tastatura = new Scanner(System.in);
		
		System.out.println("a = "); // afisarea unui mesaj inainte de a citi valoarea variabilei
		a = tastatura.nextInt(); // citirea propriu-zisa a variabilei a 
		
		System.out.println("b = "); // afisarea unui mesaj inainte de a citi valoarea variabilei
		b = tastatura.nextInt(); // citirea propriu-zisa a variabile b
		
		int suma = a+b; // definirea unei variabile pentru suma
		System.out.println("suma este: " + suma); // afisarea valorii
		
		int dif = a-b; // definirea unei variabile pentru diferenta
		System.out.println("diferenta este: " + dif); // afisarea valorii
		
		int produs = a*b; // definirea unei variabile pentru produs
		System.out.println("produsul este: " + produs); // afisarea valorii
		
		double media = suma/2.0; // definirea unei variabile pentru calculul mediei
		// o rezolvare de tipul double media = suma/2; este incorecta 
		// deoarece ambii operanzi sunt int si se va pierde precizia rezultatului
		System.out.println("media aritmetica: " + media); // afisarea valorii
		//sau
		double media2 = (double)suma /2; // definirea unei variabile pentru calculul mediei		
		System.out.println("media aritmetica: " + media2); // afisarea valorii
		
		int modul = Math.abs(dif); //definirea unei variabile pentru calculul modulului diferentei
		System.out.println("Modulul diferentei dintre " + a + " si " + b + " este: " + modul); // afisarea valorii
		
		// posibilitati de calcul a maximului dintre cele 2 numere
		String rez = a>b? "a este maxim" : "b este maxim"; // folosind operatorul conditional/ternar
		System.out.println(rez);
		//sau
		int max = Math.max(a, b); // folosind Math.max
		System.out.println("maximul este " + max);
		
		int min = Math.min(a, b); // calculul minimului dintre cele 2 numere folosind Math.min
		System.out.println("minimul este " + min);
	}

}
