package j60iopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prog1ReadingAndWrittingFile {

	public static void main(String[] args) {
		int i;

//		FileInputStream fin = null;
//		FileOutputStream fout = null;

//		open file

//		try with resource
		try (FileInputStream fin = new FileInputStream(args[0]);
				FileOutputStream fout = new FileOutputStream(args[1])) {
//			fin = new FileInputStream(args[0]);
//			fout = new FileOutputStream(args[1]);

			do {
//			 read a file
				i = fin.read();
				if (i != -1) {
					System.out.print((char) i);

//					write a file
					fout.write(i);
				}
			} while (i != -1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		/*
		 * finally { try { fin.close(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 * 
		 * try { fout.close(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } }
		 */
	}
}
