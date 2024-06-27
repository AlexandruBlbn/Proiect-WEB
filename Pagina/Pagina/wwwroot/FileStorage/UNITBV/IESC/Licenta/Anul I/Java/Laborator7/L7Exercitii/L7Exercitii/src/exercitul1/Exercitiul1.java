package exercitul1;

import java.util.Scanner;

public class Exercitiul1 {
	
	/* Ex1.	Scrieți un program care: 
		a.	Definește o clasă care modelează un dreptunghi determinat din 
		două puncte într-un sistem de coordonate cartezian. 
		(Un punct într-un sistem de coordinate cartezian este definit prin 
		abscisa punctului și ordonata punctului)
		b.	Cere utilizatorului introducerea datelor pentru 5 dreptunghiuri. 
		c.	Calculează lungimea și lățimea corespunzătoare fiecărui dreptunghi
		și afișează-le. 
		d.	Calculează aria fiecărui dreptunghi și afișează pe ecran rezultatele.
		e.	Afișează pe ecran suprafața totală ocupată de aceste dreptunghiuri. 
		f.	Afișează pe ecran dreptunghiurile  cu cea mai mare și cea mai mică 
		arie.
	*/

	public static void main(String[] args) {
		
		// b. citirea valorilor pentru 5 dreptunghiuri
		Scanner t = new Scanner(System.in);
		
		Dreptunghi d[] = new Dreptunghi[5]; // un tablou cu 5 elemente va pastra datele celor 5 dreptunghiuri
		
		for(int i=0; i<5; i++)
		{
			int x, y;
			// se citesc coordonatele x si y ale punctului A
			System.out.print("A.x = ");
			x = t.nextInt();
			System.out.print("A.y = ");
			y = t.nextInt();
			// se construieste punctul A
			Punct A = new Punct(x,y);
			
			// se citesc coordonatele x si y ale punctului B
			System.out.print("B.x = ");
			x = t.nextInt();
			System.out.print("B.y = ");
			y = t.nextInt();
			// se construieste punctul B
			Punct B = new Punct(x,y);
			
			// se construieste elementul curent al tabloului pe baza punctelor A si B
			d[i] = new Dreptunghi(A,B);
		}
		
		// afisarea elementelor tabloului
		for(int i=0; i<5; i++)
		{
			System.out.println( d[i] );
		}
		
		// c. afisarea valorilor lungimii si latimii fiecarui dreptunghi
		// pe baza metodelor calculeazaLungimea() si calculeazaLatimea()
		for(int i=0;i<5;i++)
		{
			System.out.println("Lungimea dreptunghiului " 
					+ i + " este " + d[i].calculeazaLungimea());
			System.out.println("Latimea dreptunghiului "
					+ i + " este " + d[i].calculeazaLatimea());
		}
		
		// d. afisarea valorii ariei pentru fiecare dreptunghi
		// pe baza metodei calculeazaAria()
		for(int i=0; i<5; i++)
		{
			System.out.println("Aria dreptunghiului " +
					+ i + " este " + d[i].calculeazaAria());
		}
		
		// e. calculul suprafetei totale
		int suma = 0;
		for(int i=0;i<5;i++)
		{
			suma += d[i].calculeazaAria();
		}
		System.out.println("Aria totala: " + suma);
		
		// f. afisarea dreptunghiului cu aria cea mai mare si cea mai mica
		int max = d[0].calculeazaAria(); // se initializeaza max cu valoarea ariei primului element
		int indexMax = 0; // se initializeaza pozitia maximului cu 0
		
		// se verifica care element depaseste maximul
		for(int i=0;i<5;i++)
		{
			if(max < d[i].calculeazaAria())
			{
				max = d[i].calculeazaAria(); // max devine aria elementului curent
				indexMax = i; // indexMax devine pozitia curent din tablou
			}
		}
		// se afiseaza elementul caruia ii corespunde aria maxima
		System.out.println( d[indexMax] );
		
		
		int min = d[0].calculeazaAria(); // se initializeaza min cu valoarea ariei primului element
		int indexMin = 0; // se initializeaza pozitia minimului cu 0
		
		// se verifica care element este mai mic decat minimul
		for(int i=0;i<5;i++)
		{
			if(min > d[i].calculeazaAria())
			{
				min = d[i].calculeazaAria(); // min devine aria elementului curent
				indexMin = i; // indexMin devine pozitia curent din tablou
			}
		}
		// se afiseaza elementul caruia ii corespunde aria minima
		System.out.println( d[indexMin] );
	}

}
