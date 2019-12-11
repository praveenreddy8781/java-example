package j35throws;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			displayFile();
		} catch (IOException e) {
			System.out.println("IOException::::::");
			e.printStackTrace();
		}
		
		
//		try {
//			method();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	private static void displayFile() throws IOException {
//		BufferedReader br = new BufferedReader(new FileReader("teest.txt"));

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

	public static void method() throws FileNotFoundException, ClassNotFoundException{
//		some logic
	}
	
}
