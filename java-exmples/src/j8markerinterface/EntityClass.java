package j8markerinterface;

//User defined marker interface demo
public class EntityClass implements MarkerEntity {

//	public class EntityClass{
	public static void main(String[] args) {

		EntityClass obj = new EntityClass();

		if (obj instanceof MarkerEntity) {
			System.out.println("saved");
		} else {
			System.err.println("Not MarkerEntity");
		}
	}
}
