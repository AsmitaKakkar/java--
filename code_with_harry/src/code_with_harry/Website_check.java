package code_with_harry;

import java.util.Scanner;

public class Website_check {
	public static void main(String args[]) {
		System.out.println("Enter the website you want to check !!");
		Scanner sc=new Scanner (System.in);
		
		String website=sc.nextLine();
		
		if(website.endsWith(".com"))
		{
			System.out.println("This is a commercial website!!");
		}
		else if(website.endsWith(".org"))
		{
			System.out.println("This is a orginization website!!");
		}
		else if(website.endsWith(".in"))
		{
			System.out.println("This is an Indian website!!");
		}
		else
		{
			System.out.println("Enter valid extension for the website!!");
		}
	}
	

}
