package exercitiul2;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercitiul2 {

	//metoda pentru adaugarea unui autovehicul(a)
	private static void adaugaAutovehicul(ArrayList<Autovehicul> autovehicule)
	{
		//obiectul de tip Scanner pentru introducerea valorii de la tastatura
		Scanner keyboard = new Scanner(System.in);
		//variabilele necesare pentru un autovehicul
		String nrInmatriculare;
		double consumD0;
		double consumPU;
		double consumPA;
		
		//citirea valorilor necesare
		System.out.println("nr inmatriculare:");
		nrInmatriculare = keyboard.nextLine();
		System.out.println("consum D0(drum cu panta neglijabila):");
		consumD0 = keyboard.nextDouble();
		System.out.println("consum PU(panta usoara): ");
		consumPU = keyboard.nextDouble();
		System.out.println("consum PA(panta accentuata):");
		consumPA = keyboard.nextDouble();
		
		//crearea unui obiect de tip Autovehicul pe baza constructorului cu parametri
		Autovehicul auto = new Autovehicul(nrInmatriculare.trim(),consumD0,consumPU,consumPA);
		//adaugarea obiectului in lista
		autovehicule.add(auto);
	}
	
	//metoda pentru eliminarea unui autovehicul(b)
	private static void eliminaAutovehicul(ArrayList<Autovehicul> autovehicule)
	{
		//obiectul de tip Scanner pentru citirea de la tastatura
		Scanner keyboard = new Scanner(System.in);
		//numarul de inmatriculare pe baza caruia se va elimina autovehiculul
		String nrInmatriculare;
		
		//citirea numarului de inmatriculare
		System.out.println("nr inmatriculare:");
		nrInmatriculare = keyboard.nextLine();
		
		//cautarea indexului autovehicului care va fi eliminat
		int indexGasit = -1;
		for(int i=0;i<autovehicule.size(); i++)
		{
			//daca numarul de inmatriculare al autovehicului de la pozitia i este acelasi cu cel citit
			//retine in indexGasit valoarea indexului
			if(autovehicule.get(i).getNrInmatriculare().equals(nrInmatriculare.trim()))
			{
				indexGasit = i;
				break;
			}
		}
		//daca indexul a fost gasit atunci autovehiculul va fi eliminat din lista
		if(indexGasit>=0)
			autovehicule.remove(indexGasit);
		else
			//altfel, afiseaza un mesaj corespunzator
			System.out.println("Elementul nu se afla in lista");
	}
	
	//metoda pentru citirea unui traseu(c)
	private static String introduTraseu()
	{
		Scanner keyboard = new Scanner(System.in);
		String traseu;
		
		System.out.println("traseu:");
		traseu = keyboard.nextLine();
		
		//metoda va returna sirul de caractere citit
		return traseu;
	}
	
	//metoda pentru calculul consumurilor conform traseului introdus(d) 
	private static void consumuri(String traseu, ArrayList<Autovehicul> autovehicule)
	{
		//lista pentru pastrarea portiunilor de traseu din traseul citit
		ArrayList<String> drum = new ArrayList<String>();
		
		//se parcurge traseu si se separa pe portiuni cu lungimea de 2 caractere
		for(int i=0;i<traseu.length()-1;i++)
		{
			String portiuneDrum = traseu.substring(i,i+2);
			//daca portiunea de drum extrasa este conform cerintei, adica D0, PA sau PU 
			//atunci va fi introdusa in lista de portiuni de drum
			if(portiuneDrum.equals("D0") || portiuneDrum.equals("PU") || portiuneDrum.equals("PA")) 
			{
				drum.add(portiuneDrum);
			}
		}
		
		//afiseaza drumul pe portiuni
		System.out.print("drum->");
		for(int i=0;i<drum.size();i++)
		{
			System.out.print(drum.get(i)+"->");
		}
		System.out.println();

		//se parcurge lista si se calculeaza consumul pentru fiecare autovehicul
		for(int i=0;i<autovehicule.size();i++)
		{
			//se initializeaza valoarea consumului cu 0 pentru fiecare autovehicul
			double consum = 0;
			//pentru fiecare portiune de drum se aduna valoarea corespunzatoare a consumului
			//in functie de valoarea portiunii de drum
			for(int j=0;j<drum.size();j++)
			{
				if(drum.get(j).equals("D0"))
				{
					System.out.println();
					consum += autovehicule.get(i).getConsumD0()/10;
				}
				if(drum.get(j).equals("PU"))
				{
					consum += autovehicule.get(i).getConsumPU()/10;
				}
				if(drum.get(j).equals("PA"))
				{
					consum += autovehicule.get(i).getConsumPA()/10;
				}
			}
			//se seteaza valoarea calculata pentru fiecare obiect din lista
			autovehicule.get(i).setConsumTotal(consum);
		}
		
		//se afiseaza lista de autovehicule		
		System.out.println("Autovehicule(nesortat)");
		for(int i=0;i<autovehicule.size();i++)
		{
			System.out.println(autovehicule.get(i).toString());
		}	
		System.out.println();
		
		//se sorteaza lista in functie de valoarea consumului total
		for (int i = 0; i < autovehicule.size(); i++) 
		{
	          for (int j = autovehicule.size() - 1; j > i; j--)
	          {
	              if (autovehicule.get(i).getConsumTotal() > autovehicule.get(j).getConsumTotal()) {

	                  Autovehicul aux = autovehicule.get(i);
	                  autovehicule.set(i,autovehicule.get(j)) ;
	                  autovehicule.set(j,aux);
	              }
	          }
	    }
		
		//se afiseaza lista de autovehicule dupa sortare
		System.out.println("Autovehicule(sortat)");
		for(int i=0;i<autovehicule.size();i++)
		{
			System.out.println(autovehicule.get(i).toString());
		}	
		System.out.println();
	}
	
	//metoda pentru afisarea elementelor din lista
	private static void afisare(ArrayList<Autovehicul>autovehicule)
	{
		//se parcurge lista element cu element si se afiseaza fiecare element in parte
		for(int i=0;i<autovehicule.size();i++)
		{
			System.out.println(autovehicule.get(i).toString());
		}
	}
	
	
	
	public static void main(String[] args) {
		//obiect de tip Scanner pentru citirea de la tastatura
		Scanner keyboard = new Scanner(System.in);
		
		//crearea unui vector cu dimensiune variabila
		ArrayList<Autovehicul> autovehicule = new ArrayList<Autovehicul>();
		//variabila de tip sir de caractere care va pastra traseul citit de la tastatura(subpunctul c)
		String traseu = new String();
		
		//crearea meniului conform cerintei
		//meniul se va repeta pana la oprirea programului de catre utilizator(introducerea valorii e)
		do {
			System.out.println("-----------MENIU-----------\n"
					         + "a. Adaugare autovehicul\n"
					         + "b. Eliminare autovehicul\n"
					         + "c. Introducere traseu\n"
					         + "d. Consumuri\n"
					         + "e. Iesire\n"
					         + "---------------------------\n"
					         + "Introduceti o optiune:");
			//citirea comenzii
			String comanda = keyboard.nextLine();
			//in functie de valoarea introdusa se va executa una dintre metodele
			switch(comanda)
			{
			case "a":
				//apelul metodei pentru adaugarea unui autovehicul
				adaugaAutovehicul(autovehicule);
				break;
			case "b":
				//afisarea listei de autovehicule inainte de eliminare
				afisare(autovehicule);
				//apelul metodei pentru eliminarea unui autovehicul
				eliminaAutovehicul(autovehicule);
				//afisarea listei de autovehicule dupa eliminare
				afisare(autovehicule);
				break;
			case "c":
				//introducerea traseului
				traseu = introduTraseu();
				break;
			case "d":
				//apelul metodei pentru calculul consumurilor
				consumuri(traseu, autovehicule);
				break;
			case "e":
			{
				//iesirea din program
				System.out.println("Multumim!");
				return;
			} 
			default:
				System.out.println("Nu este o optiune valida");
			}
		}while(true);
	}
}
