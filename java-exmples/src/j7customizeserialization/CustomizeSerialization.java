package j7customizeserialization;

import j6searialization.Util;

public class CustomizeSerialization {

	public static void main(String[] args) {

		final String fileName = "D://test.ser";
		B b = new B();
		b.setDeptId(100);
		b.setDeptName("Finance");
		b.setEmpId(1000);
		b.setEmpName("Krishna");

		Util.serialzeObject(b, fileName);

		B obj = (B) Util.deSerialzeObject(fileName);

//		A's properties are not serialized
		System.out.println(obj.getDeptId());
		System.out.println(obj.getDeptName());
		System.out.println(obj.getEmpId());
		System.out.println(obj.getEmpName());
	}
}
