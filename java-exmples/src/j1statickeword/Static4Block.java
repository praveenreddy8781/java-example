package j1statickeword;

public class Static4Block {

	// static blank final variable
	static final int i;
	static int b;
	static {
		System.out.println("in static block");
		i = 5;
		b = i * 5;
		System.out.println("Values " + i + " " + b);
	}

	public static void main(String[] args) {
		  System.out.println(" in main method ");
	}
}
