package code_with_harry;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year you want to check!!");
		Scanner sc =new Scanner (System.in);
		
		int year=sc.nextInt();
		
		if((year%4==0)&&((year%400==0)||(year%100!=0)))
		{
			System.out.println("Yes!! "+year+" is a leap year!!");
			
		}
		else 
		{
			System.out.println("Sorry!! "+year+ " is not a leap year !!");
		}
		
	}

}
