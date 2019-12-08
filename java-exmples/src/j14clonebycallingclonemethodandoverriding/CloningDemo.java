package j14clonebycallingclonemethodandoverriding;

public class CloningDemo {

	public static void main(String[] args) {
//		create an object
		Test test1 = new Test(100, "Krishna");

//		try to create a clone using the existing object
//		Test test2 = test1;
		Test test2 = null;
		try {
//			test2 = test1.cloneIt();
			test2 = test1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(test1 == test2) {
			System.out.println("Same instances");
		}else {
			System.out.println("Different instances");
		}
		System.out.println("test1: " + test1);
		System.out.println("test2: " + test2);

//		try to change values of test1
		test1.setName("Rama");

		System.out.println("test1.getName(): " + test1.getName());
		System.out.println("test2.getName(): " + test2.getName());

	}

}
