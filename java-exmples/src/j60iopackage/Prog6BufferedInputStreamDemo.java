package j60iopackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Prog6BufferedInputStreamDemo {

	public static void main(String[] args) {
		String s = "This is a &copy; copyright symbol " + " but this is  &copy not.\n";

		System.out.println(s);
		byte[] buf = s.getBytes();

		ByteArrayInputStream in = new ByteArrayInputStream(buf);

		int c;
		boolean marked = false;
		try (BufferedInputStream f = new BufferedInputStream(in)) {
			while ((c = f.read()) != -1) {

				char ch = (char) c;

//				if(c == '&') {
//					System.out.println("Fouund" + c);
//				}

				switch (c) {
				case '&':
					if (!marked) {
						f.mark(32);
						marked = true;
					} else {
						marked = false;
					}
					break;

				case ';':
					if (marked) {
						marked = false;
						System.out.print("(c)");
					} else {
						System.out.print((char) c);
					}
					break;

				case ' ':
					if (marked) {
						marked = false;
						f.reset();
						System.out.print("&");
					} else {
						System.out.print((char) c);
					}
					break;

				default:
					if (!marked) {
						System.out.print((char) c);
					}
					break;
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
