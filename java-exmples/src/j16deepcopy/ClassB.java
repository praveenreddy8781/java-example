package j16deepcopy;

class ClassB implements Cloneable {

	private int x;
	private ClassA classA;

	public ClassB(int x, ClassA classA) {
		super();
		this.x = x;
		this.classA = classA;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public ClassA getClassA() {
		return classA;
	}

	public void setClassA(ClassA classA) {
		this.classA = classA;
	}

	@Override
	public ClassB clone() throws CloneNotSupportedException {
		ClassB clonedObj = (ClassB) super.clone();
		clonedObj.classA = (ClassA) classA.clone();
		return clonedObj;
	}
}
