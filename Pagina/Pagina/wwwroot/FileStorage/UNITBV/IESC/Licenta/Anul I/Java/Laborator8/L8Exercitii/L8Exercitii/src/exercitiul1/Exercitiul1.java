package exercitiul1;

import java.util.Scanner;

/*
 Ex1. Creați clasa Persoana cu proprietățile nume, varsta. 
	Creați clasa StudentLicenta cu proprietățile notaAdmitereLiceu, note  
și clasa StudentMaster cu proprietatile notaLicenta, note. 
	Verificați dacă clasa Persoana poate fi moștenită de clasele StudentLicenta 
și StudentMaster. Dacă da, atunci implementați moștenirea. 

	Creați un obiect de tip StudentLicenta și afișați datele sub forma: 
		Studentul <nume>, in varsta de <varsta> ani, este student la licenta 
avand nota de admitere <notaAdmitereLiceu> si media in anul curent: <media>.

	Creați un obiect de tip StudentMaster și afișați datele sub forma: 
		Studentul <nume>, in varsta de <varsta> ani, este student la master 
avand nota proiectului de diploma <notaLicenta> si media in anul curent: <media>.
 */
public class Exercitiul1 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Nume:");
		String nume = t.nextLine();
		System.out.println("Varsta:");
		int v = t.nextInt();
		System.out.println("Nota admitere liceu:");
		double nota = t.nextDouble();
		System.out.println("Note: ");
		double note[] = new double[3];
		for(int i=0;i<3;i++)
		{
			note[i] = t.nextDouble();
		}
		
		StudentLicenta s1 = new StudentLicenta(nume, v, nota, note);
		
		System.out.println("Studentul " + s1.getNume() + ", in varsta de " + 
				s1.getVarsta() + " ani, este student la licenta avand nota de admitere "
				+ s1.getNotaAdmitereLiceu() + " si media in anul curent " + s1.media());
	
		
		
		t.nextLine();
		System.out.println("Nume:");
		nume = t.nextLine();
		System.out.println("Varsta:");
		v = t.nextInt();
		System.out.println("Nota licenta:");
		double notaL = t.nextDouble();
		System.out.println("Note: ");
		note = new double[3];
		for(int i=0; i<note.length; i++)
		{
			note[i] = t.nextDouble();
		}
		
		StudentMaster s2 = new StudentMaster(nume, v, notaL, note);

		System.out.println("Studentul " + s2.getNume() + ", in varsta de " + s2.getVarsta() 
			+ " ani, este student la master avand nota proiectului de diploma " + s2.getNotaLicenta() 
			+ " si media in anul curent: " + s2.media());
		
	}

}
