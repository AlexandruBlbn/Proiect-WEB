package exercitiul1;

// clasa StudentLicenta mosteneste Persoana
public class StudentLicenta extends Persoana{
	// proprietati
	private double notaAdmitereLiceu;
	private double note[];
	
	// constructor
	public StudentLicenta(String nume, int varsta, double notaAdmitereLiceu, double[] note) {
		super(nume, varsta); // apelul constructorului din superclasa
		this.notaAdmitereLiceu = notaAdmitereLiceu;
		this.note = note;
	}

	// getteri
	public double getNotaAdmitereLiceu() {
		return notaAdmitereLiceu;
	}

	public double[] getNote() {
		return note;
	}
	
	// metoda pentru calculul mediei notelor
	public double media()
	{
		double media = 0;
		for( int i=0; i<note.length; i++)
		{
			media += note[i];
		}
		media = media/note.length;
		
		return media;
	}
}
