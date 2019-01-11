
public class DuplicationException extends Exception{

	@Override
	public String getMessage() {
		return "This object is already exist!";
	}
	
}
