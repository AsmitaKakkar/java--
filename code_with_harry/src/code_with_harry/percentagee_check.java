package code_with_harry;

import java.util.Scanner;

public class percentagee_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total = 0;
		System.out.println("Total marks obtained are from 100!!");
		System.out.println("Enter marks obtained in physics!!");
		Scanner sc=new Scanner(System.in);
		float physics=sc.nextFloat();
		System.out.println("Enter marks obtained in chemistry!!");
		float chemistry=sc.nextFloat();
		System.out.println("Enter marks obtained in Maths!!");
		float maths=sc.nextFloat();
		float sum =physics+chemistry+maths;
		float average=sum/total*100;
		if(physics>33 && chemistry >33 && maths>33 && average>40)
		{
			System.out.println("Congratulations!! You pass the exam!!");
		}
		else
		{
			System.out.println("Sorry!! You failed!!");
		}
		

	}

}
