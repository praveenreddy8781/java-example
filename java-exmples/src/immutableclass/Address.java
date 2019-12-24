package immutableclass;

public class Address implements Cloneable{
	private Integer hno;
	private String addr;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(Integer hno, String addr) {
		super();
		this.hno = hno;
		this.addr = addr;
	}

	public Integer getHno() {
		return hno;
	}

	public void setHno(Integer hno) {
		this.hno = hno;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
