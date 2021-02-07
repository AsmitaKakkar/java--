package menuDriven;

import java.util.Scanner;

public class calculatorMenu {

	public static void main(String[] args) {
		float result,a,b;
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("----------------------------------------------------");
			System.out.println("-----------------------MENU-------------------------");
			System.out.println("----------------------------------------------------");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("----------------------------------------------------");
			System.out.println("Enter your choice(1-5)");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter first number:");
				a=sc.nextFloat();
				System.out.println("Enter second number:");
				b=sc.nextFloat();
				result=a+b;
				System.out.println("Result -> "+result);
				break;
			}
			case 2:
			{
				System.out.println("Enter first number:");
				a=sc.nextFloat();
				System.out.println("Enter second number:");
				b=sc.nextFloat();
				result=a-b;
				System.out.println("Result -> "+result);
				break;
			}
			case 3:
			{
				System.out.println("Enter first number:");
				a=sc.nextFloat();
				System.out.println("Enter second number:");
				b=sc.nextFloat();
				result=a*b;
				System.out.println("Result -> "+result);
				break;
			}
			case 4:
			{
				System.out.println("Enter first number:");
				a=sc.nextFloat();
				System.out.println("Enter second number:");
				b=sc.nextFloat();
				result=a/b;
				System.out.println("Result -> "+result);
				break;
				
			}
			case 5:
			{
				System.exit(0);
			}
			default:
			{
				System.out.println("ERROR!!");
				System.out.println("Please select correct option(1-5)!!");
				break;
			}
			}
			System.out.println("--------------------------------------------------------");
	}
		
		while(choice!=5);
	}

}
