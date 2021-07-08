package code_with_harry;

import java.util.Scanner;

public class MultTable_using_methods {
	
	static void Multiplication_Table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.format("%d x %d = %d \n",n,i,n*i);
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number !!");
		int num=sc.nextInt();
		Multiplication_Table(num);

	}

}
