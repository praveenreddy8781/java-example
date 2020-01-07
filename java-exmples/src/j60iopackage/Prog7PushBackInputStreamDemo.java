package j60iopackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class Prog7PushBackInputStreamDemo {

	public static void main(String[] args) {
		String s = "if (a==4) a=0;\n";
		System.out.println(s);
		byte[] buf = s.getBytes();

		ByteArrayInputStream in = new ByteArrayInputStream(buf);
		int c;

		try (PushbackInputStream f = new PushbackInputStream(in)) {
			while ((c = f.read()) != -1) {
				switch (c) {
				case '=':
					if ((c = f.read()) == '=') {
						System.out.print(".eq.");
					} else {
						System.out.print("<-");
						f.unread(c);
					}
					break;

				default:
					System.out.print((char) c);
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
