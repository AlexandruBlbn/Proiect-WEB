package exercitul1;

// clasa defineste un dreptunghi prin 2 puncte intr-un sistem de coordonate
public class Dreptunghi {
	// proprietati: cele 2 puncte definitorii
	private Punct A;
	private Punct B;
	
	// constructor
	public Dreptunghi(Punct A, Punct B)
	{
		this.A = A;
		this.B = B;
	}

	// getteri si setteri pentru toate proprietatile
	public Punct getA() {
		return A;
	}

	public void setA(Punct a) {
		A = a;
	}

	public Punct getB() {
		return B;
	}

	public void setB(Punct b) {
		B = b;
	}
	
	// metoda toString() pentri formatul de afisare in consola
	public String toString()
	{
		return "Dreptunghi [A("+ A + "), B(" + B + ")]"; 
	}
	
	
	//c. metoda pentru calculul lungimii dreptunghiului
	public int calculeazaLungimea()
	{
		return Math.abs(A.getX() - B.getX());
	}
	
	//c. metoda pentru calculul latimii dreptunghiului
	public int calculeazaLatimea()
	{
		return Math.abs(A.getY() - B.getY());
	}

	//d. metoda pentru calculul ariei dreptunghiului
	public int calculeazaAria()
	{
		return calculeazaLungimea()*calculeazaLatimea();
	}
}
