package l8Teorie;

// clasa ClasaCopil mosteneste ClasaParinte
public class ClasaCopil extends ClasaParinte{
	// proprietati
	public String prenume;
	
	// constructor
	public ClasaCopil(String nume, int varsta, String prenume)
	{
		super(nume, varsta); // apelul constructorului din superclasa
		this.prenume = prenume;
	}
	
	// metoda de afisare cu priorietate mostenite si proprietate proprie
	public void afisare()
	{
		System.out.println(nume + " " + prenume);
	}
	
	// incercare de supradefinire a metodei metodaFinal()
	public void metodaFinal2() // metodaFinal() nu poate fi supradefinita
	{
		System.out.println("Metoda din clasaCopil");
	}

}
