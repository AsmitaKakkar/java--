package code_with_harry;

import java.util.Scanner;

  
public class pattern1_rec {
	
	static void function(int n) {
		if(n>0)
		{
			
			function(n-1);
			for(int i=0;i<n;i++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		function(n);

	}
		
}


