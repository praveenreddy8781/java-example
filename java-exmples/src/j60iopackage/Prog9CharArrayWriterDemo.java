package j60iopackage;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Prog9CharArrayWriterDemo {

	public static void main(String[] args) {
		CharArrayWriter f = new CharArrayWriter();

		String s = "This should end up in the array";

		char[] buf = new char[s.length()];

		s.getChars(0, s.length(), buf, 0);

		try {
			f.write(buf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Buffer as a string");
		System.out.println(f.toString());
		System.out.println("Into array");

		char[] c = f.toCharArray();

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

		try (FileWriter fileWriter = new FileWriter("D:\\workspace\\java-example\\java-exmples\\file.txt")) {
			f.writeTo(fileWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Doing a reset");
		f.reset();

		for (int i = 0; i < 3; i++) {
			f.write('x');
		}
	}
}
