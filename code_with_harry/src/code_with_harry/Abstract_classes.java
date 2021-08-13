package code_with_harry;


abstract class parent{
	
	parent()
	{
		System.out.println("Mein parent class ka constructor hoon !!");
		
	}
	
	public void sayHello()
	{
		System.out.println("Hello!!");
	}
	
	abstract public void greet();   // we can add anything of our choice in this abstract method 
									// its like parent class is saying to its child classes that bachho tum isme apni tarf se kuc bhi likh lena !!
	
	abstract public void greet2();
}

class child extends parent{
	public void greet()
	{
		System.out.println("Good Morning");
	}
	
	
	public void greet2()
	{
		System.out.println("Sat shri akal ji ");
	}
	
	public void greet3()
	{
		System.out.println("Har shri Nath ji ");
	}
}


abstract class child2 extends parent{
	
	public void gta()
	{
		System.out.println("I am GTA Vice City Game !!");
	}
}

public class Abstract_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	parent p=new parent();  //eror !! because it is an abstract class 
		
		child ch=new child();
	//	child2 ch2 =new child2();    //error!!
		
		ch.greet2();
		ch.sayHello();
		
	}

}
