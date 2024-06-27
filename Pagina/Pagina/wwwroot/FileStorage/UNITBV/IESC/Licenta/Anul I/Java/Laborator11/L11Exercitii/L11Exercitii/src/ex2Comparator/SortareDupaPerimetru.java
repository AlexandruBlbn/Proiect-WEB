package ex2Comparator;

import java.util.Comparator;

// clasa pentru sortarea ascendenta a dreptunghiurilor dupa valoarea perimetrului
public class SortareDupaPerimetru implements Comparator<Dreptunghi>{

	@Override
	public int compare(Dreptunghi o1, Dreptunghi o2) {
		return o1.calculeazaPerimetrul() - o2.calculeazaPerimetrul();
	}

}
