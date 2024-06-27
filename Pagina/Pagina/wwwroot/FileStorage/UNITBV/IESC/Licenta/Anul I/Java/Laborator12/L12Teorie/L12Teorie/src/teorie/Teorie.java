package teorie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


// Laborator 12
// Fluxuri de intrare-iesire. Fisiere

/*
	Pentru a comunica cu resurse externe este nevoie defluxuri de
comunicatie.
	FISIER = grup de octeti inruditi
	
	Pentru lucrul cu fisiere se va folosi clasa File.
	Metode utile: isFile(), renameTo(), isDirectory(), getPath() etc.
	
	Scrierea, adaugarea sau citirea unui fisier se poate realiza:
		- fara buffer
		- cu buffer
		
	Pentru citirea, adaugarea, scrierea de obiecte se utilizeaza 
interfata Serializable.
 */

public class Teorie{ 

	public static void main(String[] args) {
		
		// scrierea intr-un fisier
		// deoarece este vorba de resurse externe, este necesara tratarea exceptiilor
		try {
			// deschiderea unui flux
			BufferedWriter out = new BufferedWriter(new FileWriter("fisier.txt"));
			// daca fisierul transmis ca parametru se afla iun alta locatie decat 
			// cea a proiectului, atunci trebuie specificata intreaga cale 
			
			// scrierea unor mesaje
			out.write("Laborator 12");
			out.newLine();
			out.write("Fisiere");
			
			// dupa folosirea fluxurilor, acestea trebuie inchise
			out.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare la scrierea in fisier: " + e);
		}
		System.out.println("Scrierea in fisier s-a terminat!");

		
		
		// adaugarea intr-un fisier
		// deoarece este vorba de resurse externe, este necesara tratarea exceptiilor
		try {
			// deschiderea unui flux
			BufferedWriter out = new BufferedWriter(new FileWriter("fisier.txt", true));
			
			// adaugarea unor mesaje
			out.write("Laborator 12 - adaugat");
			out.newLine();
			out.write("Fisiere - adaugat");
			
			// dupa folosirea fluxurilor, acestea trebuie inchise
			out.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare la adaugarea in fisier: " + e);
		}
		System.out.println("Adaugarea in fisier s-a terminat!");
		
		
		
		// citirea dintr-un fisier
		// deoarece este vorba de resurse externe, este necesara tratarea exceptiilor
		try {
			// deschiderea unui flux
			BufferedReader in = new BufferedReader(new FileReader("fisier.txt"));
			
			// citirea unor mesaje linie cu linie
			String linie = in.readLine();
			while(linie != null)
			{
				System.out.println(linie);
				linie = in.readLine();
			}
			
			// dupa folosirea fluxurilor, acestea trebuie inchise
			in.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare la citirea din fisier: " + e);
		}
		System.out.println("Citirea din fisier s-a terminat!");
		
		
		
		
		// scrierea obiectelor intr-un fisier
		// deoarece este vorba de resurse externe, este necesara tratarea exceptiilor
		try {
			// deschiderea unui flux
			ObjectOutputStream outObj = new ObjectOutputStream(new FileOutputStream("fisierObj.txt"));
			// pentru adaugare, se adauga al doilea parametru cu valoare true
			
			// crearea unui obiect de tip ClasaTest
			ClasaTest obj = new ClasaTest(10);
			// scrierea unor mesaje
			outObj.writeObject(obj);
			
			// dupa folosirea fluxurilor, acestea trebuie inchise
			outObj.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare la scrierea obiectelor in fisier: " + e);
		}
		System.out.println("Scrierea obiectelor in fisier s-a terminat!");

		
		// citirea obiectelor dintr-un fisier
		// deoarece este vorba de resurse externe, este necesara tratarea exceptiilor
		try {
			// deschiderea unui flux
			ObjectInputStream inObj = new ObjectInputStream(new FileInputStream("fisierObj.txt"));

			// citirea obiect
			ClasaTest objRead = (ClasaTest)inObj.readObject();
			System.out.println("valoare proprietate: " + objRead.getProprietateTest());
				
			// dupa folosirea fluxurilor, acestea trebuie inchise
			inObj.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare la citirea obiectelor din fisier: " + e);
		}
		System.out.println("Citirea obiectelor din fisier s-a terminat!");
		
	}

}
