package t3;

import java.util.ArrayList;
import java.util.Scanner;


public class Tema3 {

	//metoda pentru adaugarea unei planeta
	private static void adaugaPlaneta(ArrayList<Planeta> planete)
	{
		//obiectul de tip Scanner pentru introducerea valorii de la tastatura
		Scanner keyboard = new Scanner(System.in);
		//variabilele necesare pentru un autovehicul
		String DenumirePlaneta;
		double X;
		double Y;
		double Z;
		double pozitie;
		
		//citirea valorilor necesare
		try
		{
		System.out.println("Denumire Planeta:");
		DenumirePlaneta = keyboard.nextLine();
		System.out.println("X:");
		X = keyboard.nextDouble();
		System.out.println("Y ");
		Y = keyboard.nextDouble();
		System.out.println("Z");
		Z = keyboard.nextDouble();
		pozitie=X+Y+Z;
		//crearea unui obiect de tip Planeta pe baza constructorului cu parametri
		Planeta auto = new Planeta(DenumirePlaneta.trim(),X,Y,Z,pozitie);
		//adaugarea obiectului in lista
		planete.add(auto);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//metoda pentru eliminarea unui autovehicul(b)
	private static void eliminaPlaneta(ArrayList<Planeta> planete)
	{
		//obiectul de tip Scanner pentru citirea de la tastatura
		Scanner keyboard = new Scanner(System.in);
		//denumirea planetei pe baza caruia se va elimina autovehiculul
		String DenumirePlaneta;
		
		//citirea denumirii planetei
		try {
		System.out.println("DenumirePlaneta:");
		DenumirePlaneta= keyboard.nextLine();
		
		//cautarea indexului planetei care va fi eliminat
		int indexGasit = -1;
		for(int i=0;i<planete.size(); i++)
		{
			if(planete.get(i).getDenumirePlaneta().equals(DenumirePlaneta.trim()))
			{
				indexGasit = i;
				break;
			}
		}
		//daca indexul a fost gasit atunci autovehiculul va fi eliminat din lista
		if(indexGasit>=0)
			planete.remove(indexGasit);
		else
			//altfel, afiseaza un mesaj corespunzator
			System.out.println("Elementul nu se afla in lista");
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//metoda pentru citirea unui itinerariu(c)
	private static void introduItinerariu(ArrayList<String> itinerariu)
	{
	Scanner keyboard = new Scanner(System.in);
	String itinerariul;
	  
		System.out.println("itinerariu:");
		itinerariul = keyboard.nextLine();
		itinerariu.add(itinerariul);
	}
	
//	//metoda pentru calcul conform traseului introdus(d) 
	private static void timp(ArrayList<String> itinerariu, ArrayList<Planeta>planete)
	{
	     double sumaitinerariu=0;
		
		for(int i=0;i<planete.size();i++)
		{
		     for(int j=0;j<itinerariu.size();j++)
		     {
		    	 
		    	 
		    	 if(planete.get(j).getDenumirePlaneta().equals(itinerariu.get(i)))
		    	 {
		    		 
		    		 if(i==0)
		    		 {
		    		 sumaitinerariu=planete.get(i).getpozitie();
		    		 }
		    		 if(i!=0)
		    		 {
		    		 double x=planete.get(j).getX()-planete.get(i).getX();
		    		 double y=planete.get(j).getY()-planete.get(i).getY();
		    		 double z=planete.get(j).getZ()-planete.get(i).getZ();
		    		 sumaitinerariu=sumaitinerariu + Math.abs(x)+Math.abs(y)+Math.abs(z);
		    		 }
		    		 
		    	 }
		    	 
		     }
		     
		    	 
		}
		
	System.out.println("In" + sumaitinerariu + "parcurge nava");
	}
//	
	//metoda pentru afisarea elementelor din lista
	private static void afisare(ArrayList<Planeta>planete)
	{
		//se parcurge lista element cu element si se afiseaza fiecare element in parte
		for(int i=0;i<planete.size();i++)
		{
		System.out.println(planete.get(i).toString());
		}
}

	
	
	public static void main(String[] args) {
		//obiect de tip Scanner pentru citirea de la tastatura
		Scanner keyboard = new Scanner(System.in);
		
		//crearea unui vector cu dimensiune variabila
		ArrayList<Planeta> planete = new ArrayList<Planeta>();
		//variabila de tip sir de caractere care va pastra traseul citit de la tastatura(subpunctul c)
		ArrayList<String> itinerariu = new ArrayList<String>();
		
		//crearea meniului conform cerintei
		//meniul se va repeta pana la oprirea programului de catre utilizator(introducerea valorii e)
		do {
			System.out.println("-----------MENIU-----------\n"
					         + "a. Adaugare planeta\n"
					         + "b. Eliminare planeta\n"
					         + "c. Introducere itinerariu\n"
					         + "d. Timp total obtinut\n"
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
				adaugaPlaneta(planete);
				break;
			case "b":
				//afisarea listei de autovehicule inainte de eliminare
				afisare(planete);
				//apelul metodei pentru eliminarea unui autovehicul
				eliminaPlaneta(planete);
				//afisarea listei de autovehicule dupa eliminare
				afisare(planete);
				break;
			case "c":
//				introducerea traseului itinerariului
				introduItinerariu(itinerariu);
				break;
			case "d":
				//apelul metodei pentru calculul timpului
			timp(itinerariu, planete);
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
