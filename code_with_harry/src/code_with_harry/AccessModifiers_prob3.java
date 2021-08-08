package code_with_harry;


class ConstructorCylinder
{
	private int radius;
	private int height;
	
	public void setRadius(int rad)
	{
		radius=rad;
	}
	
	public void setHeight(int hei)
	{
		height=hei;
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public double SurfaceArea()
	{
		
		return 2*3.14*radius*radius+2*3.14*radius*height;
	}
	
	public double Volume()
	{
		return 3.14 *radius *radius*height;
	}
	
	public ConstructorCylinder(int rad,int hei)
	{
		rad=radius;
		hei=height;
	}

}


public class AccessModifiers_prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorCylinder cc=new ConstructorCylinder(3,2);
		
		double area=cc.SurfaceArea();
		double volume=cc.Volume();
		
		System.out.println("Surface area => "+area);
		System.out.println("Volume => "+volume);
		
		
	}

}
