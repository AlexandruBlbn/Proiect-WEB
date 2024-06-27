package exercitiul2;

public class Autovehicul {
	//proprietati
	private String nrInmatriculare;
	private double consumD0;
	private double consumPU;
	private double consumPA;
	private double consumTotal;

	//constructor cu parametri
	public Autovehicul(String nrInmatriculare, double consumD0, double consumPU, double consumPA) {
		this.nrInmatriculare = nrInmatriculare;
		this.consumD0 = consumD0;
		this.consumPU = consumPU;
		this.consumPA = consumPA;
		this.consumTotal = 0;
	}

	//metode
	//metoda pentru preluarea numarului de inmatriculare
	public String getNrInmatriculare() {
		return nrInmatriculare;
	}

	//metoda pentru preluarea consumului pe drum cu panta neglijabila
	public double getConsumD0() {
		return consumD0;
	}

	//metoda pentru preluarea consumului pe drum cu panta usoara
	public double getConsumPU() {
		return consumPU;
	}

	//metoda pentru preluarea consumului pe drum cu panta accentuata
	public double getConsumPA() {
		return consumPA;
	}
	
	
	//metoda pentru preluarea consumului total(necesar subpunctului d)
	public double getConsumTotal() {
		return consumTotal;
	}

	//metoda pentru setarea valorii consumului total(necesar subpunctului d)
	public void setConsumTotal(double consumTotal) {
		this.consumTotal = consumTotal;
	}

	
	//supradefinirea metodei toString
	//pentru afisarea proprietatilor in forma dorita
	@Override
	public String toString() {
		return "Autovehicul [nrInmatriculare=" + nrInmatriculare + ", consumD0=" + consumD0 + ", consumPU=" + consumPU
				+ ", consumPA=" + consumPA + ", consumTotal=" + consumTotal + "]";
	}
	
	
	

}
