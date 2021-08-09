package code_with_harry;

class Base
{
	int x;
	

public void printMe()
{
	System.out.println("I am a Constructor !!");
}

public int getterX()
{
	return x;
}


public void setterX(int x)
{
	System.out.println("I am in base class and setting x now !!");
	this.x=x;
}


}

class derived extends Base
// All the properties of the base class is included in this derived class with the help of extends keyword and hence it is known as inheritance!!
{
	int y;
	
	public int getterY()
	{
		return y;
	}
	
	public void setterY(int y)
	{
		System.out.println("I am in derived class and setting y now !!");
		this.y=y;
	}
}

public class Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an object of base class
		Base b=new Base();
	
		b.setterX(2);
		System.out.println("The value of x is :- "+b.getterX());
		
		derived d=new derived();
		d.setterX(4);
		System.out.println("The value of x is :- "+d.getterX());
		d.setterY(6);
		System.out.println("The value of y is :- "+d.getterY());

	}

}
