package ex2Comparable;

//Laborator 11

import java.util.ArrayList;
import java.util.Collections;

/*
EX2. Creați o interfață Patrulater care definește metodele calculeazaPerimetru și 
calculeazaAria.
	Definiți clasele Dreptunghi (cu proprietățile lungime și lățime) și Patrat (cu proprietatea
latură) care implementează interfața Patrulater.

	Creați o listă cu cel puțin 3 obiecte de tip Dreptunghi și o listă cu cel puțin 3 obiecte de tip
Patrat.

	Sortați lista de dreptunghiuri ascendent după valoarea perimetrului și lista de pătrate
descendent după valoarea ariei.
*/

public class Exercitiul2cuComparable {

	public static void main(String[] args) {

		ArrayList<Dreptunghi> dreptunghiuri = new ArrayList<Dreptunghi>();
		dreptunghiuri.add(new Dreptunghi(3,4));
		dreptunghiuri.add(new Dreptunghi(1,2));
		dreptunghiuri.add(new Dreptunghi(5,6));
		
		System.out.println("Lista dreptunghiuri:");
		for(int i=0; i<dreptunghiuri.size(); i++)
		{
			System.out.println(dreptunghiuri.get(i));
		}
		
		Collections.sort(dreptunghiuri);
		
		System.out.println("\nLista dreptunghiuri dupa sortare:");
		for(int i=0; i<dreptunghiuri.size(); i++)
		{
			System.out.println(dreptunghiuri.get(i));
		}
		
		ArrayList<Patrat> patrate = new ArrayList<Patrat>();
		patrate.add(new Patrat(3));
		patrate.add(new Patrat(5));
		patrate.add(new Patrat(1));
		
		System.out.println("\nLista patrate:");
		for(int i=0; i<patrate.size(); i++)
		{
			System.out.println(patrate.get(i));
		}
		
		Collections.sort(patrate);
		
		System.out.println("\nLista patrate dupa sortare:");
		for(int i=0; i<patrate.size(); i++)
		{
			System.out.println(patrate.get(i));
		}

	}

}
