package j5strictfp;

// strictfp example: ensures the floating-point behavior is same across different platforms(32bit and 64 bit)
strictfp public class Strictfp {

	private static float f = 9.8789f;

	strictfp public static void method() {
//		calculation using floating-point
		f = 100 * f;
		System.out.println("result: " + f);
	}

	public static void main(String[] args) {
		method();
	}
}
