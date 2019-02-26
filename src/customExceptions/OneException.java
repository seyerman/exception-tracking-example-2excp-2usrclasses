package customExceptions;

@SuppressWarnings("serial")
public class OneException extends Exception{
	public OneException(String name) {
		super("OneException ocurred with "+name);
	}
}

