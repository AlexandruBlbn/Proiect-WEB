package l5Ex;

import java.util.Arrays;
import java.util.Scanner;

public class Exercitii {

	public static void ex1()
	{
		//a. Declară un tablou de numere reale, cu 10 elemente.
		double tab1[] = new double[10];
		
		//b. Cere utilizatorului introducerea de la tastatură a celor 10 numere.
		Scanner tastatura = new Scanner(System.in);
		// se parcurge tabloul element cu element si se citeste cate o valoare pentru fiecare
		for(int i=0; i<10; i++)
		{
			System.out.print("tab1[" + i + "]="); // se afiseaza un mesaj inainte de citire
			tab1[i] = tastatura.nextDouble(); // se citeste elementul curent
		}
		
		//c. Afișează pe ecran suma tuturor elementelor.
		double suma = 0; // variabila care va pastra valoarea sumei elementelor
		// se parcurge tabloul si se aduna valoarea elementului la suma
		for(int i=0; i<10; i++)
		{
			suma += tab1[i];
		}
		// se afiseaza suma
		System.out.println("c. Suma tuturor elementelor este " + suma + ".");
		
		//d. Afișează pe ecran produsul elementelor nenule.
		double produs = 1; // variabila care va pastra valoarea produsului
		// se parcurge tabloul element cu element 
		for(int i=0; i<10; i++)
		{
			if(tab1[i] != 0) // daca elementul are o valoare nenula se va inmulti cu produsul
			{
				produs *= tab1[i];
			}
		}
		// se afiseaza produsul
		System.out.println("d. Produsul elementelor nenule este " + produs + ".");
		
		//e. Afișează pe ecran media aritmetică.
		double ma = suma/10; 
		System.out.println("e. Media aritmetica este " + ma + ".");
		
		//f. Afișează pe ecran eroarea medie pătratică.
		double er = 0; // variabila va pastra valoarea erorii
		// se parcurge tabloul element cu element si se calculeaza eroarea medie patratica
		for(int i=0; i<10; i++)
		{
			er += Math.pow(tab1[i]-ma, 2);
		}
		er = er/9;
		// se afiseaza eroarea
		System.out.println("f. Eroarea medie patratica este " + er + ".");
		
		//g. Se vor copia elementele într-un nou tablou cu elemente de tip număr întreg, astfel: pentru 
		//elementele negative se va considera modulul, se va stoca în noul tablou doar partea întreagă. 
		//Astfel, noul tablou va conține numai numere pozitive.
		int tab2[] = new int[10]; // se declara noul tablou
		// se parcurge element cu element
		for(int i=0; i<10; i++)
		{
			if(tab1[i] < 0) // daca numarul este negativ, el este inlocuit cu modulul sau
			{
				tab2[i] = (int)Math.abs(tab1[i]);
			}
			else
			{
				tab2[i] = (int)tab1[i];
			}
		}
		//SAU - se calculeaza direct valoare absoluta (cele pozitive ramanand oricum neschimbate)
		/*
		for(int i=0;i<10;i++)
		{
			tab2[i] = (int)Math.abs(tab1[i]);
		}
		*/
		
		
		//h. Afișează pe ecran toate elementele impare ale noului tablou și numărul acestora.
		System.out.print("h. Elementele impare din tab2 sunt: ");
		int nrImp = 0;
		// se parcurge tabloul element cu element
		for(int i=0; i<10; i++)
		{
			// daca elementul e impar, atunci se va afisa in consola,
			// iar numarul de elemente impare se va incrementa
			if(tab2[i] %2 != 0) // sau if(tab2[i] %2 == 1)
			{
				System.out.print(tab2[i] + " ");
				nrImp++;
			}
		}
		// se afiseaza numarul de elemente impare
		System.out.println(".\nNumarul de elemente impare este "+ nrImp + ".");
		
		//i. Afișează pe ecran numerele pătrat perfect din tabloul de numere întregi.
		System.out.print("i. Elementele patrate perfecte: ");
		// se parcurge element cu element
		for(int i=0; i<10; i++)
		{
			// se verifica elementele patrat perfect
			if(Math.pow((int)Math.sqrt(tab2[i]),2) == tab2[i])
			{
				System.out.print(tab2[i] + " ");
			}
		}
		System.out.println(".");
		
		//j. Afișează pe ecran elementele celor 2 tablouri, intercalat 
		//(primul element din primul tablou, primul element din al doilea tablou, 
		//al doilea element din primul tablou, ș.a.m.d.).
		System.out.print("j. Elementele intercalate: ");
		// se parcurg tablourile element cu element
		for(int i=0; i<10; i++)
		{
			// se afiseaza elemente din ambele tablouri concomitent
			System.out.print(tab1[i] + " " + tab2[i] + " ");
		}
		System.out.println(".");
		
		//k. Afișează pe ecran tabloul de numere întregi, în ordine inversă,
		//de la ultimul element la primul.
		System.out.print("k. Elementele lui tab2 in ordine inversa: ");
		// se va parcurge tabloul de la ultimul spre primul element si se va afisa
		for(int i=9; i>=0; i--)
		{
			System.out.print(tab2[i] + " ");
		}
		System.out.println(".");
		
		//l. Sortează ascendent elementele celor două tablouri.
		Arrays.sort(tab1);
		Arrays.sort(tab2);
		
		//m. Afișează pe ecran cele două tablouri.
		System.out.print("m. Elementele sortate din tab1: ");
		for(int i=0; i<10; i++)
		{
			System.out.print(tab1[i] + " ");
		}
		System.out.print(".\nElementele sortate din tab2: ");
		for(int i=0; i<10; i++)
		{
			System.out.print(tab2[i] + " ");
		}
		System.out.println(".");
		
		//n. Declară un nou tablou cu 20 elemente de tip real.
		double tab3[] = new double[20];
		
		//o. Inițializează acest nou tablou cu elemente de valoare 1.
		Arrays.fill(tab3, 1);
		//SAU
		/*
		for(int i=0;i<20;i++)
		{
			tab3[i] = 1;
		}
		*/
		
		//p. Combină primele două tablouri în cel de-al treilea, prin interclasare; 
		//la sfârșitul operației, elementele din al treilea tablou vor fi în 
		//ordine ascendentă. Elementele nule vor fi ignorate.
		int i=0, j=0, k=0;
		// algoritm de interclasare a doua tablouri
		while(i < tab1.length && j < tab2.length)
		{
			// daca elementul mai mic este din primul tablou, atunci se va adauga in tab3 acel element
			// altfel se va adauga din tab2
			if(tab1[i] < tab2[j]) 
			{
				if(tab1[i] != 0) // daca elementul e nenul, se va face adaugarea
				{
					tab3[k] = tab1[i];
					k++;
				}
				i++;
			}
			else
			{
				if(tab2[j] != 0) // daca elementul e nenul, se va face adaugarea
				{
					tab3[k] = tab2[j];
					k++;
				}
				j++;
			}
		}
		while(i<tab1.length) // se va verifica si cazul in care unul dintre tablouri s-a parcurs inainte ca celalalt sa ajunga la final
		{
			if(tab1[i] != 0) // daca elementul e nenul, se va face adaugarea
			{
				tab3[k] = tab1[i];
				k++;
			}
			i++;
		}
		while(j<tab2.length) // se va verifica si cazul in care unul dintre tablouri s-a parcurs inainte ca celalalt sa ajunga la final
		{
			if(tab2[j] != 0) // daca elementul e nenul, se va face adaugarea
			{
				tab3[k] = tab2[j];
				k++;
			}
			j++;
		}
		//SAU - daca algoritmul pare prea complicat
		//pun elementele intercalat, dar ma asigur ca mai sortez o data tabloul dupa aceea
		/*
		for(int x=0; x<10; x++)
		{
			if(tab1[x] != 0)
			{
				tab3[2*x] = tab1[x];
			}
			if(tab2[x] != 0)
			{
				tab3[2*x+1] = tab2[x];
			}
		}
		Arrays.sort(tab3);
		*/
		
		
		//q. Afișează pe ecran cele de-al treilea tablou.
		System.out.print("q. Tabloul 3 are elementele: ");
		for(i=0; i<20; i++)
		{
			System.out.print(tab3[i] + " ");
		}
		System.out.println(".");
		
		//r. Cere utilizatorului introducerea de la tastatură a unui număr real.
		System.out.println("r. Introduceti un numar real: ");
		double nr = tastatura.nextDouble();
		
		//s. Verifică dacă în al treilea tablou există numărul furnizat de utilizator și 
		//afișează pe ecran un mesaj corespunzător.
		int index = Arrays.binarySearch(tab3, nr);
		if(index >= 0)
		{
			System.out.println("s. Numarul " + nr + " s-a gasit in tab3");
		}
		else
		{
			System.out.println("s. Numarul " + nr + " nu este in tablou3");
		}
		//SAU
		/*
		boolean gasit = false;
		for(i=0; i<20; i++)
		{
			if(nr == tab3[i])
			{
				gasit = true;
				break;
			}
		}
		if(gasit)
			System.out.println("s. Numarul " + nr + " a fost gasit");
		else
			System.out.println("s. Numarul " + nr + " nu a fost gasit");
		*/
		
	}
	
	
	public static void ex2()
	{
		//a. Declară o matrice pătrată de 3x3 elemente de tip întreg.
		int m[][] = new int[3][3];
		
		Scanner t = new Scanner(System.in);
		
		//b. Cere utilizatorului introducerea de la tastatură a valorilor elementelor matricei.
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print("m[" + i + "][" + j + "]=");
				m[i][j] = t.nextInt(); 
			}
		}
		
		// putem afisa valorile din matrice, ptr a ne asigura ca e ok
		System.out.println("Matricea este: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(m[i][j] + " " );
			}
			System.out.println(); // dupa fiecare linie din matrice se face trecerea la linie noua
		}
				
		//c. Afișează pe ecran transpusa matricei.
		System.out.println("c. Transpusa matricei: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(m[j][i] + " "); // se inverseaza contorul de linie cu cel de coloana
			}
			System.out.println();
		}
		
		//d. Afișează pe ecran suma elementelor de pe diagonala principală a matricei.
		int suma =0; // se declara si se initializeaza cu 0 variabila pentru suma
		for(int i=0; i<3; i++)
		{
			suma += m[i][i]; // conditia pentru diagonala principala este i=j
		}
		//SAU
		/*
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(i==j)
					suma += m[i][j]; // conditia pentru diagonala principala este i=j
			}
		}
		*/
		System.out.println("d. Suma este: " +  suma);
		
		//e. Afișează pe ecran valoarea determinantului matricei.
		int determinant; // declarare variabila
		int diagonalaPrincipala = 1;
		// calculul elementelor de pe diagonala principala
		for(int i=0; i<3; i++)
		{
			diagonalaPrincipala *= m[i][i]; // conditia pentru diagonala principala este i=j
		}
		int diagonalaSecundara = 1;
		for(int i=0; i<3; i++)
		{
			diagonalaSecundara *= m[i][2-i]; // conditia pentru diagonala secundara este i + j = n-1 (i+j = 3-1 = 2)
		}
		//SAU
		/*
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(i+j==2)
					diagonalaSecundara *= m[i][j]; // conditia pentru diagonala secundara este i + j = n-1 (i+j = 3-1 = 2)
			}
		}
		*/
		determinant = diagonalaPrincipala + m[1][0]*m[2][1]*m[0][2] + m[0][1]*m[1][2]*m[2][0] 
					- diagonalaSecundara - m[0][0]*m[2][1]*m[1][2] - m[1][0]*m[0][1]*m[2][2];
		System.out.println("e. Determinantul este: " + determinant);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Exercitiul 1 - subpunctele a-s");
		ex1();
		System.out.println("Exercitiul 2 - subpunctele a-e");
		ex2();
	}

}
