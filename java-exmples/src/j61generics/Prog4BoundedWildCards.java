package j61generics;

class TwoD {
	int x;
	int y;

	public TwoD(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ThreeD extends TwoD {
	int z;

	public ThreeD(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}

class FourD extends ThreeD {
	int t;

	public FourD(int x, int y, int z, int t) {
		super(x, y, z);
		this.t = t;
	}
}

class Coords<T extends TwoD> {

	T[] coords;

	public Coords(T[] coords) {
		this.coords = coords;
	}
}

public class Prog4BoundedWildCards {

//	demonstrate bounded wildcards
	static void showXY(Coords<?> c) {
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " + c.coords[i].y);
			System.out.println();
		}
	}

	static void showXYZ(Coords<? extends ThreeD> c) {
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
			System.out.println();
		}
	}

	static void showAll(Coords<? extends FourD> c) {
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TwoD td[] = { new TwoD(0, 0), new TwoD(7, 9), new TwoD(18, 4), new TwoD(-1, -23), };

		Coords<TwoD> tdlocs = new Coords<TwoD>(td);

		System.out.println("Contents of fdlocs");
		showXY(tdlocs);
//		showXYZ(tdlocs);
//		showAll(tdlocs);

		FourD fd[] = { new FourD(1, 2, 3, 4), new FourD(1, 2, 3, 4), };

		Coords<FourD> fdlocs = new Coords<FourD>(fd);
		System.out.println("Contents of fdlocs");
		showXY(fdlocs);
		showXYZ(fdlocs);
		showAll(fdlocs);
	}
}
