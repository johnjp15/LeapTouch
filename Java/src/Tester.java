
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(-1, -2, -5.222);
		Point b = new Point(251.0, -215.2, 0.413);
		Point c = new Point(-5, 215, 621);
		Vector v1 = new Vector(a, b);
		Vector v2 = new Vector(a, c);
		
		Vector v3 = new Vector(1, 1, 1);
		
		Plane p1 = new Plane(v1, a);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(p1);
	}

}
