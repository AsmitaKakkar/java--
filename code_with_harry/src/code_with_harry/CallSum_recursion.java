package code_with_harry;

import java.util.Scanner;

public class CallSum_recursion {
	
	static int sum(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num+sum(num-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n!!");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum of first "+n+" natural numbers are :-");
		System.out.println(sum(n));
		

	}

}
