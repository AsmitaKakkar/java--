package code_with_harry;


class Circlehai
{
	int radius;
	
	Circlehai()
	{
		System.out.println("I am a constructor of Circle class!!");
	}
	
	Circlehai(int radius)
	{
		System.out.println("I am circle parameterized constructor!!");
		this.radius=radius;
	}
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
}

class Cylinderhai extends Circlehai
{
	int height;
	
	Cylinderhai(int radius,int height)
	{
		super(radius);
		
		System.out.println("I am cylinder parameterized constructor !!");
		
		
		this.height=height;
		
	}
	
	
	Cylinderhai()
	{
		System.out.println("I am a constructor of Cylinder class !!");
	}
	
	public double volume()
	{
		return Math.PI*radius *radius*height;
	}
	
	public double areacy()
	{
		return 2*Math.PI*radius*height+Math.PI*radius*radius;
	}
}


public class practiceSet_prob1_{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circlehai c=new Circlehai(2);
		Cylinderhai cy=new Cylinderhai(12,4);
		
		System.out.println("Area of circle is : "+c.area());
		System.out.println("Area of Circle is -> "+cy.area());
		System.out.println("Volume of cylinder is -> "+cy.volume());
		System.out.println("Area of cylinder is -> "+cy.areacy());
	}

}
