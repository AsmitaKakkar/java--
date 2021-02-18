package menuDriven;

import java.util.Scanner;

public class maturityAmount {
	
	public static void main(String[] abs)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		float p,r,t,inst;
		double a;
		
		do
		{
			System.out.println("______________________________________________");
			System.out.println("---------------------MENU---------------------");
			System.out.println("______________________________________________");
			System.out.println("1. Term Deposit");
			System.out.println("2. Recurring Deposit");
			System.out.println("3. Exit");
			System.out.println("______________________________________________");
			System.out.println("Enter your choice(1-3):");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter principal amount:(p):");
				p=sc.nextFloat();
				System.out.println("Enter rate of interest:(r):");
				r=sc.nextFloat();
				System.out.println("Enter time period in years:(t):");
				t=sc.nextFloat();
				a=p*(1+r/100)*t;
				System.out.println("Maturity Amount -> "+a);
				break;
			}
			case 2:
			{
				System.out.println("Enter monthly installment:(inst):");
				inst=sc.nextFloat();
				System.out.println("Enter rate of interest:(r):");
				r=sc.nextFloat();
				System.out.println("Enter time period:(t):");
				t=sc.nextFloat();
				a=inst*t+inst*t*(t+1)/2*r/100*1/12;
				System.out.println("Maturity Amount -> "+a);
				break;
			}
			default:
			{
				System.out.println("ERROR!!");
				System.out.println("Enter correct option !!");
				break;
			}
			
			}
			System.out.println("__________________________________________________________________________");
		}
		
		while(choice!=3);
	}

}
