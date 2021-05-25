package code_with_harry;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float arr[]=new float[5];
		float sum=0f;
		System.out.println("Enter five numbers in an array!!");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextFloat();
		}
		for(int i=0;i<5;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of array numbers are : "+sum);
	}

}
