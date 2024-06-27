package Exercitiu1;

import java.util.Scanner;

public class Exercitiu1 {
	
	
	
	public static void ex1()
	{
		
		int nr1,nr2,nr3;
		
		Scanner tastatura = new Scanner(System.in);
		
		System.out.println("nr1=");
	    nr1=tastatura.nextInt();
	    System.out.println("nr2=");
	    nr2=tastatura.nextInt();	
	    System.out.println("nr3=");
	    nr3=tastatura.nextInt();
	    
	    if(nr1<0)
	    	nr1=Math.abs(nr1);
	    if(nr2<0)
	    	nr2=Math.abs(nr2);
	    if(nr3<0)
	    	nr3=Math.abs(nr3);
	    int s=nr1+nr2+nr3;
	    System.out.println("Perimtru tringhiului este = "+ s);
	    int max=Math.max(nr1, Math.max(nr2, nr3));
	    int min=Math.min(nr1, Math.min(nr2, nr3));
	    
	    System.out.println("latura maxima este = " + max);
	    System.out.println("latura minima patrat = " + (min*min));
	    
	    if(nr1==nr2 && nr2==nr3)
	    	System.out.println("triunghi echilateral");
	    else
	    	System.out.println("tringhiul nu este echilateral");
	    
	    
	    int ok=0;
	    if(nr1==max)
	        if(nr1*nr1==nr2*nr2+nr3*nr3)
	        {
	        	System.out.println("dreptunghic");
	        	ok=1;
	        }
	    if(nr2==max)
	    	if(nr2*nr2==nr1*nr1+nr3*nr3)
	    	{
	        	System.out.println("dreptunghic");
	        	ok=1;
	    	}
	    
	    	if(nr3==max)
		    	if(nr3*nr3==nr1*nr1+nr2*nr2)
		    	{
		        	System.out.println("dreptunghic");
		        	ok=1;
		    	}
	    	
	    	if(ok==0)
	    	System.out.println("nu este dreptunghic");
	    
	    
	    
	}

	public static void main(String[] args) {
		
   ex1();
	}

}
