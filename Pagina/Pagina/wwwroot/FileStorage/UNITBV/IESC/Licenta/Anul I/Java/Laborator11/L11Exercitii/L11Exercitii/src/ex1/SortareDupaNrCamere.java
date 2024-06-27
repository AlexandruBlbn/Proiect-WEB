package ex1;

import java.util.Comparator;

// clasa care implementeaza interfata Comparator 
public class SortareDupaNrCamere implements Comparator<Casa>
{
	// metoda definita in interfata Comparator pentru sortarea ascendenta dupa nrCamere
	public int compare(Casa a, Casa b)
	{
		return a.getNrCamere() - b.getNrCamere();
	}

}
