package code_with_harry;

import java.util.Scanner;

public class income_tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tax=0,amount=0;
		System.out.println("Income tax is applied to only those with income more than or equals to 2..5L per annum!!");
		System.out.println("Enter your total income of a year!! ");
		Scanner sc=new Scanner(System.in);
		float income=sc.nextFloat();
		if(income>=250000 && income<=500000)
		{
			
			 tax=tax+((income-250000)*5/100);
			 amount=income-tax;
		}
		else if(income>=500000 && income<=1000000)
		{
			 tax=tax+((500000-250000)*5/100);
			 tax=tax+((income-500000)*20/100);
			 amount=income-tax;
		}
		else 
		{
			 tax=tax+((500000-250000)*5/100);
			 tax=tax+((1000000-500000)*20/100);
			 tax=tax+((income-1000000)*30/100);
			 amount=income-tax;
		}
		
		System.out.println("Now!! you will have to pay the total tax of "+tax+" rupees!!");
	}

}
