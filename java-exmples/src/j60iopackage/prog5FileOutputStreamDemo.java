package j60iopackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class prog5FileOutputStreamDemo {

	public static void main(String[] args) {

		String source = "Now is the time for all good men\n" + " to come to the aid of their country\n"
				+ " and pay their due taxes.";

		byte[] buffer = source.getBytes();

		try (FileOutputStream f0 = new FileOutputStream("file1.txt");
				FileOutputStream f1 = new FileOutputStream("file2.txt");
				FileOutputStream f2 = new FileOutputStream("file3.txt");) {

//			write to first file
			for (int i = 0; i < buffer.length; i += 2) {
				f0.write(buffer[i]);
			}

//			write to second file
			f1.write(buffer);
			
//			write to 3rd file
			f2.write(buffer, buffer.length/4, buffer.length/4);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
