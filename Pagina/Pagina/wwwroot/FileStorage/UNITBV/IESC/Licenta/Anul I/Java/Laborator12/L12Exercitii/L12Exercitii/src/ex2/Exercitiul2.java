package ex2;

import java.io.*;
import java.util.ArrayList;

//Laborator 12

/*
	EX2. Creați un model pentru o Carte, definită de titlu, autor, anulPublicării, editură. 
	Citiți datele referitoare la ultimele cărți aduse în biblioteca din fisierul Biblioteca.txt.  
	Adăugați-le într-o listă și afișați-le în consolă.
 */
public class Exercitiul2 {

	public static void main(String[] args) {
		// lista in care se vor aduaga cartile
		ArrayList<Carte> biblioteca = new ArrayList<Carte>();
		
		// citire din fisier
		try {
			// deschidere flux
			BufferedReader in = new BufferedReader(
					new FileReader("biblioteca.txt"));
			
			String linie;
			while((linie = in.readLine()) != null)
			{
				// separare linie dupa ,(virgula)
				String[] c = linie.split(",");
				// creare obiect cu datele citite
				Carte carte = new Carte(c[0].trim(), c[1].trim(), Integer.valueOf(c[2].trim()), c[3].trim());
				// adaugare in lista
				biblioteca.add(carte);
			}
			
			// inchidere flux
			in.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare: " + e);
		}

		// afisare lista carti
		for(int i=0; i<biblioteca.size(); i++)
		{
			System.out.println(biblioteca.get(i));
		}
	}

}
