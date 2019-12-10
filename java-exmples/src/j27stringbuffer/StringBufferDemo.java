package j27stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
//		create an empty StringBuffer object
		StringBuffer sb1 = new StringBuffer();

		System.out.println("sb1 length: " + sb1.length());
		System.out.println("sb1 capacity: " + sb1.capacity());

//		create StringBuffer object with "Example" content
		StringBuffer sb2 = new StringBuffer("Example");
		System.out.println("sb2 length: " + sb2.length());
		System.out.println("sb2 capacity: " + sb2.capacity());

//		Java StringBuffer append method example
		StringBuffer sb3 = sb1.append("This").append(" is").append(" Number ").append(1).append(" and ").append(101004);
		System.out.println(sb1.toString());

		if (sb1 == sb3) {
			System.out.println("sb1 == sb3: " + (sb1 == sb3));
		} else {
			System.out.println("sb1 == sb3: " + (sb1 == sb3));
		}
		
//		Java StringBuffer insert method example
		StringBuffer sb4 = new StringBuffer("Rd");
		sb4.insert(1, 'e');
		
		System.out.println("sb4.insert(1, 'e'): "+ sb4);
		
		
//		reversing StringBuffer
		StringBuffer buffer = new StringBuffer("reverse");
		buffer.reverse();
		System.out.println(buffer.toString());
	}
}
