package code_with_harry;

import java.util.Scanner;

public class checkInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t\tChecking Number\n\n");
		System.out.println("Enter the number you want to check!!");
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
			if(num%1==0)
			{
				System.out.println("yes!! "+num +" is an integer");
			}
			else {
				System.out.println(num+" is not an integer");
			}
		}
		
	}