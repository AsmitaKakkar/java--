package code_with_harry;

import java.util.Scanner;

public class week_day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the day number!!");
		Scanner sc =new Scanner (System.in);
		int day=sc.nextInt();
		
		switch(day)
		{
		case 1:
		{
			System.out.println("Monday");
			break;
		}
		case 2:
		{
			System.out.println("Tuesday");
			break;
		}
		case 3:
		{
			System.out.println("Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Thursday");
			break;
		}
		case 5:
		{
			System.out.println("Friday");
			break;
		}
		case 6:
		{
			System.out.println("Saturday");
			break;
		}
		case 7:
		{
			System.out.println("Sunday");
		}
		default:
		{
			System.out.println("Sorry!! \n you entered wrong number for the day!!\n\t Please try again(1-7)");
		}
		}

	}

}
