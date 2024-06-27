package ex2;

import java.io.*;
import java.util.Scanner;

// Recapitulare 

/*
	Ex2. Cititi un sir de caractere separate prin virgule, reprezentand o lista de cumparaturi.
Intrebati utilizatorul ce cantitate doreste din fiecare produs din lista de cumparaturi. 
Scrieti intr-un fisier text linie cu linie produsul si cantitatea sa.
 */
public class Exercitiul2 {

	public static void main(String[] args) {
		// declarare sir de caractere
		String listaCumparaturi = new String();
		
		// citire sir de caractere
		Scanner t = new Scanner(System.in);
		System.out.println("Introduceti lista de cumparaturi:");
		listaCumparaturi = t.nextLine();
		
		// separare lista de cumparaturi in produsele componente
		String[] produse = listaCumparaturi.split(",");
		
		try 
		{
			// se deschide un flux de iesire
			BufferedWriter fisier = new BufferedWriter(new FileWriter("lista cumparaturi.txt"));
			
			// pentru fiecare produs se cere cantitatea si se scrie in fisier
			for(int i=0; i<produse.length; i++)
			{
				// se elimina spatiile inutile
				produse[i] = produse[i].trim();
				
				// se cere cantitatea
				System.out.println("Ce cantitate de " + produse[i] + " doriti?");
				String cantitate = t.nextLine();
				
				// se scrie numele produsului si cantitatea
				fisier.write(produse[i]+ "\t" + cantitate);
				fisier.newLine();
			}
			
			// se inchide fluxul
			fisier.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare: " + e);
		}
		
	}

}
