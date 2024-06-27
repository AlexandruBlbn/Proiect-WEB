package test;
import java.util.ArrayList;
/// A=2*pi4(r_h)
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Cilindru> cilindre = new ArrayList<Cilindru>();
		do {
			
			String comanda = keyboard.nextLine();
			System.out.println("Mai adaugati: ");
			switch(comanda)
			{
			case "DA":
			{
				
				int raza;
				int latura;
				double suprafata;
				try
				{
				System.out.println("raza:");
				raza = keyboard.nextInt();
				System.out.println("latura ");
				latura = keyboard.nextInt();
				suprafata=2*Math.PI*raza*(raza+latura);
				Cilindru auto = new Cilindru(raza,latura,suprafata);
				
				cilindre.add(auto);
				}
				catch (Exception e) {
					System.out.println(e);
					
			}
				break;
			}	
			case "b":
			{
				double minim=Double.MAX_VALUE;
				
				for(int i=0;i<cilindre.size();i++)
				{
					if(minim>cilindre.get(i).getsuprafata())
					{
						minim=cilindre.get(i).getsuprafata();
						
					}
				}
				
				for(int i=0;i<cilindre.size();i++)
				{
					if(cilindre.get(i).getsuprafata()==minim)
							{
						          System.out.println("Cilindru "+ i +"  mai are suprafata totala minima");
							}
						
				}
				
				
				
			}
				break;
			case "NU":
		    {
				System.out.println("Multumim!");
				return;
			} 
			default:
				System.out.println("Nu este o optiune valida");
			}
		}while(true);
		
		
	
	}

}
