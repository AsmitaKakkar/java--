package code_with_harry;

import java.util.Scanner;

public class fibonaccii_series {
	
	static int Fibonaccii(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if (n==1 || n==2)
		{
			return 1;
			
		}
		
		return Fibonaccii(n-2)+Fibonaccii(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the limit till you want to get fibonaccii series!! ");
		int n=sc.nextInt();
		System.out.println("Fibonaccii Sries till "+n+" is "+"-------");
		for(int i=0;i<n;i++)
		{
			System.out.print(Fibonaccii(i)+" ");
		}
		
		

	}

}
