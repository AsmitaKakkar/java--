package code_with_harry;

class rectangle1
{
	int l;
	int b;
	
	public int arearec()
	{
		return l*b;
	}
	
	rectangle1()
	{
		System.out.println("I am a default constructor of rectangle class !!");
	}
	
	rectangle1(int l,int b)
	{
		System.out.println("Parameterized constructor of rectangle!!");
		this.l=l;
		this.b=b;
	}
}

class cuboid extends rectangle1
{
	int h;
	
	public int area()
	{
		
		return ((2*l*b)+(2*b*h)+(2*h*l));
		
	}
	
	cuboid()
	{
		System.out.println("I am a default constructor of cubopid class !!");
	}
	
	cuboid(int l,int b,int h)
	{
		super(l,b);
		System.out.println("Parameterized constructor of cuboid !!");
		
		this.h=h;
	}
	
	public double volume()
	{
		return l*b*h;
	}
}

public class Practiceset_prob2_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle1 obj=new rectangle1();
		cuboid obj2=new cuboid(1,2,3);
		
		System.out.println("area of cuboid is :- "+ obj2.area());
		System.out.println("area of rectangle is :- "+obj2.arearec());
		System.out.println("Volume of cuboid is -> "+obj2.volume());
	}

}
