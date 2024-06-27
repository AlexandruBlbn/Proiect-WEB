package ex3;

// clasa Pisica mosteneste clasa Animal si implementeaza interfata Comparable(pentru sortarea elementelor)
public class Pisica extends Animal implements Comparable<Pisica>{
	// proprietati
	private int anNastere;

	// constructor
	public Pisica(String rasa, String nume, int anNastere) {
		super(rasa, nume);
		this.anNastere = anNastere;
	}

	// getteri si setteri
	public int getAnNastere() {
		return anNastere;
	}

	public void setAnNastere(int anNastere) {
		this.anNastere = anNastere;
	}

	// metoda toString pentru afisarea obiectelor
	@Override
	public String toString() {
		return "Pisica: " + super.toString() + " nascuta in " + anNastere;
	}

	// metoda compareTo pentru sortarea asecendenta dupa varsta
	@Override
	public int compareTo(Pisica o) {
		return o.anNastere - this.anNastere;
	}
	
	
}
