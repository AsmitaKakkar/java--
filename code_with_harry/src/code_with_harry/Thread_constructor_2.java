package code_with_harry;

public class Thread_constructor_2 implements Runnable{
	public Thread_constructor_2(String name)
	{
		
	}
	
	public void run() {
		System.out.println("Hey !! This is asmita kakkar!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_constructor_2 obj1=new Thread_constructor_2("Asmita");
		Thread obj2=new Thread(obj1);
		obj2.start();
		System.out.println(obj1);
		
	}
	

}
