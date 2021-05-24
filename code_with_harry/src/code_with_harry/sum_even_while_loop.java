package code_with_harry;

import java.util.Scanner;

public class sum_even_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the limit of even numbers you want!!");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int i=0, even_sum=0,even_num=0;
		System.out.println("First "+n+" even numbers are : ");
		while(i<n)
		{
			i++;
			
			even_num=2*i;
			System.out.println(even_num);
			even_sum+=even_num;
		}
		
		System.out.println("Sum of "+n+ " even numbers is : "+even_sum);

	}

}
