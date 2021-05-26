package code_with_harry;

import java.util.Scanner;

public class Max_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the elements in an array!!");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Maximim element of the array!!");
		int max=arr[0];
		int temp=0;
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					temp=max;
					max=arr[i];
					arr[i]=max;
				}
			}
			System.out.println("Maximum element of array is : "+max);

	}

}
