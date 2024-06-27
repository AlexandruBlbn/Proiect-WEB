package ex3;

import java.io.*;
import java.util.ArrayList;

// Laborator 12

/*
	EX3. Un angajat este caracterizat de nume, prenume, vârstă, postulOcupat, 
	aniExperiență, salariu. Creați o lista de angajați. 
     Calculați și afișați media de vârstă din cadrul firmei.
     Scrieți datele angajaților într-un fișier sub formă de obiecte.
     Pentru verificare citiți obiectele din fișier și afișați-le în consolă.

 */
public class Exercitiul3 {

	public static void main(String[] args) {
		// Creare lista
		ArrayList<Angajat> angajati = new ArrayList<Angajat>();
		
		angajati.add(new Angajat("Ionescu","Andrei", 25, "programator Java", 2, 1000));
		angajati.add(new Angajat("Popescu","Florin", 32, "programator Cpp", 10, 2500));
		angajati.add(new Angajat("Ionescu","Andreea", 40, "inginer", 17, 3000));
		angajati.add(new Angajat("Andrei","Claudia", 25, "programator C", 1, 1000));
		angajati.add(new Angajat("Florescu","George", 35, "inginer", 11, 2500));
		angajati.add(new Angajat("Popescu","Alexandra", 50, "inginer", 25, 5000));
		angajati.add(new Angajat("Alexandru","Matei", 28, "programator Java", 4, 1500));
		angajati.add(new Angajat("Ionescu","Cosmin", 28, "programator Java", 2, 1200));
		angajati.add(new Angajat("Constantin","Mihai", 42, "programator C", 20, 3500));
		angajati.add(new Angajat("Ionescu","Cristian", 58, "programator Java", 34, 6000));
		
		// scriere obiecte
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("angajati.txt"));
			
			for(int i=0; i<angajati.size(); i++)
			{
				out.writeObject(angajati.get(i));
			}
			
			out.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare: " + e);
		}
		
		// citire obiecte
		try {
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("angajati.txt"));
			
			for(int i=0; i<angajati.size(); i++)
			{
				Angajat angajat = (Angajat)in.readObject();
				System.out.println(angajat.toString());
			}
			
			in.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare: " + e);
		}

	}

}
