package l5Teorie;

import java.util.Arrays;
import java.util.Scanner;

//Laborator 5
//Tablouri

//Tablou = colectie de date de acelasi tip cu un nume comun
//Identificare elementelor se face folosind indexul care ia valori de la 0 pana la dimensiune-1

public class Teorie {

	public static void main(String[] args) {
		
		//Tablouri unidimensionale
		System.out.println("Exemplificare tablou unidimensional: ");
		
		//tip[] nume sau tip nume[]
		int[] tab1;
		float tab2[];
		
		int tab3[] = {10, 5, 3, 4, 25};
		int tab4[] = new int[10];
		
		//citire tablou
		Scanner tastatura = new Scanner(System.in);
		for(int i=0; i<tab4.length; i++) // proprietarea length reprezinta dimensiunea tabloului
		{
			System.out.print("tab[" + i + "]=");
			tab4[i] = tastatura.nextInt();
		}
		
		//afisare tablou
		for(int i=0; i<tab4.length; i++)
		{
			System.out.print(tab4[i] + " ");
		}
		System.out.println();

		
		
		//Tablouri bidimensionale = matrici
		System.out.println("Exemplificare tablou bidimensional: ");
		
		//tip[][] nume sau tip nume[][]
		int[][] mat1;
		double mat2[][];
		
		int mat3[][] = { {1, 2, 3}, {6, 7, 8} };
		int mat4[][] = new int[2][4];
		
		//citire matrice
		for(int i=0; i<mat4.length; i++) // matrice.length returneaza numarul de linii din matrice
		{
			for(int j=0; j<mat4[i].length; j++) // matrice[i].length returneaza numarul de coloane din matrice
			{
				System.out.print("mat[" + i + "][" + j + "]=");
				mat4[i][j] = tastatura.nextInt();
			}
		}
		
		//afisare matrice
		for(int i=0; i<mat4.length; i++)
		{
			for(int j=0; j<mat4[i].length; j++)
			{
				System.out.print(mat4[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//Operatii cu tablouri
		System.out.println("Exemplificare operatii cu tablouri:");
		
		//Arrays.equals
		System.out.println("Exemplificare Arrays.equals(tablou1, tablou2)");
		if(Arrays.equals(tab3, tab4)) // parametri: cele 2 tablouri care trebuie comparate, returneaza true/false
		{
			System.out.println("Tablourile sunt egale");
		}
		else
		{
			System.out.println("Tablourile nu sunt egale");
		}
		
		
		//Arrays.fill - initializeaza date in tablou
		System.out.println("Exemplificare Arrays.fill(tablou, valoare)");
		Arrays.fill(tab3, -2); // parametri: tablou, valoare
		
		for(int i=0; i<tab3.length; i++)
		{
			System.out.print(tab3[i] + " ");
		}
		System.out.println();
		
		System.out.println("Exemplificare Arrays.fill(tablou, de la ce index, pana la ce index, valoare)");
		Arrays.fill(tab3, 1, 3, -7); // parametri: tablou, indexInitial, indexFinal, valoare
		
		for(int i=0; i<tab3.length; i++)
		{
			System.out.print(tab3[i] + " ");
		}
		System.out.println();
		
		
		//Arrays.sort - sortare ascendenta, folosind QuickSort
		System.out.println("Exemplificare Arrays.sort(tablou)");
		Arrays.sort(tab4); // parametri: tablou
		
		for(int i=0; i<tab4.length; i++)
		{
			System.out.print(tab4[i] + " ");
		}
		System.out.println();
		
		
		//Arrays.binarySearch - cautarea unei valori intr-un tablou sortat
		System.out.println("Exemplificare Arrays.binarySearch(tablou, valoare cautata)");
		int index = Arrays.binarySearch(tab4, 2); // parametri: tablou, valoareCautata, returneaza indexul elementului daca este gasit sau o valoare negativa
		
		if(index>=0)
		{
			System.out.println("Numar gasit");
		}
		else
		{
			System.out.println("Numarul nu e in tablou");
		}
		
		
		//System.arraycopy - copiaza o secventa dintr-un tablou in altul
		System.out.println("Exemplificare System.arraycopy(tablou sursa, indexul de la care se copiaza din sursa, tablou destinatie, indexul din destinatie, cate elemente se copiaza)");
		System.arraycopy(tab3, 1, tab4, 4, 2); // parametri: tablou sursa, index din sursa, tablou destinatie, index din destinatie, cate elem
		
		for(int i=0;i<tab4.length; i++)
		{
			System.out.print(tab4[i]  + " ");
		}
	}

}
