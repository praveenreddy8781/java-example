package j7customizeserialization;

class A {
	private int deptId;
	private String deptName;

	public A() {
		System.out.println("A's constructor called: Not mandatory");
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
