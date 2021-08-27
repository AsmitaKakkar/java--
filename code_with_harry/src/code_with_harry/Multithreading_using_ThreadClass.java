package code_with_harry;

class thread1 extends Thread{
	public void run()
	{
		int i=0;
		while(i<400)
		{
			System.out.println("This is thread 1 !! \n Thread 1 is working !!");
			System.out.println("I am very happy !!");
			i++;
		}
	}
	
}

class thread2 extends Thread{
	public void run()
	{
		int i=0;
		while(i<400)
		{
			System.out.println("This is thread 2 !!\n Thread 2 is working even better!!");
			System.out.println("I am sad !!");
			i++;
		}
	}
}

public class Multithreading_using_ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		t2.start();

	}

}
