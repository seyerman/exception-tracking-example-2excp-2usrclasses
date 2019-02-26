package model;

import customExceptions.OneException;
import customExceptions.TwoException;

public class AClass {
	private String name;
	private int number;
	
	private BClass bClass;
	
	public AClass(String na, int nu) {
		name = na;
		number = nu;
		
		bClass = new BClass(name.charAt(0));
	}
	
	private int adjustNumber(double rNum)  throws OneException{
		if(rNum<3.0) {
			throw new OneException(name);
		}
		int x;
		x = ((int)rNum)/bClass.verify(number);
		return x;
	}
	
	public boolean aMethod(double realNumber) throws OneException, TwoException{
		int rNum = 0;
		try {
			rNum = adjustNumber(realNumber);
		}catch(Exception ex) {
			if(number < realNumber) {
				throw new TwoException((int)realNumber);
			}else {
				throw new OneException(name+" "+realNumber);
			}
		}
			
		boolean aM;
		if(number<rNum) {
			aM = true;
		}else {
			aM = false;
		}
		return aM;
	}
}


