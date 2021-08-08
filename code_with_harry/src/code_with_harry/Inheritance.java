package code_with_harry;

class Base
{
	int x;
	

public void printMe()
{
	System.out.println("I am a Constructor !!");
}

public int getter()
{
	return x;
}


public void setter(int x)
{
	x=x;
}


}

class derived extends Base
// All the properties of the base class is included in this derived class with the help of extends keyword and hence it is known as inheritance!!
{
	int y;
	
	public int getter()
	{
		return y;
	}
	
	public void setter(int y)
	{
		y=y;
	}
}

public class Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
