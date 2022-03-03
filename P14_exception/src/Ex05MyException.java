class MyException extends Exception {
	private String exception;

	public MyException(String exception) {
		super(exception);
	}
	
	public String getException() {
		exception = super.getMessage() + "- 나의 예외 처리";
		return exception;
	}
}

public class Ex05MyException {

	public static void main(String[] args) {
		
		try {
			throw new MyException("Error");
		}catch (MyException e) {
			System.out.println(e.getException());
		}
	}
}
