package code_with_harry;

import java.util.Scanner;

public class Pattern2_using_methods {
	
	static void pattern(int num)
	{
		for (int i=0;i<num;i++)
		{
			for(int j=i;j<num;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Limit!!");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		pattern(num);
		

	}

}
