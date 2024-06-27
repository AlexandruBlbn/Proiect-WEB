package teorie;

// Laborator 11
// Interfete

/*
 - implementeaza conceptul POO de separare modelului de implementarea sa
 - defineste metode, dar NU le implementeaza (eventual constantele)
 
 - cuvant cheie: implements
 
 <modificator acces> interface <nume>
 {
 	definire metode
 }
 
 - interfete utile: Comparable, Comparator, Serializable
 */

public class Teorie {

	public static void main(String[] args) {
		
		ClasaTest c = new ClasaTest(25);
		
		c.afisareTest();
		System.out.println("Constanta din interfata: " + c.constantaTest);
		System.out.println("Proprietate din clasa: " + c.getVariabilaTest());
	}

}
