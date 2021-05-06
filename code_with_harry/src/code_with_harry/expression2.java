package code_with_harry;

import java.util.Scanner;

public class expression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float v,u,a,s;
		System.out.println("Enter the values of v");
		Scanner sc=new Scanner (System.in);
		v=sc.nextInt();
		System.out.println("Enter the values of u");
		u=sc.nextInt();
		System.out.println("Enter the values of a");
		a=sc.nextInt();
		System.out.println("Enter the values of s");
		s=sc.nextInt();
		float result=((v*v)-(u*u))/(2*a*s);
		System.out.println("Result = "+result);
		

	}


}
