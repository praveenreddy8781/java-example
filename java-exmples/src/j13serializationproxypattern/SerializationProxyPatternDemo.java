package j13serializationproxypattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationProxyPatternDemo {

	public static void main(String[] args) {
//		create an Person object
		Person person = new Person(10, "Krishna", 30);

//		file path

		final String file = "person.ser";

//		serializing an object
		try {
			System.out.println("serializing an object");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
			objectOutputStream.writeObject(person);
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		deserializing an object
		try {
			System.out.println("deserializing an object");
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
			Person obj = (Person) objectInputStream.readObject();
			objectInputStream.close();

//			print the object info
			System.out.println("getId: " + obj.getId());
			System.out.println("getName: " + obj.getName());
			System.out.println("getAge: " + obj.getAge());

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
