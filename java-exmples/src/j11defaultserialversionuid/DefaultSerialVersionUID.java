package j11defaultserialversionuid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DefaultSerialVersionUID {

	public static void main(String[] args) {
//	Create an object
		Person person = new Person();
		person.setId(100);
		person.setName("Krishna");
		person.setAge(24);

		final String fileName = "person.ser";

//		serializing person object
		try {
			System.out.println("serializing person object");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			objectOutputStream.writeObject(person);
			objectOutputStream.close();
			System.out.println("serializing person object complete!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		deserializing person object
//		try {
//			System.out.println("deserializing person object");
//			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
//			Person  obj = (Person) objectInputStream.readObject();
//			objectInputStream.close();
//			
////			print values after deserializing
//			System.out.println(obj.getId());
//			System.out.println(obj.getName());
//			System.out.println(obj.getCity());
//			
//			System.out.println("deserializing person object complete!!!");
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
