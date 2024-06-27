package ex3;

import java.io.Serializable;

public class Angajat implements Serializable{
	// proprietati
	private String nume;
	private String prenume;
	private int varsta;
	private String postulOcupat;
	private int aniExperienta;
	private int salariu;
	
	// constructor
	public Angajat(String nume, String prenume, int varsta, String postulOcupat, int aniExperienta, int salariu) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.postulOcupat = postulOcupat;
		this.aniExperienta = aniExperienta;
		this.salariu = salariu;
	}


	// getteri si setteri
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getPostulOcupat() {
		return postulOcupat;
	}

	public void setPostulOcupat(String postulOcupat) {
		this.postulOcupat = postulOcupat;
	}

	public int getAniExperienta() {
		return aniExperienta;
	}

	public void setAniExperienta(int aniExperienta) {
		this.aniExperienta = aniExperienta;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}


	// metoda toStirng pentru afisare in consola
	@Override
	public String toString() {
		return "Angajat [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", postulOcupat="
				+ postulOcupat + ", aniExperienta=" + aniExperienta + ", salariu=" + salariu + "]";
	}
	
	
}
