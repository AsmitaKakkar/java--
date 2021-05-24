package code_with_harry;

import java.util.Scanner;

public class factorial_using_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************Using for loop********");
		System.out.println("Enter the number you want factorial of which!!");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of "+num+ " is "+fact);
	
	}
	
}
	
