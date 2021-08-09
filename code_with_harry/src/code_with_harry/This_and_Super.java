package code_with_harry;

class EkClass
{
    int a;
	
	public EkClass(int a)
	{
		this.a=a;
		//this keyword is used to give a reference of the class or method in which we are defining an object or anything!!
		System.out.println("I am a constructor of Ek class and my value is : "+a);
	}
	
	public int getEkClass()
	{
		return a;
	}
	
	public int returnone()
	{
		return 1;
	}
}

class doClass extends EkClass
{
	doClass(int a)
	{
		super(a);
		System.out.println("I am a constructor of Do class!!");
	}
}

public class This_and_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EkClass e=new EkClass(49);
		//System.out.println(e.getEkClass());	
		doClass d=new doClass(23);
		//System.out.println(d.getEkClass());	
		
	}

}
