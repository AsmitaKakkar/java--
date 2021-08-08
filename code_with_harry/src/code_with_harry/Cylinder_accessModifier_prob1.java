package code_with_harry;


class cylinder
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
}


public class Cylinder_accessModifier_prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cylinder cy=new cylinder();
		
		cy.setRadius(2);
		cy.setHeight(5);
		
		System.out.println("Height of the given cylinder is => ");
		int h=cy.getHeight();
		System.out.println(h);
		System.out.println("Radius of the given cylinder is => ");
		int r=cy.getRadius();
		System.out.println(r);

	}

}
