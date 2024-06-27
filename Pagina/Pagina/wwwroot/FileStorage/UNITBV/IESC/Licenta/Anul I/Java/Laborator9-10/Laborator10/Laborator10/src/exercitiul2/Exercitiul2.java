package exercitiul2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 EX2. Să se scrie un program Java care permite utilizatorului calcularea 
consumului de combustibil a unor autovehicule pentru un traseu 
furnizat tot de utilizator. Programul va oferi un meniu (text) cu 
opțiuni pentru: 
	a.	 Adăugare autovehicul; programul va cere numărul de 
înmatriculare a autovehiculului, consum D0 (drum cu pantă 
neglijabilă), consum PU (pantă ușoară) și consum PA (pantă 
accentuată). Consumurile sunt exprimate în litri la suta de km. 
		i.	Orice eroare apărută la citirea datelor va fi 
raportată utilizatorului și va determina anularea adăugării.


	b.	Eliminare autovehicul după numărul de înmatriculare. 
Caracterele spațiu de la începutul și sfârșitul numărului de 
înmatriculare furnizat de utilizator nu vor fi luate în considerare. 
		i.	Orice eroare apărută va fi raportată utilizatorului. 

	c.	Introducere traseu; acesta va fi specificat de un șir de 
caractere care va respecta formatul: XXYYZZ…, unde fiecare grup
 de două caractere reprezintă un segment de 10 km și poate fi: 
D0, PU sau PA. De exemplu, intrarea D0D0PUPAD0 modelează un 
traseu de 50 km. 

	d.	 Afișarea consumurilor totale ale tuturor autovehiculelor, 
în ordine ascendentă a valorilor obținute pentru traseul curent. 


 Programul va fi realizat cu respectarea convențiilor specifice limbajului Java de denumire și organizare a pachetelor, claselor proprietăților și metodelor, precum și a principiului de încapsulare specifice programării orientate pe obiecte.


 */
public class Exercitiul2 {

	public static void main(String[] args) {
	
		Scanner t = new Scanner(System.in);
		
		String optiune;
		ArrayList<Autovehicul> lista = new ArrayList<Autovehicul>();
		String traseu = new String();
		
		do {
			System.out.println("a. adaugare\n"
					+ "b. eliminare\n"
					+ "c. introducere traseu\n"
					+ "d. consumuri totale\n"
					+ "e. iesire");
			optiune = t.nextLine();
			
			switch(optiune)
			{
			case "a":
			{
				try {
					// citirea valorilor variabilelor
					System.out.println("nr inmatriculare:");
					String nrInm = t.nextLine();
					System.out.println("consum D0:");
					int consumD0 = t.nextInt();
					System.out.println("consum PU:");
					int consumPU = t.nextInt();
					System.out.println("consum PA:");
					int consumPA = t.nextInt();
					
					// crearea obiectului de tip Autovehicul
					Autovehicul a = new Autovehicul(nrInm, consumD0, consumPU, consumPA);
					// adaugarea in lista
					lista.add(a);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				// afisarea pentru verificarea adaugarii corecte
				System.out.println("----------------------------------------");
				for(int i=0; i<lista.size(); i++)
				{
					System.out.println(lista.get(i).getNrInmatriculare());
				}
				
				t.nextLine();
			}
			break;
			case "b":
			{
				try {
					System.out.println("Nr de sters:");
					// citire valoare ptr numarul de inmatriculare
					String nr = t.nextLine();
					
					for(int i=0; i<lista.size(); i++)
					{
						// vericare daca nr de inmatriculare curent este egal cu cel citit
						if(lista.get(i).getNrInmatriculare().equals( nr.trim() ))
						{
							lista.remove(i);
						}
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				// afisarea pentru verificarea eliminarii corecte
				System.out.println("----------------------------------------");
				for(int i=0; i<lista.size(); i++)
				{
					System.out.println(lista.get(i).getNrInmatriculare());
				}
			}
			break;
			case "c":
			{
				System.out.println("Introduceti traseul:");
				// citire traseu
				traseu = t.nextLine();
			}
			break;
			case "d":
			{
				// parcurgere lista element cu element
				for(int i=0; i<lista.size(); i++)
				{
					// instantiere variabila consum
					int consumT = 0;
					// parcurgere traseu
					for(int j=0; j<traseu.length()-1; j++)
					{
						// selectare portiuni de traseu (grupuri de 2 caractere consecutive)
						String portiune = traseu.substring(i, i+2);
						// adaugare valoare consum la consum total
						if(portiune.equals("D0"))
						{
							consumT += lista.get(i).getConsumD0()/10;
						}
						else if( portiune.equals("PU"))
						{
							consumT += lista.get(i).getConsumPU()/10;
						}
						else if(portiune.equals("PA"))
						{
							consumT += lista.get(i).getConsumPA()/10;
						}	
					}
					// setare valoare consum total
					lista.get(i).setConsumTotal(consumT);
				}
				
				// afisare numere de inmatriculare si consumuri totale
				for(int i=0; i<lista.size(); i++)
				{
					System.out.println(lista.get(i).getNrInmatriculare()
							+ " - " + lista.get(i).getConsumTotal());
				}
			}
			break;
			case "e":
				//iesire din program
				return;
			default:
				System.out.println("Nu este o optiune din meniu");
			}	
		}while(true);
	}

}
