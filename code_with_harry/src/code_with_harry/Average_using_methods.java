package code_with_harry;

import java.util.Scanner;

public class Average_using_methods {
	
	static float average(int ...num)
	{
		int sum=0,aver=0,count=0;
		for(int i:num)
		{
			sum+=i;
			count++;
		}
			aver=sum/count;
		
		return aver;
		
	}
	public static void main(String args[]) {
		System.out.println("Enter any number of arguments!!");
		//Scanner sc=new Scanner(System.in);
		//int ...num=sc.nextInt();
		System.out.println("Average of 2,3,4 are => "+average(2,3,4));
		System.out.println("Average of 4 and 5 are => "+average(4,5));
	}

}
