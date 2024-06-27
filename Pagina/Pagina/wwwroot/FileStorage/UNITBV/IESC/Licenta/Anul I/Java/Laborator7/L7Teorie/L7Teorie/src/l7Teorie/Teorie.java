package l7Teorie;

//Laborator 7
//Clase si POO

//O clasa contine proprietati si metode
//Principiile POO: incapsulare, abstractizare, mostenire, polimorfism

/*
 Modificatorii de acces:
 -> pentru clasa: public sau implicit
 -> pentru proprietati/metode:
 	-> public 
 		-> vizibil in clasa, in subclasa, in pachet, in zona publica
 	-> protected
 		-> vizibil in clasa, in subclasa, in pachet
 	-> implicit
 		-> vizibil in clasa, in pachet
 	-> private
 		-> vizibil in clasa
 		
 -> final
 	-> pentru proprietate: proprietate este o constanta
 		final int x = 8;
 	-> pentru metode: metoda nu mai poate fi suprascrisa in subclasa
 	-> pentru clasa: nu poate fi mostenita
 	
 -> static
  	-> daca este aplicat unei proprietati/metode => proprietate/metoda de clasa
  		ClasaX.proprietateY;
  	-> daca NU este aplicat unei proprietati/metode => proprietate/metoda de instanta
  		ClasaX  obiect = new ClasaX();
  		obiect.proprietateY;
 */

public class Teorie {

	public static void main(String[] args) {
		
		// crearea unei instante de tipul clasei ClasaTest
		ClasaTest o = new ClasaTest();
		
		// exemplificare folosire modificatori de acces pentru 
		// proprietatile clasei ClasaTest
		System.out.println("var1: " + o.var1);
		System.out.println("var2: " + o.var2);
		System.out.println("var3: " + o.var3);
		//System.out.println("var4: " + o.var4); - nu este vizibil in afara clasei
		
		// exemplificare folosire modificatori de acces pentru 
		// metodele clasei ClasaTest
		o.metodaPublic();
		o.metodaProtected();
		o.metodaImplicita();
		//o.metodaPrivate(); - nu este vizibil in afara clasei
			
	}

}
