package code_with_harry;

class A
{
	int a;
	
	public int asmita()
	{
		return 22;
	}
	
	public void meth2()
	{
		System.out.println("I am a method 2 of class A !!");
	}
}

class B extends A
{
	
	public void meth3()
	{
		System.out.println("I am a method 2 of class B!!");	
	}
	
	//this is overriding !! 
	// Calling the same method of the base class and modify it accordingly in the derived class !!
	@Override  //this is an annotation , which tells us that this method is overridden!!
	public void meth2()
	{
		System.out.println("I am a method 2 of class B !!");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		obj1.meth2();
		
		B obj2=new B();
		obj2.meth2();

	}

}
