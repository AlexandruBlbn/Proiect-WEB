package ex3;

// clasa Caine mosteneste clasa Animal si implementeaza interfata Comparable (pentru sortarea elementelor)   
public class Caine extends Animal implements Comparable<Caine>{
	// proprietati
	private int varsta;
	private String numeStapan;
	
	// constructori
	public Caine(String rasa, String nume, int varsta, String numeStapan) {
		super(rasa, nume);
		this.varsta = varsta;
		this.numeStapan = numeStapan;
	}

	// getteri si setteri
	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getNumeStapan() {
		return numeStapan;
	}

	public void setNumeStapan(String numeStapan) {
		this.numeStapan = numeStapan;
	}

	// metoda toString pentru afisarea obiectelor
	@Override
	public String toString() {
		return "Cainele din "+ super.toString() + " in varsta de " + varsta + " ani si stapan: " + numeStapan;
	}

	// metoda compareTo pentru sortarea alfabetica dupa numele stapanului
	@Override
	public int compareTo(Caine o) {
		
		//return this.numeStapan.compareTo(o.numeStapan);
		//sau
		return this.numeStapan.compareToIgnoreCase(o.numeStapan);
	}

	
	
}
