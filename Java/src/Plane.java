
public class Plane
{
	private Vector n;
	private Point p;
	public Plane(Vector normal, Point p)
	{
		this.n = normal;
		this.p = p;
	}
	
	public Vector getNormalVector()
	{
		return this.n;
	}
	
	public Point getPoint()
	{
		return this.p;
	}
	
	// fix print out method in order to account for negative values
	public String toString()
	{
		String x = this.n.getI() + "(x - " + this.p.getX() + ")";
		String y = this.n.getJ() + "(y - " + this.p.getY() + ")";
		String z = this.n.getK() + "(z - " + this.p.getZ() + ")";
		
		return x + " + " + y + " + " + z + " = 0";
	}
	
	public static Plane getEquationOfPlaneFromPoints(Point p1, Point p2, Point p3)
	{
		Vector v1 = Vector.getVectorFromPoints(p1, p2);
		Vector v2 = Vector.getVectorFromPoints(p1, p3);
		
		Vector n = Vector.getCrossProduct(v1, v2);
		
		Vector unitNormal = Vector.getUnitVector(n);
		
		unitNormal = new Vector(Math.abs(unitNormal.getI()), Math.abs(unitNormal.getJ()), Math.abs(unitNormal.getK()));
		
		Plane plane = new Plane(unitNormal, p1);
		
		return plane;
	}
	
	public static double getDistanceFromPointToPlane(Point point, Plane plane)
	{
		Vector v = Vector.getVectorFromPoints(plane.getPoint(), point);
		
		Vector n = plane.getNormalVector();
		
		double distance = (Math.abs(Vector.getDotProduct(n, v))) / Vector.getVectorMagnitude(n);
		
		return distance;
	}
	
	
}
