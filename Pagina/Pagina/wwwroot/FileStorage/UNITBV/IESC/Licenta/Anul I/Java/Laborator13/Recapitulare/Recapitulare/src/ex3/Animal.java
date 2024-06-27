package ex3;

public class Animal {
	// proprietati
	private String rasa;
	private String nume;
	
	// constructor
	public Animal(String rasa, String nume) {
		super();
		this.rasa = rasa;
		this.nume = nume;
	}

	// getteri si setteri
	public String getRasa() {
		return rasa;
	}


	public void setRasa(String rasa) {
		this.rasa = rasa;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}

	// metoda toString pentru afisarea obiectelor
	@Override
	public String toString() {
		return "rasa: " + rasa + " cu numele: " + nume;
	}
	
	
	
	
}
