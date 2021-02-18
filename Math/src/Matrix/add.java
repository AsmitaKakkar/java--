package Matrix;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		int n,i,j;
		int arr[][]=new int[5][5];
		int brr[][]=new int [5][5];
		int sum[][] =new int[5][5];
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit of a square matrix:");
		n=sc.nextInt();
		System.out.println("Enter the values in the first matrix:");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the values in second matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			brr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Sum array of first and second array:");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
				sum[i][j]=arr[i][j]+brr[i][j];
				}
			}
			
			for (i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
				
					System.out.print(sum[i][j]+" ");
				}
					System.out.println();
			}
		

	}

}
