package code_with_harry;



class thread_2 extends Thread{
	public void run()
	{
		int i=0;
		while(i<4000)
		System.out.println("Good Morning !!");
		i++;
	}
}


class thread_1 extends Thread{
	public void run()
	{
		while(true)
		{
			
		System.out.println("Welcome!!");
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
	
	}
	
}



public class Practice_set_prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thread_1 t1=new thread_1() ; 
		thread_2 t2=new thread_2();
		t1.start();
		t2.start();

	}

}
