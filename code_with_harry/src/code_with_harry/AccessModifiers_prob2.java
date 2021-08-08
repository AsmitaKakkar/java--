package code_with_harry;


class cylinderStuff
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
}


public class AccessModifiers_prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cylinderStuff cy =new cylinderStuff();
		
		
		cy.setHeight(12);
		cy.setRadius(9);
		
		System.out.println("Height of the given cylinder is => ");
		int h=cy.getHeight();
		System.out.println(h);
		System.out.println("Radius of the given cylinder is => ");
		int r=cy.getRadius();
		System.out.println(r);

		
		System.out.println("Surface Area of cylinder is=> ");
		double area=cy.SurfaceArea();
		System.out.println(area);
		
		System.out.println("Volume of cylinder is => ");
		double volume=cy.Volume();
		System.out.println(volume);

	}

}
