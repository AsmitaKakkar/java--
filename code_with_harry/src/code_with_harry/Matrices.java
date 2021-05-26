package code_with_harry;

import java.util.Scanner;

public class Matrices {
	public static void main(String [] args)
	{
		System.out.println("Enter the elemtents in matrix 1!!");
		Scanner sc=new Scanner(System.in);
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements in matrix 2!!");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		int sum[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Sumation of elements of matrix 1 and matrix 2 is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
