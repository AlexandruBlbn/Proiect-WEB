package ex2;

public class Carte {
	// proprietati
	private String titlu;
	private String autor;
	private int anulPublicarii;
	private String editura;
	
	// constructor
	public Carte(String titlu, String autor, int anulPublicarii, String editura) {
		super();
		this.titlu = titlu;
		this.autor = autor;
		this.anulPublicarii = anulPublicarii;
		this.editura = editura;
	}

	// getteri si setteri
	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnulPublicarii() {
		return anulPublicarii;
	}

	public void setAnulPublicarii(int anulPublicarii) {
		this.anulPublicarii = anulPublicarii;
	}

	public String getEditura() {
		return editura;
	}

	public void setEditura(String editura) {
		this.editura = editura;
	}

	// metoda toString pentru afisare mesaj in consola
	@Override
	public String toString() {
		return "Carte: " + titlu + " - " + autor + " - " + 
				anulPublicarii + " - " + editura ;
	}
	
	
	
}
