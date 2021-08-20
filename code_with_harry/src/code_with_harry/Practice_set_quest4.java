package code_with_harry;

abstract class Telephone
{
	abstract void ring();
	abstract void lift(); 
	abstract void disconnect();
}

class MeraSmartphone extends Telephone
{
	public void ring()
	{
		System.out.println("Ringing......");
	}
	
	public void lift()
	{
		System.out.println("Hello Hello kon bolra hai !!");
	}
	
	public void disconnect()
	{
		System.out.println("The person you are trying to reach is not answering!! \nPlease try again later !!");
	}
}

public class Practice_set_quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone  ms=new MeraSmartphone();
		ms.lift();
		ms.disconnect();
	}

}
