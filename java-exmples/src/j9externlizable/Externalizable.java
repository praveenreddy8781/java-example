package j9externlizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Externalizable {

	public static void main(String[] args) {
//		create an user object
		User user = new User("Krish", 202, "XXXXXX");
		
//		serialize object
		System.out.println("Serializing User object");
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.ser"));
			objectOutputStream.writeObject(user);
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Deserialize object
		System.out.println("Deserialize User object");
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test.ser"));
			User obj = (User) objectInputStream.readObject();
			objectInputStream.close();
			
			System.out.println(obj.getId());
			System.out.println(obj.getPwd());
			System.out.println(obj.getUserName());
			
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
		
		
		System.out.println("Demo complete:::");
	}

}
