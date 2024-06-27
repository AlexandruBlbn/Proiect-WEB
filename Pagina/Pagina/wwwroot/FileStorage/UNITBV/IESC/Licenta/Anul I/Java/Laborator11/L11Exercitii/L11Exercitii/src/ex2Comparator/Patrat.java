package ex2Comparator;

public class Patrat implements Patrulater{
	// proprietati
	private int latura;
	
	// constructor cu parametri
	public Patrat(int latura)
	{
		this.latura = latura;
	}
	
	// getter si setter
	public int getLatura() {
		return latura;
	}

	public void setLatura(int latura) {
		this.latura = latura;
	}

	
	// metode implementate din interfata Locuinta
	public int calculeazaPerimetrul()
	{
		return 4*latura;
	}
	
	public int calculeazaAria()
	{
		return latura*latura;
	}

	// alte metode
	@Override
	public String toString() {
		return "Patrat [latura=" + latura + ", A=" + calculeazaAria() + "]";
	}
	
	
}
