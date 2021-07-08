package code_with_harry;

import java.util.Scanner;

public class Recursion {
	
	 static int factorial(int n)
	 {
		 if(n==0 || n==1)
		 {
			 return 1;
		 }
		 else
		 {
			 return n*factorial(n-1);
		 }
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number you want to calculate the factorial of!!");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Factorial of "+n+" is :- "+ factorial(n) );
		
	}

}
