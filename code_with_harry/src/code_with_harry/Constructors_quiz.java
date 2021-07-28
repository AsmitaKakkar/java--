package code_with_harry;

class Merchant
{
	private int salary;
	
	public Merchant()
	{
		salary=10000;
	}
	
	public int getSalary()
	{
		return salary;
	}

	
}


public class Constructors_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Merchant mer=new Merchant();
		
		System.out.println("Salary of a Merchant in Indian navy => ");
		System.out.println(mer.getSalary());

	}

}
