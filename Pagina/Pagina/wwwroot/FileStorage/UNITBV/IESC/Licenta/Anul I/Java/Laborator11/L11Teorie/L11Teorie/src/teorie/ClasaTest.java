package teorie;

public class ClasaTest implements InterfataTest{
	// proprietati
	private int variabilaTest;

	// constructor
	public ClasaTest(int variabilaTest) 
	{
		this.variabilaTest = variabilaTest;
	}
	
	// implementarea metodei definite in interfata
	public void afisareTest()
	{
		System.out.println("Continutul metodei definite in interfata");
	}
	
	// alte metode
	public int getVariabilaTest()
	{
		return variabilaTest;
	}
	

}
