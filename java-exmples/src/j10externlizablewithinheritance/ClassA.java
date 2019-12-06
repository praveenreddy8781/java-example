package j10externlizablewithinheritance;

class ClassA {
	private int deptId;
	private String deptName;

	public ClassA() {
		System.out.println("ClassA() constructor called");
	}
	
	public ClassA(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
