package code_with_harry;

interface sampleInterface{
	void meth1();
	void meth2();
}

interface childOfSampleInterface extends sampleInterface{
	void meth3();
	void meth4();
	
}

class MySampleClass implements sampleInterface{
	public void meth1()
	{
		System.out.println("Hey!! I am method 1 !!");
	}
	
	public void meth2()
	{
		System.out.println("Hey !! I am method 2!!");
	}
	
	public void meth3()
	{
		System.out.println("Hey!! I am method 3 !!");
	}
	
	public void meth4()
	{
		System.out.println("Hey !! I am method 4 !!");
	}
}

public class Inheritance_in_interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MySampleClass obj=new  MySampleClass();
		 obj.meth1();
		 obj.meth2();
		 obj.meth3();
		 obj.meth4();
		
	}

}
