package code_with_harry;

import java.util.Scanner;

public class pattern2_rec {
	static void function(int num)
	{
		if(num>0)
		{
			for(int i=num;i>0;i--)
			{
				for(int j=i;j>0;j--)
				{
				System.out.print("* ");
			
				}
				System.out.println();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Limit!!");
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		function(num);

	}

}
