package j14clonebycallingclonemethodandoverriding;

// cloning : shallow copy
public class Test implements Cloneable {
	private int id;
	private String name;

	public Test(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	calling clone method
//	protected Test cloneIt() throws CloneNotSupportedException {
//		return (Test) super.clone();
//	}
	
	@Override
	public Test clone() throws CloneNotSupportedException {
		return (Test) super.clone();
	}
}
