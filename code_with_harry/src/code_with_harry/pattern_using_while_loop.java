package code_with_harry;

import java.util.Scanner;

public class pattern_using_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter limit:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=0;
		while(i<num)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.print("\n");
		}

	}

}
