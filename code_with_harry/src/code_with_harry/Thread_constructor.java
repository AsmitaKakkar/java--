package code_with_harry;

public class Thread_constructor extends Thread{

		public Thread_constructor(String name)
		{
			super(name);
		}
		public void run()
		{
			/*while(true)
			{
				System.out.println("I am a thread!!");
			}*/
			System.out.println("heyeeeee!!");
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_constructor obj1 =new Thread_constructor("Asmita");
		Thread_constructor obj2 =new Thread_constructor("Rangoli");
		obj1.start();
		obj2.start();
		System.out.printf("Id of %s is %d\n",obj1.getName(),obj1.getId());
		System.out.printf("Id of %s is %d\n ",obj2.getName(),obj2.getId());
	}
}


