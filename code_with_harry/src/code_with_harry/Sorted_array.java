package code_with_harry;

import java.util.Scanner;

public class Sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the elements in an array!!");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [10];
		boolean isSorted=true;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				isSorted=false;
				break;
			}
		}
		if(isSorted)
		{
			System.out.println("Array is sorted!!");
		}
		else
		{
			System.out.println("Array is not sorted!!");
		}

	}

}
