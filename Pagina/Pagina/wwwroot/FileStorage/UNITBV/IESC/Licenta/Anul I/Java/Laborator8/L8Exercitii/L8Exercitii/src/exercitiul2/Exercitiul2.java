package exercitiul2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Ex2. Să se scrie un program Java care permite utilizatorului calcularea 
lungimii unui itinerariu prin țară specificat de utilizator. Programul va oferi 
un meniu cu opțiuni pentru: 
	a.	Adăugare oraș;
		Clasa Oras moșteneste clasa Localitate.
		Clasa Localitate are proprietățile: nume, nrLocuitori, judet, coordonate 
(longitudine, latitudine).
		Clasa Oras are proprietățile: esteMunicipiu, esteResedinta, nrMonumente.

		Programul va cere numele orașului, numărul de locuitori, județul din care 
face parte, longitudinea si latitudinea, dacă este sau nu municipiu, dacă este sau 
nu resedință de județ și numărul de monumente UNESCO din administrare.

	b.	Eliminare oraș după nume. Numele orașului este furnizat de utilizator și 
identificarea acestuia în listă se va face fără distincție între litere mari și 
litere mici. 

	c.	Afișarea lungimii itinerariului. Pentru calculul distanțelor se vor folosi 
următoarele valori: 
	1 grad latitudine = 111 km, 1 grad longitudinal = 79 km și se vor considera rute 
liniare între orașe. Se va respecta ordinea orașelor. 

	Programul va fi realizat cu respectarea convențiilor specifice limbajului Java de 
denumire și organizare a pachetelor, claselor proprietăților și metodelor, precum și 
a principiului de încapsulare specifice programării orientate pe obiecte.
 */
public class Exercitiul2 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		String optiune;
		
		// crearea listei de orase
		ArrayList<Oras> lista = new ArrayList<Oras>();
		
		// meniul se repeta pana la introducerea optiunii d
		do {
			System.out.println("a. Adaugare oras"
					+ "\nb. Eliminare oras"
					+ "\nc. Afisare lungime itinerariu"
					+ "\nd. Iesire");
			optiune = t.nextLine(); // citire optiune
			
			switch(optiune) 
			{
			case "a": // adaugare
			{
				// citire date
				System.out.println("Nume: ");
				String nume = t.nextLine();
				System.out.println("Numar locuitori: ");
				int nrLoc = t.nextInt();
				System.out.println("Judet: ");
				t.nextLine();
				String judet = t.nextLine();
				System.out.println("Longitudine: ");
				double longitudine = t.nextDouble();
				System.out.println("Latitudine: ");
				double latitudine = t.nextDouble();
				System.out.println("Este/Nu este municipiu: ");
				int esteM = t.nextInt();
				System.out.println("Este/Nu este resedinta de judet: ");
				int esteR = t.nextInt();
				System.out.println("Numar monumente UNESCO: ");
				int nrMon = t.nextInt();
				t.nextLine();
				
				Oras o = new Oras(nume, nrLoc, judet,longitudine, latitudine, 
						esteM, esteR, nrMon); // creare oras
				
				lista.add(o); // adaugare in lista
			}
				break;
			case "b": // eliminare
			{
				System.out.println("Numele orasului de sters: ");
				String numeDeSters = t.nextLine();
				
				// stergerea din lista al elementelor cu numele identic cu cel citit
				for(int i=0; i<lista.size(); i++)
				{
					if( lista.get(i).getNume().equalsIgnoreCase(numeDeSters) )
					{
						lista.remove(i); // stergere element din lista, la indexul i
					}
				}
				
				// afisare nume orase din lista dupa eliminare
				System.out.println("Nume orase dupa eliminare:");
				for(int i=0; i<lista.size(); i++)
				{
					System.out.println( lista.get(i).getNume() );
				}
			}
				break;
			case "c": // calcul lungime itinerariu
			{
				double dist = 0;
				for(int i=0; i<lista.size()-1; i++)
				{
					// calcul latitudine in km
					double latKm = Math.pow(lista.get(i+1).getLatitudine() -
							                lista.get(i).getLatitudine() , 1) *111;
					// calcul longitudine in km
					double longKm = Math.pow(lista.get(i+1).getLongitudine() - 
										     lista.get(i).getLongitudine(), 2) *79;
					// adaugare distanta
					dist += Math.sqrt(latKm + longKm);
				}
				System.out.println("Lungime itinerariu: " + dist);
			}
				break;
			case "d": // iesire
				return;
			default:
				System.out.println("Nu e o optiune valida!");
			}
			
		}while(true);
	}

}
