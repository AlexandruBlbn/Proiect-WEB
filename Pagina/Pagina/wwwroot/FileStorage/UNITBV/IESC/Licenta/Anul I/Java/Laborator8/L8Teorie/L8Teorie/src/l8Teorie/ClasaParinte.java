package l8Teorie;

public class ClasaParinte {
	// proprietati
	public String nume;
	private int varsta;
	
	// constructor
	public ClasaParinte(String nume, int varsta)
	{
		this.nume = nume;
		this.varsta = varsta;
	}
	
	// getteri
	public String getNume()
	{
		return nume;
	}
	
	public int getVarsta()
	{
		return varsta;
	}
	
	// metoda cu modificator final
	public final void metodaFinal()
	{
		System.out.println("Metoda final din clasaParinte");
	}

}
