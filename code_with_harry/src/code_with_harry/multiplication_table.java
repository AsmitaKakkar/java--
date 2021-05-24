package code_with_harry;

import java.util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number whose table you want !!");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}

	}

}
