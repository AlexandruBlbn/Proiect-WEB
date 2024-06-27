package l8Teorie;

//Laborator 8
//Mostenire

/*
 Clasa copil (subclasa) mosteneste proprietatile si metodele public si protected ale 
 clasei parinte (superclasei).
 
  Regula : este-un / este-o
  
  Mostenirea se face folosind cuvatul cheie: extends
  
  Mostenirea este unidirectionala si unica.
  
  Constructorul superclasei este apelat folosind super()
 */

public class Teorie {

	public static void main(String[] args) {
		
		System.out.println("Exemplificare obiect de tipul ClasaParinte:");
		ClasaParinte p = new ClasaParinte("numeTest", 10);
		// folosire metode din clasa ClasaParinte
		System.out.println("Nume si varsta: " + p.getNume() + ", " + p.getVarsta());
		
		
		System.out.println("\nExemplificare obiect de tipul ClasaCopil:");
		ClasaCopil c = new ClasaCopil("Nume1", 12, "Prenume1");
		// exemplu folosire metoda din subclasa
		c.afisare();
		// exemplu folosire metode mostenite 
		System.out.println(c.getNume() + " -> "+ c.getVarsta());
		// exemplu folosire metoda cu modificator final
		c.metodaFinal();
	}

}
