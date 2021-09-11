package code_with_harry;

class myThread implements Runnable{
	public void run() {
		while(true)
		System.out.println("Hey !! I am thread 1 !!");
	}
}

class myThread2 implements Runnable{
	public void run() {
		while(true)
		System.out.println("Heyeeee !! i am thread 2 !!");
	}
}

public class Practice_set_prob1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread t1=new myThread();
		Thread t2=new Thread(t1);
		myThread2 t3=new myThread2();
		Thread t4=new Thread(t3);
		t2.start();
		t4.start();
	}

}
