package exercitiul2;

// clasa Oras mosteneste clasa Localitate
public class Oras extends Localitate{
	// proprietati
	private int esteMunicipiu;
	private int esteResedinta;
	private int nrMonumente;
	
	//constructor
	public Oras(String nume, long nrLocuitori, String judet, double longitudine, double latitudine, int esteMunicipiu,
			int esteResedinta, int nrMonumente) {
		super(nume, nrLocuitori, judet, longitudine, latitudine); // apelul cosntructorului superclasei
		this.esteMunicipiu = esteMunicipiu;
		this.esteResedinta = esteResedinta;
		this.nrMonumente = nrMonumente;
	}

	
	// getteri si setteri
	public int getEsteMunicipiu() {
		return esteMunicipiu;
	}

	public void setEsteMunicipiu(int esteMunicipiu) {
		this.esteMunicipiu = esteMunicipiu;
	}

	public int getEsteResedinta() {
		return esteResedinta;
	}

	public void setEsteResedinta(int esteResedinta) {
		this.esteResedinta = esteResedinta;
	}

	public int getNrMonumente() {
		return nrMonumente;
	}

	public void setNrMonumente(int nrMonumente) {
		this.nrMonumente = nrMonumente;
	}
	
}
