package ex1;

// clasa implementeaza interfata Locuinta
//si interfata Comparable pentru sortarea descendenta dupa suprafata
public class Casa implements Locuinta, Comparable<Casa> {
	// proprietati
	private String tipLocuinta;
	private int suprafata;
	private int nrCamere;
	private int nrBai;
	
	// constructor
	public Casa(String tipLocuinta, int suprafata, int nrCamere, int nrBai) 
	{
		this.tipLocuinta = tipLocuinta;
		this.suprafata = suprafata;
		this.nrCamere = nrCamere;
		this.nrBai = nrBai;
	}
	
	
	// implementarea metodelor definite in interfata
	public String getTipLocuinta() 
	{
		return tipLocuinta;
	}
	public int getSuprafata()
	{
		return suprafata;
	}
	public int getNrCamere()
	{
		return nrCamere;
	}
	
	public void setTipLocuinta(String tipLocuinta)
	{
		this.tipLocuinta = tipLocuinta;
	}
	public void setSuprafata(int suprafata)
	{
		this.suprafata = suprafata;
	}
	public void setNrCamere(int nrCamere)
	{
		this.nrCamere = nrCamere;
	}

	
	// alte metode
	public int getNrBai() {
		return nrBai;
	}

	public void setNrBai(int nrBai) {
		this.nrBai = nrBai;
	}


	@Override
	public String toString() {
		return "Casa [tipLocuinta=" + tipLocuinta + ", suprafata=" + suprafata + ", nrCamere=" + nrCamere + ", nrBai="
				+ nrBai + "]";
	}


	// implementarea metodei compareTo din interfata Comparable
	@Override
	public int compareTo(Casa o) {
		if(this.suprafata > o.suprafata)
			return -1;
		else if(this.suprafata == o.suprafata)
			return 0;
		else
			return 1;
	}
	
}
