package teorie;

import java.io.Serializable;

public class ClasaTest implements Serializable{
	private int proprietateTest;
	
	public ClasaTest(int proprietateTest)
	{
		this.proprietateTest = proprietateTest;
	}

	public int getProprietateTest() {
		return proprietateTest;
	}

	public void setProprietateTest(int proprietateTest) {
		this.proprietateTest = proprietateTest;
	}

	
}
