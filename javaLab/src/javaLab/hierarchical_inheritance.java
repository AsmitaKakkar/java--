package javaLab;

import java.util.Scanner;


class calculator{
	void menu() {
		System.out.println("1. Addition\n 2. Substraction\n 3. Multiplication\n 4. Division\n");
		
}
	
}


class Addition extends calculator{
	void add(int a, int b)
	{
		System.out.println("Enter the values of a and b:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int result = a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+result);
	}
	
}

class Substraction extends calculator{
	void sub(int a, int b)
	{
		System.out.println("Enter the values of a and b:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int result=a-b;
		System.out.println("Substraction of "+a+" and "+b+" is "+result);
	}
}

class Multiplication extends calculator{
	void mult(int a, int b)
	{
		System.out.println("Enter the values of a and b:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int result=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+result);
	}
}


class Division extends calculator{
	void div(int a,int b)
	{
		System.out.println("Enter the values of a and b:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int result=a/b;
		System.out.println("Division of "+a+" and "+b+" is "+result);
	}
}

public class hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj1=new Addition();
		Substraction obj2=new Substraction();
		Multiplication obj3=new Multiplication();
		Division obj4=new Division();
		obj1.menu();
		obj2.menu();
		obj3.menu();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		if(choice==1)
		{
			obj1.add(choice, choice);
			
		}
		else if(choice==2)
		{
			obj2.sub(choice, choice);
		}
		else if(choice==3)
		{
			obj3.mult(choice, choice);
		}
		else if(choice==4)
		{
			obj4.div(choice, choice);
		}
		else 
			System.out.println("Wrong choice!!");
	}
}
