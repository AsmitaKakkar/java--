package javaLab;

import java.util.Scanner;

public class zigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the length of array:");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the values of array ->");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Obtained values of array ->");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		boolean flag=true;
		int temp=0;
		
		for(i=0;i<n-1;i++)
		{
			if(flag)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			else
			{
				if(arr[i]<arr[i+1])
						{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
						}
			}
			flag=!flag;
		}
		
		System.out.println("Resultant Zigzag array ->");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
