package code_with_harry;

class Cellphone{
	
	public void ring()
	{
		System.out.println("Ringing.......");
	}
	
	public void call()
	{
		System.out.println("Calling.....");
	}
	
	public void block()
	{
		System.out.println("You are blocked!!");
	}
	
	public void waitt()
	{
		System.out.println("Waiting.....");
	}
	
	public void callFriend()
	{
		System.out.println("Calling vaishnavi....");
	}
}

public class Classes_prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cellphone apple=new Cellphone();
		
		System.out.print("Your phone is ");
		apple.ring();
		System.out.println();
		System.out.print("Your phone is ");
		apple.call();
		System.out.println();
		System.out.print("Your phone is showing ");
		apple.block();
		System.out.println();
		System.out.print("Your phone is on ");
		apple.waitt();
		System.out.println();
		System.out.print("Your phone is ");
		apple.callFriend();
		 

	}

}
