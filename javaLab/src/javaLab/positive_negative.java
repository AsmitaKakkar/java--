package javaLab;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter length of array -> ");
		 n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		 System.out.println("Enter values in an array:");
		 
		 for(i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 
		 System.out.println("Obtained array->");
		 for(i=0;i<n;i++)
		 {
			System.out.println(arr[i]);
		 }
		 
		 int temp=0;
		 int j=0;
		 
		 for(i=0;i<n;i++)
		 {
			 if(arr[i]<0)
			 {
				 if(i!=j)
			 
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
				 
				 j++;
			 }
		 }
		 
		 System.out.println("Resultant array ->");
		 
		 for(i=0;i<n;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 
	}

}
