package Exercitiu2;

import java.util.Scanner;

public class Tema1Exercitiu2 {

	public static void main(String[] args) {
		
		
		
	    Scanner tastatura = new Scanner(System.in);
	    
	    double randomdouble=Math.random()*101;
	     int randomint=(int)randomdouble;
	     int ok=0;
	     System.out.println(randomint);
	     
	     while(ok!=1)
	     { 
	    	 System.out.println("Nr = ");
		     int nr=tastatura.nextInt();
	       if(nr>randomint)
	    	   System.out.println("mai mic");
	       
	    	   if(nr<randomint)
		    	   System.out.println("mai mare");
	    	   if(nr==randomint)
	    	   {
	    		   ok=1;
	    		   System.out.println("ai ghicit");
	    	   }
	     }
	     
	    

	}

}
