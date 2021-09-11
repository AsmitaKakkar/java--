package code_with_harry;

	class mythr extends Thread{

	public mythr(String name)
	{
		super(name);
	}
	
	public void run()
	{
		while(true)
		System.out.println("Hey !! This is "+this.getName());
	}
	
}
	
	public class Thread_priorities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mythr t1=new mythr("Asmita1");
		mythr t2=new mythr("Asmita2");
		mythr t3=new mythr("Asmita3");
		mythr t4=new mythr("Asmita4");
		mythr t5=new mythr("Asmita5");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.NORM_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}

