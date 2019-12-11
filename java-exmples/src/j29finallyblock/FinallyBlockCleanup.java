package j29finallyblock;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Finally block Java example for cleaning up
public class FinallyBlockCleanup {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("test.txt"));
			String str = br.readLine();
			System.out.println(str);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("closing BufferedReader in finally block");
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
