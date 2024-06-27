package exercitiul1;

// clasa StudentMaster mosteneste clasa Persoana
public class StudentMaster extends Persoana{
	// proprietati
	private double notaLicenta;
	private double note[];
	
	// constructor
	public StudentMaster(String nume, int varsta, double notaLicenta, double[] note) {
		super(nume, varsta); // apelul constructorului din superclasa
		this.notaLicenta = notaLicenta;
		this.note = note;
	}


	// getteri si setteri
	public double getNotaLicenta() {
		return notaLicenta;
	}

	public void setNotaAdmitereLiceu(double notaAdmitereLiceu) {
		this.notaLicenta = notaLicenta;
	}

	public double[] getNote() {
		return note;
	}

	public void setNote(double[] note) {
		this.note = note;
	}
	
	// metoda de calcul a mediei notelor
	public double media()
	{
		double med = 0;
		
		for(int i=0; i<note.length; i++)
		{
			med += note[i];
		}
		med = med/note.length;
		
		return med;
	}

}
