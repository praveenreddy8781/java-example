package j15shallowcopy;

public class ShallowCopyDemo {

	public static void main(String[] args) {
		ClassB classB1 = new ClassB(10, new ClassA(20, 30));

		try {
			ClassB classB2 = classB1.clone();

			if (classB1 == classB2) {
				System.out.println("same instance ClassB");
			} else {
				System.out.println("differnt instance ClassB");
			}

//			do changes to classA object in cloned object
			classB2.getClassA().setI(100);
			classB2.getClassA().setJ(200);

			System.out.println("classB2.getClassA().getI(): " + classB2.getClassA().getI());
			System.out.println("classB2.getClassA().getJ(): " + classB2.getClassA().getJ());

			System.out.println("classB1.getClassA().getI(): " + classB1.getClassA().getI());
			System.out.println("classB1.getClassA().getJ(): " + classB1.getClassA().getJ());

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
