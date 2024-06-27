package ex2Comparable;

public class Dreptunghi implements Patrulater, Comparable<Dreptunghi>{
	// proprietati
	private int lungime;
	private int latime;
	
	// constructor cu parametri
	public Dreptunghi(int lungime, int latime) {
		this.lungime = lungime;
		this.latime = latime;
	}

	// getteri si setteri
	public int getLungime() {
		return lungime;
	}

	public void setLungime(int lungime) {
		this.lungime = lungime;
	}

	public int getLatime() {
		return latime;
	}

	public void setLatime(int latime) {
		this.latime = latime;
	}

	
	// metode implementate din interfata Locuinta
	public int calculeazaPerimetrul() {
		return 2*lungime + 2*latime;
	}

	public int calculeazaAria() {
		return lungime*latime;
	}

	
	// metoda implementata din Comparable
	@Override
	public int compareTo(Dreptunghi o) {
		return this.calculeazaPerimetrul() - o.calculeazaPerimetrul();
	}
	
	
	// alte metode
	@Override
	public String toString() {
		return "Dreptunghi [lungime=" + lungime + ", latime=" + latime 
				+ ", P=" + calculeazaPerimetrul() + "]";
	}


}
