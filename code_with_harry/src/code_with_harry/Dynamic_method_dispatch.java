package code_with_harry;


class Phone
{
	public void greet()
	{
		System.out.println("Good Morning!!");
	}
	
	public void name()
	{
		System.out.println("hey !! My name is Phone !!");
	}
	
	public void showTime()
	{
		System.out.println("Display time in phone ......");
	}
	
	public void on ()
	{
		System.out.println("Turning on Phone .......");
	}
}

class smartPhone extends Phone
{
	public void swagat()
	{
		System.out.println("Aapka swagat hai !!");
	}
	
	public void music()
	{
		System.out.println("Playing music........");
	}
	
	public void name()
	{
		System.out.println("hey !! my name is smart phone !!");
	}
	
	public void on()
	{
		System.out.println("Turning on smartPhone ........");
	}
}


public class Dynamic_method_dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone ph=new Phone();
		//ph.name();
		smartPhone smph=new smartPhone();
		//smph.name();
		
		Phone obj1=new smartPhone();  //This is allowed due to dynamic method dispatch !!
		//smartPhone obj2=new Phone();    This is not allowed !!
		
		obj1.on();
		obj1.name();
		obj1.showTime();
		// obj1.music();  It is not allowed because it is a feature of smartphone only and not of phone !!
		
	}

}
