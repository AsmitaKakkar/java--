package code_with_harry;

class threads extends Thread{
	public void run()
	{
		while(true)
		System.out.println("Welcome!!");
	}
	
}



class threads2 extends Thread{
	public void run()
	{
		while(true)
		System.out.println("Good Morning !!");
	}
}


public class Practice_set_prob1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threads t1=new threads(); 
		threads2 t2=new threads2();
		t1.start();
		t2.start();
	}

}
