//incomplete *****************************
package javaLab;

import java.util.Scanner;

public class saddle_point {

	public static void main(String[] args) {
		int arr[][]=new int[10][10];
		int i,j,k;
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows and columns of a matrix:");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		System.out.println("Enter the elements of the matrix---->");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Obtained Matrix----->");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int temp=0;
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
			int min_row=arr[0][i],max_col=arr[i][0];
				if(arr[j][i]<min_row)
				{
					min_row=arr[i][j];
				}
				
				for(i=0;i<column;i++)
				{
					if(arr[i][j]>max_col)
					{
						temp=max_col;
						max_col=arr[i][j];
						arr[i][j]=temp;
					}
				}
				
			}
			
		}
		System.out.println("Sorry!! there is no Saddle point in the given matrix!!");

	}

}
