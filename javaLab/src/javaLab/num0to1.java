package javaLab;

import java.util.Scanner;

public class num0to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		num=sc.nextInt();
		
		String str=Integer.toString(num);
		int len=str.length();
		String str1="";
		
		for(i=0;i<len;i++)
		{
			if(str.charAt(i)=='0')
			{
				str1=str1+'1';
			}
			else
			{
				str1=str1 + str.charAt(i);
			}
				
		}
		System.out.println("Resultant number is : "+str1);
	}

}
