package ex1;

import java.io.*;
import java.util.ArrayList;

public class Exercitiul1 {

	public static void main(String[] args) {

		ArrayList<Arbore> arbori = new ArrayList<Arbore>();
		
		arbori.add(new Arbore("brad", "conifere", 15, 5, "aciforma"));
		arbori.add(new Arbore("mar", "foioase", 3, 2, "ovala"));
		arbori.add(new Arbore("stejar", "foioase", 10, 4, "lobata"));
		arbori.add(new Arbore("tei", "foioase", 30, 20, "rotunde"));

		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter(		this.denumire = denumire;
			this.gen = gen;
			this.inaltime = inaltime;
			this.varsta = varsta;
			this.tipFrunza = tipFrunza;
		}"arbori.txt"));

			for(int i=0; i<arbori.size(); i++)
			{
				out.write(arbori.get(i).toString());
				out.newLine();
			}
			out.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare: " +  e);
		}
		
	}

}
