package j37multicatch;

import java.io.FileNotFoundException;
import java.io.IOException;

//jdk9 feature
public class MulticatchDemo {

	public static void main(String[] args) {

//		try {
//			calculate1();
//		} catch (FileNotFoundException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			calculate2();
//		} catch (FileNotFoundException e | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			calculate2();
//		} catch (IOException e | FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			calculate2();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			calculate2();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public static void calculate1() throws FileNotFoundException, ClassNotFoundException {

	}
	
	public static void calculate2() throws FileNotFoundException, IOException {

	}
}
