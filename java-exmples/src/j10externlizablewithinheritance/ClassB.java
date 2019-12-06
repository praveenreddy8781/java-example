package j10externlizablewithinheritance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class ClassB extends ClassA implements Externalizable {

	private String empId;
	private String empName;

	public ClassB() {
		System.out.println("ClassB() constructor called");
	}
	
	public ClassB(int deptId, String deptName, String empId, String empName) {
		super(deptId, deptName);
		this.empId = empId;
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("writeExternal(ObjectOutput out): called");
//		Write ClassA's(parent class) properties
		out.writeInt(getDeptId());
		out.writeObject(getDeptName());

//		Write ClassB's(child class) properties
		out.writeObject(getEmpId());
		out.writeObject(getEmpName());
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("readExternal(ObjectInput in): called");
//		read ClassA's(parent class) properties
		setDeptId(in.readInt());
		setDeptName((String) in.readObject());

//		read ClassB's(child class) properties
		setEmpId((String) in.readObject());
		setEmpName((String) in.readObject());
	}
}
