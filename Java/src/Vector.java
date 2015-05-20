
public class Vector
{
	private double i, j, k;
	
	public Vector(Vector v)
	{
		this.setComponents(v.getI(), v.getJ(), v.getK());
	}
	public Vector(double i, double j, double k)
	{
		this.setComponents(i, j, k);
	}
	
	public Vector(Point a, Point b)
	{
		 this(Vector.getVectorFromPoints(a, b));
	}
	
	public void setComponents(double i, double j, double k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	public void setI(double i)
	{
		this.i = i;
	}
	
	public void setJ(double j)
	{
		this.j = j;
	}
	
	public void setK(double k)
	{
		this.k = k;
	}
	
	public double getI()
	{
		return this.i;
	}
	
	public double getJ()
	{
		return this.j;
	}
	
	public double getK()
	{
		return this.k;
	}
	
	public String toString()
	{
		return this.getI() + "i + " + this.getJ() + "j + " + this.getK() + "k";
	}
	
	
	
//	// static methods

	public static double getDotProduct(Vector v1, Vector v2)
	{
		return v1.getI() * v2.getI() + v1.getJ() * v2.getJ() + v1.getK() * v2.getK();
	}
	
	public static Vector getCrossProduct(Vector v1, Vector v2)
	{
		double i = (v1.getJ() * v2.getK() - v2.getJ() * v1.getK());
		double j = (v2.getI() * v1.getK() - v1.getI() * v2.getK());
		double k = (v1.getI() * v2.getJ() - v2.getI() * v1.getJ());
		
		Vector n = new Vector(i, j, k);
		
		return n;
	}
	
	public static double getVectorMagnitude(Vector v)
	{
		return Math.sqrt(Vector.getDotProduct(v, v));
	}
	
	public static Vector getUnitVector(Vector v)
	{
		double v_magnitude = Vector.getVectorMagnitude(v);
		
		double x_comp = v.getI() / v_magnitude;
		double y_comp = v.getJ() / v_magnitude;
		double z_comp = v.getK() / v_magnitude;
		
		Vector unitvector = new Vector(x_comp, y_comp, z_comp);
		
		return unitvector;
	}
	
	public static Vector getVectorFromPoints(Point a, Point b)
	{
		double delta_x = b.getX() - a.getX();
		double delta_y = b.getY() - a.getY();
		double delta_z = b.getZ() - a.getZ();
		
		Vector v = new Vector(delta_x, delta_y, delta_z);
		
		return v;
	}
}
