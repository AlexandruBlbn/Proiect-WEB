package l6Teorie;

import java.util.Scanner;

//Laborator 6
//Siruri de caractere


public class Teorie {

	private static void teorieString()
	{
		//moduri de declarare si initializare
		String sir1 = "sir1";
		String sir2 = new String("sir");
		char sir[] = new char[50];
		String sir3 = new String(sir);
		
		System.out.println("---------------------afisare-----------------------");
		//afisarea unui sir de caractere
		System.out.println(sir1);
		System.out.println(sir2);
		System.out.println(sir3);
		
		System.out.println("\n---------------------length-----------------------");
		//lungimea unui sir de caractere
		int x = sir1.length();
		System.out.println("lungimea unui sir: " + x);
		
		System.out.println("\n---------------------substring-----------------------");
		//extragerea unui subsir
		String subsir = sir1.substring(0, 3);
		System.out.println("extragerea unui subsir: " + subsir);
		
		System.out.println("\n---------------------compareTo-----------------------");
		//compararea sirurilor
		int comparare = sir1.compareTo(sir2);
		if (comparare < 0)
		{
			System.out.println("Sirul \"" + sir1 + "\" este mai mic decat sirul"+ " \"" + sir2 + "\"");
		}
		else
		{
			if (comparare > 0)
			{
				System.out.println("Sirul \"" + sir1 + "\" este mai mare decat" + " sirul \"" + sir2 + "\"");
			}
			else
			{
				System.out.println("Sirul \"" + sir1 + "\" este egal cu sirul \"" + sir2 + "\"");
			}
		}
		
		System.out.println("\n---------------------==-----------------------");
		if (sir1 == sir2)
			System.out.println("Sirurile sunt egale!");
		else
			System.out.println("Sirurile sunt diferite! "+sir1+sir2);
		
		
		System.out.println("\n---------------------equals-----------------------");
		//equals
		if(sir1.equals(sir2))
		{
			System.out.println("Sirurile sunt egale");
		}
		else
		{
			System.out.println("Sirurile sunt diferite!");
		}
		
		System.out.println("\n---------------------+(concatenare)-----------------------");
		//concatenarea
		sir1 = sir1 + sir2;
		System.out.println("Sir1 concatenat:"+ sir1);
		
		// concatenarea a doua caractere la un sir
		String s3 = "opt zeci si trei";
		System.out.println(s3 + " este " + 8 + 3);
		
		String s4 = "unsprezece";
		// concatenarea rezultatului unei operatii aritmetice
		System.out.println(8 + 3 + " este " + s4);
		
		System.out.println("\n---------------------valueOf-----------------------");
		String s5 = "opt zeci si trei este: " + String.valueOf(8) + String.valueOf(3);
		System.out.println(s5);                    
		
		System.out.println("\n---------------------charAt-----------------------");
		//charAt
		System.out.println("Caracterul de la pozitia 4: " + s5.charAt(4));
		
		System.out.println("\n---------------------replace-----------------------");
		//replace
		s3 = s3.replace('i', '-');
		System.out.print("Sirul dupa inlocuirea 'i' cu '-': ");
		System.out.println(s3);
		
		System.out.println("\n---------------------indexOf si lastIndexOf-----------------------");
		//indexOf si lastIndexOf
		String s6 = s5.substring(s5.indexOf("z"),s5.lastIndexOf("i"));
		System.out.println("Subsirul dintre prima aparitie a 'z' si ultima aparitie a 'i' este: " + s6);
		
		System.out.println("\n---------------------startsWith-----------------------");
		//startsWith
		if (s5.startsWith("He"))
		{
			System.out.println("Sirul \"" + s5 + "\" incepe cu prefixul He");
		}
		else
		{
			System.out.println("Sirul \"" + s5 + "\" NU incepe cu prefixul He");
		}
		
		if (s5.startsWith("pp", 2))
		{
			System.out.println("Sirul \"" + s5 + "\" include subsirul \"pp\" la pozitia 2");
		}
		else
		{
			System.out.println("Sirul \"" + s5 + "\" NU include subsirul \"pp\" la pozitia 2");
		}
		
		System.out.println("\n---------------------endsWith-----------------------");
		//endsWith
		if (s5.endsWith("a!"))
		{
			System.out.println("Sirul \"" + s5 + "\" se termina cu sufixul a!");
		}
		else
		{
			System.out.println("Sirul \"" + s5 + "\" NU se termina cu sufixul a!");
		}
		
		System.out.println("\n---------------------toUpperCase-----------------------");
		//toUpperCase
		s5 = s5.toUpperCase();
		System.out.println("Sirul cu majuscule este: " + s5);
		
		System.out.println("\n---------------------toLowerCase-----------------------");
		//toLowerCase
		s5 = s5.toLowerCase();
		System.out.println("Sirul cu litere mici este: " + s5);
		
		System.out.println("\n---------------------split-----------------------");
		String sirDeImpartit = "unsirabcareabtrebuieabimpartitabareabcaabrezultat";
		//split
		String[] tablou = sirDeImpartit.split("ab");
		System.out.println("Metoda split are ca rezulatat un tablou cu elementele: ");
		for(int i=0; i<tablou.length; i++)
		{
			System.out.println("tablou["+i+"] = " + tablou[i]);
		}
		
		System.out.println("\n---------------------trim-----------------------");
		//trim
		String s = "   un sir ce va fi curatat de spatii";
		System.out.println("Sirul dupa ce s-au curatat spatiile inutile:" + s.trim());
	}
	
	
	private static void teorieStringBuffer()
	{
		//declararea folosind StringBuffer
		StringBuffer sb1 = new StringBuffer(); 
		StringBuffer sb2 = new StringBuffer("Acesta este un StringBuffer");
		StringBuffer sb3 = new StringBuffer(20);
		
		sb1 = new StringBuffer("Eu am mere");
		sb3 = new StringBuffer("Eu am pere");
		
		System.out.println("---------------------afisare-----------------------");
		//afisarea
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		
		System.out.println("\n---------------------insert-----------------------");
		//insert
		sb1.insert(6, '3');
		System.out.println("Noul sir sb1 dupa introducerea caracterului '3' pe pozitia 6 este: " + sb1);
		
		System.out.println("\n---------------------append-----------------------");
		//append
		sb2.append(" - mesaj aditional");
		System.out.println("Noul sir sb2 dupa adaugarea unui mesaj este: " + sb2);
		
		System.out.println("\n---------------------replace-----------------------");
		//replace
		sb3.replace(2, 15, "abcdefghijk");
		System.out.println("Noul sir sb3 dupa inlocuirea caracterelor este: " + sb3);
	
		System.out.println("\n---------------------toString-----------------------");
		//transformarea in String
		String myString1 = sb2.toString();
		System.out.println(myString1);
		
		System.out.println("\n---------------------reverse-----------------------");
		//reverse
		sb1.reverse();
		System.out.println("Noul sir inversat este: " + sb1);
	}
	
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("1. Teorie String"
					   + "\n2. Teorie StringBuffer");
		System.out.println("Introduceti numarul exercitiului dorit:");
		int ex = t.nextInt();
		
		
		switch(ex)
		{
		case 1:
			//proprietati si metode ale clasei String
			teorieString();
			break;
		case 2:
			//proprietati si metode ale clasei StringBuffer
			teorieStringBuffer();
			break;
		default:
			System.out.println("Nu exista o astfel de optiune!");
		}
	}

}
