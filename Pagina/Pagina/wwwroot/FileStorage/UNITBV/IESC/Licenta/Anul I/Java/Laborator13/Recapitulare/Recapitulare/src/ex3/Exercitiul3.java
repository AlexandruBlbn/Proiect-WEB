package ex3;

import java.util.ArrayList;
import java.util.Collections;

// Recapitulare

/*
	Ex3. Creati clasa Animal ce contine proprietatile rasa, nume.
	Creati clasa Caine, cu proprietatile varsta, numeStapan. Clasa va mosteni clasa Animal.
	Creati clasa Pisica, cu proprietatea anNastere. Clasa va mosteni clasa Animal.
	Creati o lista de caini si una de pisici, si afisati-le in consola.
	Sortati lista de caini alfabetic dupa numele stapanului si cea de pisici ascendent dupa varsta acestora.
 */
public class Exercitiul3 {

	public static void main(String[] args) {
		
		// creare lista
		ArrayList<Caine> catei = new ArrayList<Caine>();
		// adaugare elemente
		catei.add(new Caine("doberman", "Rex", 5, "Andreea"));
		catei.add(new Caine("golden retriever", "Ralph", 4, "Mihai"));
		catei.add(new Caine("chihuahua", "Pufi", 2, "Valentina"));
		catei.add(new Caine("setter irlandez", "Bick", 8, "Alin"));
		
		// afisare lista
		System.out.println("Lista caini inainte de sortare:");
		for(int i=0; i<catei.size(); i++)
		{
			System.out.println("\t" + catei.get(i));
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		// sortare lista
		Collections.sort(catei);
		
		// afisare lista
		System.out.println("Lista caini dupa de sortare alfabetica dupa stapan:");
		for(int i=0; i<catei.size(); i++)
		{
			System.out.println("\t" + catei.get(i));
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("\n\n");
		
		// creare lista
		ArrayList<Pisica> pisici = new ArrayList<Pisica>();
		// adaugare elemente
		pisici.add(new Pisica("british", "Berlioz", 2018));
		pisici.add(new Pisica("persan", "Lady", 2020));
		pisici.add(new Pisica("sfinx", "Marie", 2022));
		pisici.add(new Pisica("siamez", "Toulouse", 2019));
		
		// afisare lista
		System.out.println("Lista pisici inainte de sortare:");
		for(int i=0; i<pisici.size(); i++)
		{
			System.out.println("\t" + pisici.get(i));
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		// sortare lista
		Collections.sort(pisici);
		
		// afisare lista		
		System.out.println("Lista pisici dupa de sortare ascendenta dupa varsta:");
		for(int i=0; i<pisici.size(); i++)
		{
			System.out.println("\t" + pisici.get(i));
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		
	}

}
