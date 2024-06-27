package t3;

public class Planeta {
	//proprietati
	private String DenumirePlaneta;
	private double X;
	private double Y;
	private double Z;
	private double pozitie;
	

	//constructor cu parametri
	public Planeta(String DenumirePlaneta, double X, double Y, double Z , double pozitie) {
		this.DenumirePlaneta = DenumirePlaneta;
		this.X = X*86400*365.25*299792458;
		this.Y= Y*86400*365.25*299792458;
		this.Z = Z*86400*365.25*299792458;
		this.pozitie =this.X+this.Y+this.Z;
	}

	//metode
	
	public String getDenumirePlaneta() {
		return DenumirePlaneta;
	}

	
	public double getX() {
		return X;
	}

	
	public double getY () {
		return Y;
	}

	
	public double getZ() {
		return Z;
	}
	
	
	
	public double getpozitie() {
		return pozitie;
	}

	//supradefinirea metodei toString
	@Override
	public String toString() {
		return "Planeta [Planeta=" + DenumirePlaneta + ", X=" + X + ", Y=" + Y
				+ ", Z=" + Z + ", pozitie=" + pozitie + "]";
	}
	
	
	

}
