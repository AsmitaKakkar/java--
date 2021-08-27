package code_with_harry;

class RunnableThread1 implements Runnable{
	public void run() {
		for(int i=0;i<500;i++)
		{
			System.out.println("I am a thread one not a threat !!");

		}
	}
}

class RunnableThread2 implements Runnable{
	public void run() {
	for(int i=0;i<500;i++)
	{
		System.out.println("I am thread 2 a big threat to you !!!!");
	}
	}
}

public class Multithreading_using_runnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableThread1 bullet1 =new RunnableThread1();
		Thread gun1=new Thread(bullet1);
		
		RunnableThread2 bullet2=new RunnableThread2();
		Thread gun2=new Thread(bullet2);
		
		gun1.start();
		gun2.start();
		

	}

}
