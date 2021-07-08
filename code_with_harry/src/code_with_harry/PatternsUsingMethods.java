package code_with_harry;

import java.util.Scanner;

public class PatternsUsingMethods {
	
	static void Pattern1(int num)
	{
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit!!");
		int num=sc.nextInt();
		Pattern1(num);
				
	}
	
	}
