package javaLab;

import java.util.Scanner;

public class instance_variable {
	int a,b,c;
	void add()
	{
		Scanner sc=new Scanner (System.in);
		
	System.out.println("Enter values of variable a and b:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=a+b;
	System.out.println("Result = "+c);
	
	}
	
	void subs()
	{
		System.out.println("Enter two values:");
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println("Result = "+c);
		
		
	}
	

	public static void main(String[] k) {
		// TODO Auto-generated method stub
		instance_variable iv=new instance_variable();
		
		System.out.println("Addition of a and b is--------");
		
		iv.add();
		
		System.out.println("Substraction of a and b is------");
		
		iv.subs();
		

	}

}
