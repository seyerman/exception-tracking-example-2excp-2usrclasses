package customExceptions;

@SuppressWarnings("serial")
public class TwoException extends Exception{
	public TwoException(int number) {
		super("TwoException ocurred with number "+number);
	}
}

