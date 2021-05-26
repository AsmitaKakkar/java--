package code_with_harry;

import java.util.Scanner;

public class For_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter marks of all the students of a class in physics !!");
		Scanner sc=new Scanner(System.in);
		float arr[]=new float[10];
		float sum=0f;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextFloat();
		}
		
		for(float i:arr)
		{
			sum=sum+i;
		}
		System.out.println("Sum of marks of all the students of physics are :"+sum);

	}

}
