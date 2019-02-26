package model;

public class BClass {
	private char letter;
	
	public BClass(char l) {
		letter = l;
	}

	public int verify(int num) {
		int z = 0;
		if((int)letter > num) {
			z = num;
		}else {
			z = (int)letter;
		}
		return z;
	}
	
	
}

