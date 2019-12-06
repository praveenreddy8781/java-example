package j10externlizablewithinheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableDemo {

	public static void main(String[] args) {
		final String fileName = "D://test.ser";

//		Create an object
		ClassB b = new ClassB(10, "Finance", "E-101", "Krish");

//		Serializing the object
		try {
			System.out.println("Serializing the object");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			objectOutputStream.writeObject(b);
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Deserializing object
		try {
			System.out.println("Deserializing the object");
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
			ClassB obj = (ClassB) objectInputStream.readObject();
			objectInputStream.close();

			System.out.println(obj.getDeptId());
			System.out.println(obj.getDeptName());
			System.out.println(obj.getEmpId());
			System.out.println(obj.getEmpName());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
