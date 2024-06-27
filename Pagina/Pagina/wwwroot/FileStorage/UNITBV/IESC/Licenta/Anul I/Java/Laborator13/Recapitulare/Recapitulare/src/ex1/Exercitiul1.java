package ex1;

import java.util.Arrays;
import java.util.Scanner;

// Recapitulare

/*
 	Declarati un tablou unidimensional de 10 elemente reale. Initializati-l cu valoarea -1.
	Cititi in consola valori pentru elementele tabloului, asigurandu-va ca toate posibilele erori sunt tratate corespunzator.
	Calculati media aritmetica a elementelor.
	Eliminati elementele negative din tablou si afisati-l.
	Sortati tabloul dupa eliminare si afisati-l.
 */

public class Exercitiul1 {

	public static void main(String[] args) {
		// declarare tablou
		double tab[] = new double[10];
		
		// initializare valori
		Arrays.fill(tab, -1);
		// sau 
		for(int i=0; i<tab.length; i++)
		{
			tab[i] = -1;
		}
		
		Scanner t = new Scanner(System.in);
		// citire valori
		try {
			for(int i=0; i<tab.length; i++)
			{
				System.out.print("tab[" + i + "]=");
				tab[i] = t.nextDouble();
			}
		}
		catch(Exception e)
		{
			System.out.println("Eroare: " + e);
		}
		
		System.out.println("Elementele tabloului dupa citire:");
		for(int i=0; i<tab.length; i++)
		{
			System.out.print(tab[i] + " ");
		}
		System.out.println("\n");
		
		// media aritmetica
		double ma = 0;
		for(int i=0; i<tab.length; i++)
		{
			ma += tab[i];
		}
		ma /= tab.length;
		System.out.println("Media aritmetica: " + ma + "\n");
		
		// eliminare elemente negative
		int n = tab.length;
		for(int i=0; i<n; i++)
		{
			if(tab[i] < 0)
			{
				for(int j=i; j<n-1; j++)
				{
					tab[j] =tab[j+1];
				}
				n--;
				i--;
			}
		}
		// afisare dupa eliminare
		System.out.println("Elementele tabloului dupa eliminare:");
		for(int i=0; i<n; i++)
		{
			System.out.print(tab[i] + " ");
		}
		System.out.println("\n");
		
		// sortare
		Arrays.sort(tab, 0 , n);
		// afisare dupa sortare
		System.out.println("Elementele tabloului dupa sortare:");
		for(int i=0; i<n; i++)
		{
			System.out.print(tab[i] + " ");
		}
	}

}
