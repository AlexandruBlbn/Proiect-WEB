package ex1;

// Laborator 11

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 EX1. Creați o interfață Locuinta care definește un șir de caractere “Detalii locuinta” și metodele
getTipLocuinta, getSuprafata și getNrCamere, setTipLocuinta, setSuprafata și setNrCamere.
	
	Definiți clasa Casa (cu proprietățile tipLocuinta, suprafata, nrCamere și nrBai). Clasa
implementează interfețele Locuinta, Comparator și Comparable.
	
	Creați o listă cu cel puțin 4 obiecte de tip Casa.
	Comparați casa de la indexul 0 cu cea de la indexul 2.
	Sortați lista de case ascendent după nrCamere și descendent după suprafață.
 */
public class Exercitiul1 {

	public static void main(String[] args) {
		
		ArrayList<Casa> listaCase = new ArrayList<Casa>();
		
		listaCase.add(new Casa("casa cu 2 etaje", 400, 20, 5));
		listaCase.add(new Casa("casa parter", 20, 5, 2));
		listaCase.add(new Casa("casa casa cu 1 etaj", 100, 10, 5));
		listaCase.add(new Casa("casa", 100, 20, 5));
		
		System.out.println("Lista inainte de sortare:");
		for(int i=0; i<listaCase.size(); i++)
		{
			System.out.println(listaCase.get(i));
		}
		
		System.out.println("--------------------------------------------------------------");
		
		
		System.out.println("\nLista dupa sortare ascendenta dupa numarul de camere:");
		
		Collections.sort(listaCase, new SortareDupaNrCamere());
		for(int i=0; i<listaCase.size(); i++)
		{
			System.out.println(listaCase.get(i));
		}
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("\nCompararea casei 0 cu casa  2:");
		int comp = listaCase.get(0).compareTo(listaCase.get(2));
		System.out.println("Rezultat comparare: " + comp);
		
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("\nLista dupa sortare descendenta dupa suprafata:");
		
		Collections.sort(listaCase);
		for(int i=0; i<listaCase.size(); i++)
		{
			System.out.println(listaCase.get(i));
		}
		
		System.out.println("--------------------------------------------------------------");
	}

}
