package code_with_harry;

import java.util.Scanner;

public class Check_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int arr[]=new int[10];
		System.out.println("Enter numbers in an array!!");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number you want to check!!");
		
		int num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				System.out.println(num+" is present in an array!!");
				return;
			}
			
		}
			System.out.println(num+" is not present in an array!!");
	}

}
