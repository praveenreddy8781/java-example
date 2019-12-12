package j39customexception;

// Custom exception example
class InvalidAgeException extends RuntimeException {
	
//class InvalidAgeException extends Exception {
		
	private int age;

	public InvalidAgeException(int age) {
		super();
		this.age = age;
	}

	public InvalidAgeException(int age, String msg) {
		super(msg);
		this.age = age;
	}

	public InvalidAgeException(int age, String msg, Throwable throwable) {
		super(msg, throwable);
		this.age = age;
	}

	public InvalidAgeException(int age, Throwable throwable) {
		super(throwable);
		this.age = age;
	}

	@Override
	public String toString() {
		return "toString : InvalidAgeException : " + age;
	}

	@Override
	public String getMessage() {
		return "getMessage : InvalidAgeException : " + age;
	}
}

public class CustomException {

	public static void main(String[] args) {
		int age = 60;
		
		if(age > 50)
			throw new InvalidAgeException(age, "InvalidAgeException");
	}
}
