package code_with_harry;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter elements in an array!!");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Reversed array!!");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
