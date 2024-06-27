package exercitiul2;

public class Localitate {
	// proprietati
	private String nume;
	private long nrLocuitori;
	private String judet;
	private double longitudine;
	private double latitudine;
	
	// constructor
	public Localitate(String nume, long nrLocuitori, String judet, double longitudine, double latitudine) {
		super();
		this.nume = nume;
		this.nrLocuitori = nrLocuitori;
		this.judet = judet;
		this.longitudine = longitudine;
		this.latitudine = latitudine;
	}

	// getteri si setteri
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public long getNrLocuitori() {
		return nrLocuitori;
	}

	public void setNrLocuitori(long nrLocuitori) {
		this.nrLocuitori = nrLocuitori;
	}

	public String getJudet() {
		return judet;
	}

	public void setJudet(String judet) {
		this.judet = judet;
	}

	public double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}

	public double getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}
	
}
