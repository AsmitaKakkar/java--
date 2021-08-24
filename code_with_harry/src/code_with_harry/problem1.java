package code_with_harry;

class calculator{
	public void calculate(int a,int b)
	{
		System.out.println("your result is -> "+a+b);
	}
}

class scientific_calculator{
	public void calculate(int a,int b)
	{
		System.out.println("your result is -> "+Math.sin(a+b));
	}
	
}

class hybrid_calculator{
	public void calculate(int a,int b)
	{
		System.out.println("your result is -> "+a+b);
		System.out.println("your result is -> "+Math.sin(a+b));
	}
	
}

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c=new calculator();
		c.calculate(2, 3);
		scientific_calculator sc=new scientific_calculator();
		sc.calculate(2, 3);
		hybrid_calculator hc=new hybrid_calculator();
		hc.calculate(2, 3);

	}

}
