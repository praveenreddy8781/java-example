package j60iopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class InputStreamEnumerator implements Enumeration<FileInputStream> {

	Enumeration<String> files;

	public InputStreamEnumerator(Vector<String> files) {
		this.files = files.elements();
	}

	@Override
	public boolean hasMoreElements() {
		return files.hasMoreElements();
	}

	@Override
	public FileInputStream nextElement() {
		try {
			return new FileInputStream(files.nextElement().toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

public class Prog8SequenceInputStream {

	public static void main(String[] args) {
		int c;

		Vector<String> files = new Vector<String>();

		files.addElement("C:\\Users\\Reddys\\Desktop\\test\\file1.txt");
		files.addElement("C:\\Users\\Reddys\\Desktop\\test\\file2.txt");
		files.addElement("C:\\Users\\Reddys\\Desktop\\test\\file3.txt");

		InputStreamEnumerator inputStreamEnumerator = new InputStreamEnumerator(files);

		InputStream inputStream = new SequenceInputStream(inputStreamEnumerator);

		try {
			while ((c = inputStream.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (NullPointerException e) {
			System.out.println("inputStream is null");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
