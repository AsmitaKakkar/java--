package code_with_harry;

import java.util.Scanner;

public class SumOfNumbers_in_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number!!");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,mult=0;
		for(int i=1;i<=10;i++)
		{
			mult=num*i;
			System.out.println(num + "* "+i+" = "+mult);
			sum+=mult;
		}
		System.out.println("Sum of the numbers of table are : "+sum);

	}

}
