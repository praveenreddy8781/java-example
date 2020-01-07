package j60iopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class prog4FileInputStreamDemo {

	public static void main(String[] args) {

		try (FileInputStream fin = new FileInputStream(
				"D:\\workspace\\java-example\\java-exmples\\src\\j60iopackage\\Prog3ListingOnlyTxtFilesFromDir.java")) {

			System.out.println("Total available bytes: " + fin.available());

			int size = fin.available();

			int n = size / 40;

			System.out.println("First " + n + " bytes of the file one read() at a time");

			for (int i = 0; i <= n; i++) {
				System.out.print((char) fin.read());
			}

			System.out.println("\n still available bytes: " + fin.available());

			System.out.println("Reading the next " + n + " bytes.");

			byte[] b = new byte[n];
			if (fin.read(b) != n) {
				System.out.println("Couldn't read " + n + " bytes.");
			}

			System.out.println(new String(b, 0, n));

			System.out.println("\n still available bytes: " + fin.available());

			size = fin.available();

			System.out.println("skipping half of the remaining bytes using skip()");
			fin.skip(size / 2);

			System.out.println("\n still available bytes: " + fin.available());

			System.out.println("Reading " + n / 2 + " into the end of the array");

			if (fin.read(b, n / 2, n / 2) != n / 2) {
				System.out.println("Couldn't read " + n / 2 + " bytes.");
			}

			System.out.println(new String(b, 0, b.length));
			System.out.println("\n still available bytes: " + fin.available());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
