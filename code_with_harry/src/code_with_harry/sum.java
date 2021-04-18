package code_with_harry;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		System.out.println("Enter third number:");
		int num3=sc.nextInt();
		float sum=num1+num2+num3;
		System.out.println("Sum of three numbers is:-"+sum);

	}

}
