package code_with_harry;

class myNewThr1 extends Thread{
	public void run () {
		int i=0;
		while(true)
		{
			System.out.println("Hey !! I am thread 1 !!");
			
			//Interrupt method
			try {
				Thread.sleep(4000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			i++;
			
		}
		
	}
	
}

class myNewThr2 extends Thread{
	public void run()
	{
		int i=0;
		while(i<300)
		{
			System.out.println("Hey !! I am thread 2 !!");
			
			i++;
		}
		
	}
}

public class Thread_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myNewThr1 t1=new myNewThr1();
		myNewThr2 t2=new myNewThr2();
		t1.start();
		
		//Join method
		
		/*try {
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		
		
		t2.start();

	}

}
