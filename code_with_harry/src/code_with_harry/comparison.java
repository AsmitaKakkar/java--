package code_with_harry;

import java.util.Scanner;

public class comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34;
		System.out.println("Enter the number to be compared!!");
		Scanner sc=new Scanner(System.in);
		int to_comp=sc.nextInt();
		if(num>to_comp)
		{
			System.out.println(num + " is greater than " + to_comp);
		}
		else
		{
			System.out.println(num + " is not greater than "+to_comp);
		}

	}

}
