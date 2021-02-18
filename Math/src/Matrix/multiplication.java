package Matrix;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,k;
		int arr[][]=new int[5][5];
		int brr[][]=new int[5][5];
		int mult[][]=new int[5][5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the limit for matrix:");
		n=sc.nextInt();
		
		System.out.println("Enter the values in first matrix:");
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
		System.out.println('\t'+"******Matrix Multiplication******"+'\t');
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
				mult[i][j]+=arr[i][k]*brr[k][j];
				}
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(mult[i][j]+" ");
		
			}
				System.out.print('\n');
		}
}
	
}
