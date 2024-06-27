package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Tema2 {

	
	public static void ex1()

	{
		Scanner tastatura = new Scanner(System.in);
		int n;
		double[] vector=new double [15];
		double spar=0,simpar=0;
		n=15;
		for(int i=0;i<n;i++)
		{
			System.out.println("a[" + i + "] = ");
			vector[i]=tastatura.nextDouble();
			if(i%2==0)
				spar=spar+vector[i];
			if(i%2==1)
				simpar=simpar+vector[i];
		}
		System.out.println("Suma para este = " + spar + " iar suma impara este = " + simpar);
		int ok=0;
		for(int i=0;i<n;i++)
		{
			if(vector[i]==0)
			{
				System.out.println("La indexul " + i + " s-a hasit o valoare de 0");
				ok=1;
			}
		}
		if(ok==0)
			System.out.println("Nu s-a gasit nici o valoare de 0 ");
		
		for(int i=0;i<n;i++)
		{
			if(vector[i]==0)
			{
				for(int j=i;j<n-1;j++)
				{
				vector[j]=vector[j+1];
				}
				n--;
				i--;
			}
		}
		System.out.println("Tablou nou fara 0 :");
		double[] vector2=new double [n];
		for(int i=0;i<n;i++)
		{
			System.out.println(vector[i]);
			vector2[i]=vector[i];
		}
		
		
		
		Arrays.sort(vector2);
		
		System.out.println("Tablou dupa sortare:");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(vector2[i]);
		}
	}
	public static void ex2()
	{
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Numaru de linii");
		int n=tastatura.nextInt();
		System.out.println("Numaru de coloane");
		int m=tastatura.nextInt();
		
		int matrice [][]=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("a[" +i+ "][" +j+ "]= ");
				matrice[i][j]=tastatura.nextInt();
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("a[" +i+ "][" +j+ "]= " +matrice[i][j]);
			}
		}
System.out.println("k= " );	
int k=tastatura.nextInt();

		for(int i=0;i<n;i++)
		{
			int nr=0;
			for(int j=0;j<m;j++)
			{
				if(matrice[i][j]==0)
					nr++;
			}
			if(nr==k)
				System.out.println("S-au gasit pe linia " +i);
		}
		
		int[] vector1=new int[m];
		
		for(int j=0;j<m;j++)
		{
		int maxim=0;
		for(int i=0;i<n;i++)
		{
			if(maxim<matrice[i][j])
				maxim=matrice[i][j];
		}
		int s=0;
		   while(maxim!=0)
		   {
			   s=s+maxim%10;
			   maxim=maxim/10;
		   }
		   vector1[j]=s;
		}
		
		for(int i=0;i<m;i++)
		{
			System.out.println("a[" +i+ "] = " +vector1[i] );
		}
	}
	public static void ex3()
	{
		Scanner tastatura=new Scanner(System.in);
		String vector2=new String ();
		System.out.println("Fraza = ");
		vector2=tastatura.nextLine();
		
		int n=vector2.length();
		char[] litere = vector2.toCharArray();
		boolean ok = true;
	    for(int i=0; i<n;i++) 
	    	if(litere[i] == ' ')
	    		ok = true;
	    	else
	    		if (ok == true)
	    	{
	    		litere[i] = Character.toUpperCase(litere[i]);
	    		ok = false;
	    	}
	      vector2 = String.valueOf(litere);
	      System.out.println("Sir nou : " + vector2);
	      
	      
	      System.out.print("Grupurile de 2 litere identice = ");
	      
	      for(int i=0;i<n-1;i++)
	      {  
	    	 if(litere[i]==litere[i+1])
	    	 {
	    		 System.out.print(String.valueOf("<" + litere[i]) + String.valueOf(litere[i+1]) + "> ");
	    	  }
	      }
	      System.out.println();
	      System.out.println("Fraza noua : ");
	      for(int i=0;i<n;i++) 
		      {
		    	  if(litere[i] == 'a' || litere[i] == 'A' || litere[i] == 'i' || litere[i] == 'I' || litere[i] == 'e'
		    			  || litere[i] == 'E' || litere[i] == 'o' || litere[i] == 'O' || litere[i] == 'u' || litere[i] == 
		    			  'U')
		    		  litere[i] = litere[i];
		    	  else
		    		  litere[i] =':';
		    		  
		      System.out.print(String.valueOf(litere[i]));
		      }
	}
	public static void main(String[] args) 
	{
		
		
	///	ex1();
	///	ex2();
	ex3();
		
		
		
		
		
		
		
		

	}

}
