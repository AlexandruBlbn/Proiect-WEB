package l7Teorie;

public class ClasaTest {
	// PROPRIETATI
	public int var1 = 4; // proprietate cu modificator de acces public
	protected int var2 = 5; // proprietate cu modificator de acces protected 
	int var3 = 8; // proprietate cu modificator de acces implicit
	private int var4 = 10; // proprietate cu modificator de acces private
	
	
	
	// METODE
	
	// CONSTRUCTORI
	// constructor fara parametri
	public ClasaTest()
	{
		var3 = 10;
	}
	
	// constructor cu parametri
	public ClasaTest(int var1, int var2, int var3, int var4) {
		super();
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
		this.var4 = var4;
	}


	// metoda cu modificator de acces public
	public void metodaPublic()
	{
		System.out.println("Este o metoda publica");
	}
	
	// metoda cu modificator de acces protected
	protected void metodaProtected()
	{
		System.out.println("Este o metoda protected");
	}
	
	// metoda cu modificator de acces implicit
	void metodaImplicita()
	{
		System.out.println("Este o metoda implicita");
	}
	
	// metoda cu modificator de acces private
	private void metodaPrivate()
	{
		System.out.println("Este o metoda private");
	}
	

}
