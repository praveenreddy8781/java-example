package j7customizeserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class B extends A implements Serializable {
	private static final long serialVersionUID = 1L;

	private int empId;
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

//	 adding writeObject method
	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
		System.out.println("writeObject(ObjectOutputStream objectOutputStream) : called");
//		calling default functionality for classB fields
		objectOutputStream.defaultWriteObject();
//		 Explicitly writing ClassA fields
		objectOutputStream.writeInt(getDeptId());
		objectOutputStream.writeObject(getDeptName());
	}

	// adding readObject method
	private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
		System.out.println("readObject(ObjectInputStream objectInputStream) : called");
		// calling default functionality for classB fields
		objectInputStream.defaultReadObject();
		// Explicitly reading ClassA fields and setting them
		setDeptId(objectInputStream.readInt());
		setDeptName((String) objectInputStream.readObject());
	}
}
