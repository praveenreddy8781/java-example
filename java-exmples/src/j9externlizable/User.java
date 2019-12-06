package j9externlizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class User implements Externalizable{
	private String userName;
	private int id;
	private String pwd;
	
	public User() {
		System.out.println("No arg constructor called");
	}
	
	public User(String userName, int id, String pwd) {
		super();
		this.userName = userName;
		this.id = id;
		this.pwd = pwd;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("writeExternal(ObjectOutput out): called ");
		out.writeInt(getId());
		out.writeObject(getUserName());
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("readExternal(ObjectInput in): called ");
		id = in.readInt();
		userName = (String) in.readObject();
		
	}
	public String getUserName() {
		return userName;
	}
	public int getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
}
