package code_with_harry;

import java.util.Scanner;

public class FibonacciSries_using_methods {
	
	static int fib(int num)
	{
		if(num==1)
			return 0;
		if(num==2)
			return 1;
		else
			return fib(num-1)+fib(num-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the term!!");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		System.out.println(fib(num));

	}

}
