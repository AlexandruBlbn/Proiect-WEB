package ex2Comparable;

public class Patrat implements Patrulater, Comparable<Patrat>{
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

	
	// metoda implementata din interfata Comparable
	@Override
	public int compareTo(Patrat o) {
		return o.calculeazaAria() - this.calculeazaAria();
	}
	
	
	// alte metode
	@Override
	public String toString() {
		return "Patrat [latura=" + latura + ", A=" + calculeazaAria() + "]";
	}

	
	
}
