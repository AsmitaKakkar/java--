package code_with_harry;

public class var_Args {
	
	static int Sum(int ...arr)
	{
		int result=0;
		
		for(int a:arr) {
			result+=a;
		}
		return result;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("The sum of two numbers is:-"+Sum(2,3));
		System.out.println("The sum of 1, 2, 3 and 4 is :-"+Sum(1,2,3,4));
	}

}
