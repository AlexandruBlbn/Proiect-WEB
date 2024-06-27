package ex2Comparator;

import java.util.Comparator;

//clasa pentru sortarea descendenta a patratelor dupa valoarea ariei
public class SortareDupaArie implements Comparator<Patrat>{

	@Override
	public int compare(Patrat o1, Patrat o2) {
		return o2.calculeazaAria() - o1.calculeazaAria();
	}

}
