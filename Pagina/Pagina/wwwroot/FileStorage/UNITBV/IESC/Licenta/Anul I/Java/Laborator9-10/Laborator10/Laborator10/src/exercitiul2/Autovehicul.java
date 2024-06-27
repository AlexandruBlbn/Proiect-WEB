package exercitiul2;

public class Autovehicul {
	private String nrInmatriculare;
	private int consumD0;
	private int consumPU;
	private int consumPA;
	// pentru subpunctul d)
	private int consumTotal;
	
	// constructor cu parametri
	public Autovehicul(String nrInmatriculare, int consumD0, int consumPU, int consumPA)
	{
		this.nrInmatriculare = nrInmatriculare;
		this.consumD0 = consumD0;
		this.consumPU = consumPU;
		this.consumPA = consumPA;
	}

	// getteri si setteri
	public String getNrInmatriculare() {
		return nrInmatriculare;
	}

	public void setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}

	public int getConsumD0() {
		return consumD0;
	}

	public void setConsumD0(int consumD0) {
		this.consumD0 = consumD0;
	}

	public int getConsumPU() {
		return consumPU;
	}

	public void setConsumPU(int consumPU) {
		this.consumPU = consumPU;
	}

	public int getConsumPA() {
		return consumPA;
	}

	public void setConsumPA(int consumPA) {
		this.consumPA = consumPA;
	}
	
	
	// pentru subpunctul d)
	public int getConsumTotal()
	{
		return consumTotal;
	}
	
	public void setConsumTotal(int consumTotal)
	{
		this.consumTotal = consumTotal;
	}

}
