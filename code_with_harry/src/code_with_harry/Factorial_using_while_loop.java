package code_with_harry;

import java.util.Scanner;

public class Factorial_using_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************Using while loop********");
		System.out.println("Enter the number you want factorial of which!!");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		int i=num;
		while( i>0) {
			fact*=i;
			i--;
		}
		System.out.println("Factorial of "+num+ " is "+fact);

	}

}
