package code_with_harry;

class base1
{
	private int x;
	private int y;
	
	base1()
	{
		System.out.println("Mein ek Constructor hoon........");
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	
	public void setY(int y)
	{
		this.y=y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public base1(int x)
	{
		System.out.println("I am an overloaded constructor of base class with the value of x as: "+x);
	}
}

class derived1 extends base1
{
	public derived1()
	{
		System.out.println("Mein derived class ka constructor hoon.......");
	}
	
	
	public derived1(int x, int y)
	{
		
		super(x);
		System.out.println("I am an overloaded constructor of derived class with the value of y as: "+y);
	}
	
}


class childOfDerived extends derived1
{
	
	public childOfDerived()
	{
		System.out.println("I am a constructor of child of deerived class!!");
	}
	
	public childOfDerived(int x,int y,int z)
	{
		super(x,y);
		System.out.println("I am an overloaded constructor of child of derived class with the value of z as : "+z);
	}
}


public class Constructors_in_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//base1 b=new base1();
		//derived1 d=new derived1(4,8);
		//Derived class will also call the constructor of base class even if its constructor is not defined!!
		//and when the constructor of derived class id=s defined then it calls the constructor of base class and derived class both!!
		childOfDerived cd=new childOfDerived(12,13,14);
		
		
		
		

	}

}
