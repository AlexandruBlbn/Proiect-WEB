package test;

public class Cilindru {
	//proprietati
		private  int raza;
		private int latura;
		private double suprafata;
		

		//constructor cu parametri
		public Cilindru(int raza,int latura,double suprafata) {
			this.raza=raza;
			this.latura=latura;
			this.suprafata=2*Math.PI*this.raza*(this.raza+this.latura);
		}

		//metode
		
		public int getraza() {
			return raza;
		}

		
		public int  getlatura() {
			return latura;
		}

		public double getsuprafata() {
			return suprafata;
		}

	

		
		public String toString() 
{
			return "Cilindru" + raza+ latura + suprafata;
}
}