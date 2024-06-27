package ex1;

// interfata locuinta
public interface Locuinta {
	// constanta de tip sir de caractere
	public final String str = "Detalii locuinta";
	
	// definirea metodelor
	public String getTipLocuinta();
	public int getSuprafata();
	public int getNrCamere();
	
	public void setTipLocuinta(String tipLocuinta);
	public void setSuprafata(int suprafata);
	public void setNrCamere(int nrCamere);

}
