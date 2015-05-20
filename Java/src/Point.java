
public class Point
{
	private double x, y, z;
	
	public Point(double x, double y, double z)
	{
		this.setCoordinates(x, y, z);
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public void setZ(double z)
	{
		this.z = z;
	}
	
	public void setCoordinates(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public double getZ()
	{
		return this.z;
	}
	
	public String toString()
	{
		return "(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
	}
	
	// static methods
	
	public static double getDistanceBetweenPoints(Point p1, Point p2)
	{
		
	}
}
