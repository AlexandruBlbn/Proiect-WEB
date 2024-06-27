package teorie;

import java.util.Scanner;

//Laborator 1-2

public class TeorieL1 {

	public static void main(String[] args) {
		/*
		tipuri de date:
			- referinta (adresa catre obiect)
			- primitive:
				- intregi: byte, short, int, long
				- reale: float, double
				- caracter: char
				- logic: boolean
		secvente escape: \n \t \r etc.
		*/
		
		//model declaratii de variabile
		//tipVar numeVar;
		float varFloat;
		char varChar;
		
		//model definitii de variabile
		//tipVar numeVar = valoareVar;
		boolean var1 = false;
		int var2 = 9;
		
		//model declaratii de constante
		//final tipC numeC = valC;
		final double g = 9.8;
		
		/*
		O vasta arie de solutii matematice sunt oferite de clasa Math.
		exemple: Math.pow(baza, exp); - ridicare la putere
				 Math.PI - valoare a constante PI
				 Math.max(nr1, nr2); - calculul maximului dintre 2 numere
				 Math.min(nr1, nr2); - calculul minimului dintre 2 numere
				 Math.abs(nr); - valoarea absoluta/modulul
				 Math.sqrt(nr); - radicalul unui numar
				 Math.sin(nr); - valorea sinusului unui numar
				 etc.
		*/		 
		
		//afisarea mesajelor in consola se face cu: System.out.println( );
		System.out.println("mesaj pentru consola");
		//se poate folosi si scurtatura: syso + CTRL + Spatiu 
		System.out.println("mesaj care contine si valori: \t var2 = " + var2);
		//operatorul de concatenare a sirurilor de caractere in java este: +
		
		//citirea datelor de la tastatura
		Scanner tastatura = new Scanner(System.in);
		//Atentie! clasa Scanner trebuie importata pentru a putea fi folosita cu succes
		//import java.util.Scanner; - in partea superioara a programului, in afara clasei
		//mai departe obiectul tastatura poate fi folosit in functie de necesitate
		
		System.out.print("O variabila int: ");
		int varIntreaga = tastatura.nextInt();
		System.out.println("Variabila citita a fost: " + varIntreaga);
		
		System.out.print("O variabila reala: ");
		float varReala = tastatura.nextFloat();
		System.out.println("Variabila citita a fost: " + varReala);
		
		System.out.print("O variabila sir de caractere: ");
		tastatura.nextLine(); 
		//la citirea de noi linii (sir de caractere) dupa citiri de alte variabile (in afara de sir de caractere)
		//este nevoie de o citire "falsa" pentru a prelua valorile corecte din consola
		String varSir = tastatura.nextLine();
		System.out.println("Variabila citita a fost: " + varSir);
			
	}

}
