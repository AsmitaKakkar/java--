package javaLab;

import java.util.Scanner;

public class amicable_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,sum_num1=0,sum_num2 = 0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		
		for(i=1;i<num1;i++)
		{
			if(num1%i==0)
			{
				sum_num1+=i;
			}
		}
		for(i=1;i<num2;i++)
		{
			if(num2%i==0)
			{
				sum_num2+=i;
			}
		}
		
		if((sum_num2==num1) && (sum_num1==num2))
		{
			System.out.println(num1+" and "+num2+" are ambience numbers!!");
		}
		else
		{
			System.out.println(num1+" and "+num2+" are not ambience numbers!!");
		}
	}

}
