package l6;

import java.util.Scanner;

//Laborator 6
//Siruri de caractere

//String
	// declarare:
		// String str;
		// String str = "ceva";
		// String str2 = new String();
		// String str3 = new String("un mesaj");
	// operatii: +(concatenare), ==, equals(), compareTo(), split(), toUpperCase(), 
//toLowerCase(), charAt(), indexOf(), lastIndexOf(), trim(), substring(), replace()

	// str = str.toUpperCase();
	// str = str + "ceva nou";

//StringBuffer sau StringBuilder
	//declarare:
		//StringBuffer str = new StringBuffer();
		//StringBuffer str = new StringBuffer("nou");
	//operatii: append(), insert(), reverse(), replace(), toString()

	//str.append("ceva nou");


public class Exercitii {
	
	// Ex1. Scrieti un program care:
	public static void ex1()
	{
		// a. Citește, de la tastatură, un șir de caractere (metoda nextLine() a clasei Scanner) ce reprezintă o frază. 
		Scanner t = new Scanner(System.in);
		String fraza = t.nextLine();
		
		// b. Afișează numărul de cuvinte din frază. Cuvintele sunt despărțite de un singur caracter spațiu. 
		System.out.println("b. ");
		
		// varianta I - split
		String[] cuvinte = fraza.split(" "); // metoda split va separa fraza intr-un tablou de cuvinte
		System.out.println("varianta 1 - nr cuvinte:"	+ cuvinte.length); // numarul de cuvinte = lungimea tabloului
		
		// varianta II - charAt
		int ap = 1; // variabila care numara cate cuvinte s-au parcurs
		for(int i=0; i<fraza.length(); i++)
		{
			// cautam caracter cu caracter prin fraza
			// daca s-a gasit un spatiu, incrementam numarul de cuvinte
			if(fraza.charAt(i) == ' ')
			{
				ap++;
			}
		}
		System.out.println("varianta 2 - nr cuvinte:" + ap);
		
		// varianta III - indexOf
		ap = 1; // se reinitializeaza variabila pentru numarul de cuvinte
		
		int index = fraza.indexOf(" "); // index i-a valoarea pozitiei primului spatiu
		// cat timp se mai gasesc spatii in fraza
		while(index >= 0)
		{
			ap++; // incrementam numarul de cuvinte
			index = fraza.indexOf(" ", index+1); // si cautam urmatorul spatiu
		}
		System.out.println("varianta 3 - nr cuvinte:" + ap);
		
		
		// c. Pentru fiecare cuvânt afișează numărul de repetiții din frază.
		System.out.println("c. ");
		for(int i=0; i<cuvinte.length; i++) // folosim tabloul de cuvinte de la 1b.1
		{
			int nrAp = 0; // initial, numarul de aparitii pentru fiecare cuvant e 0
			
			// cautam in stanga cuvantului curent, daca el mai este gasit
			// atunci inseamna ca deja s-a realizat cautarea pentru el
			boolean gasit = false; 
			for(int k=0; k<i; k++)
			{
				if(cuvinte[k].equals(cuvinte[i]))
				{
					gasit = true; // cuvantul s-a gasit
					break;
				}
			}
			// daca cuvantul nu s-a gasit deja,
			// cautam de la cuvantul curent pana la finalul tabloului
			// si numaram de cate ori se repeta
			if(!gasit) // gasit == false
			{
				for(int j=i; j<cuvinte.length;j++)
				{
					if(cuvinte[j].equals(cuvinte[i]))
					{
						nrAp++; // incrementam numarul de aparitii
					}
				}
				// afisam pentru fiecare cuvant in parte
				System.out.println(cuvinte[i] + " apare de " + nrAp + " ori");
			}			
		}
		
		
		// d. Citește, de la tastatură, un cuvânt, și afișează numărul de repetări din frază, 
		//dacă este regăsit, altfel afișează mesajul “Cuvantul nu a fost gasit”. 
		System.out.println("d. Introduceti cuvantul cautat: ");
		String cuvant = t.nextLine(); // citim cuvantul pentru care se face cautarea
		int repetari = 0;
		
		// se parcurge tabloul de cuvinte cautandu-se cuvantul introdus
		for(int i=0; i<cuvinte.length; i++)
		{
			if(cuvinte[i].equals(cuvant))
			{
				repetari++; // daca s-a gasit, incrementam numarul de repetari
			}
		}
		
		// daca numarul de repetari a ramas 0, inseamna ca acest cuvant nu se gaseste in tablou
		if(repetari == 0)
		{
			System.out.println("Cuvantul nu a fost gasit");
		}
		else
		{
			System.out.println(cuvant + " se repeta de " + repetari + " ori");
		}	
	}
	
	
	// Ex2. Scrieti un program care:
	public static void ex2()
	{
		// a. Citește un număr întreg de la tastatură. Valoarea trebuie să fie între 1 și 99. 
		//Atât timp cât utilizatorul introduce o valoare din afara acestui interval, i se va
		//cere să introducă din nou numărul. Dacă utilizatorul introduce valoarea 0, atunci 
		//se consideră că dorește să oprească programul, prin urmare se va opri execuția 
		//programului (folosind instrucțiunea return). 
		Scanner t = new Scanner(System.in);
		int nr;
		
		do {
			System.out.print("nr = ");
			nr = t.nextInt();
			if(nr == 0)
				return;
		}while(nr<1 || nr>99);
		
		// b. Afișează echivalentul lingvistic al numărului (de exemplu, pentru valoare 26, 
		//programul va afișa douăzeci și șase). Se va folosi clasa StringBuilder pentru 
		//îndeplinirea cerinței. 
		StringBuilder str = new StringBuilder(); // declaram o variabila de tipul StringBuilder
		
		// separam cifra zecilor si cea a unitatilor
		int zeci = nr/10;
		int unitati = nr%10;
		
		// daca cifra zecilor este intre 2 si 9, adaugam la sir sintagma necesara
		if(zeci > 1)
		{
			switch(zeci)
			{
			case 2:
				str.append("doua");
				break;
			case 3:
				str.append("trei");
				break;
			case 4:
				str.append("patru");
				break;
			case 5:
				str.append("cinci");
				break;
			case 6:
				str.append("sai");
				break;
			case 7:
				str.append("sapte");
				break;
			case 8: 
				str.append("opt");
				break;
			case 9:
				str.append("noua");
				break;
			}
			
			str.append("zeci"); // adaugam sintagma 'zeci'
			if(unitati >= 1) // daca numarul are si zeci si unitati, adaugam si sintagma ' si '
				str.append(" si ");
		}
		
		// verificam cifra unitatilor 
		switch(unitati)
		{
		case 1:
			if(zeci == 1) // daca cifra zecilor este 1, atunci numarul este parte din 11
				str.append("un");
			else
				str.append("unu");
			break;
		case 2:
			str.append("doi");
			break;
		case 3:
			str.append("trei");
			break;
		case 4:
			if(zeci == 1) // daca cifra zecilor este 1, atunci numarul este parte din 14
				str.append("pai");
			else
				str.append("patru");
			break;
		case 5:
			str.append("cinci");
			break;
		case 6:
			if(zeci == 1) // daca cifra zecilro este 1, atunci numarul este parte din 16
				str.append("sai");
			else
				str.append("sase");
			break;
		case 7:
			str.append("sapte");
			break;
		case 8:
			str.append("opt");
			break;
		case 9:
			str.append("noua");
			break;
		}
		
		// daca numarul face parte din intervalul 10 - 19, adaugam sintagma necesara
		if(zeci == 1)
		{
			if(unitati >= 1)
				str.append("spre");
			str.append("zece");
		}
		
		System.out.println(str); // afisam echivalentul lingvistic
	}

	
	// Ex3. Scrieți un program care să implementeze un algoritm de
	//compresie din familia RLE (Run Length Encoding) pentru 
	//șiruri de caractere care nu au secvențe de caractere repetate
	//mai lungi de 9 caractere. Programul va cere utilizatorului 
	//introducerea unui șir de caractere (acesta nu va conține 
	//caracterul ‘*’) și va afișa secvența comprimată. 
	// Algoritmul va funcționa astfel: dacă se întâlnesc secvențe 
	//de mai mult de 3 caractere care se repetă, acestea vor fi
	//înlocuite cu caracterul ‘*’ urmat de un număr cuprins între 
	//1 și 9 reprezentând numărul de repetiții, și de caracterul 
	//care se repetă. De exemplu, pentru șirul de caractere 
	//“AAAAAABCCCDDEFGHHHHIJ” se va afișa “*6AB*3CDDEFG*4HIJ”.
	public static void ex3()
	{
		Scanner t = new Scanner(System.in);
		System.out.println("Introduceti o secventa pentru compresie: ");
		String str = t.nextLine(); // citim sirul de caractere
		
		// prelucram sirul caracter cu caracter
		for(int i=0;i<str.length();i++)
		{
			char chr = str.charAt(i); // preluam caracterul curent pentru a verifica de cate ori se va repeta

			int nrAp = 1; // variabila va contine numarul de repetari succesive ale caracterului
			int poz = str.indexOf(chr); // preluam pozitia initiala a caracterului in sir

			while(poz>=0)
			{ 
				// atat timp cat caracterul se mai regaseste in sir
				// preluam noua pozitie a acestuia
				poz = str.indexOf(chr, poz+1);
				// daca pozitia noua este succesiva cu cea initiala
				// numarul de repetari se incrementeaza
				if(poz == i + nrAp)
					nrAp++;
			}

			// daca numarul de repetitii succesive depaseste 3
			if(nrAp >=3)
			{
				// se formeaza noua secventa conform cerintei
				String strNou = "*"+nrAp+chr;
				// se extrage secventa din sir ce trebuie inlocuita
				String strVechi = str.substring(i, i+nrAp);
				
				// se schimba vechea secventa cu cea noua
				str = str.replace(strVechi,  strNou);
				//daca structura permite sa repeti caracterele de mai multe ori se poate folosi replaceFirst()
				//str = str.replaceFirst(strVechi,  strNou);
			}
		}
		
		System.out.println(str);
	}
	
	
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Introduceti numarul exercitiului: ");
		int opt = t.nextInt();
		
		switch(opt)
		{
		case 1:
			ex1();
			break;
		case 2:
			ex2();
			break;
		case 3:
			ex3();
			break;
		default: 
			System.out.println("Exercitiile rezolvate sunt ex1 si ex2!");
		}
	

	}

}
