package menuDriven;

import java.util.Scanner;

public class menuDriven1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int l,a,b,r;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------------------------------------");
		System.out.println("1. Area of Right angled triangle.");
		System.out.println("2. Area of Equilateral triangle.");
		System.out.println("3. Area of rectangle.");
		System.out.println("4. Area of Square.");
		System.out.println("5. Area of Circle.");
		System.out.println("---------------------------------------------------");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter height of a triangle (l):");
			l=sc.nextInt();
			System.out.println("Enter base of a triangle (b):");
			b=sc.nextInt();
			area =(l*b)/2;
			System.out.println("area of a right angled triangle -> "+area);
			break;
		}
		case 2:
		{
			System.out.println("Enter the length of edge of an equilateral triangle(a):");
			a=sc.nextInt();
			area=(a*a*Math.sqrt(3)/4);
			System.out.println("area of equilateral triangle->"+area);
			break;
		}
		case 3:
		{
			System.out.println("Enter the length (l) of rectangle:");
			l=sc.nextInt();
			System.out.println("Enter the breadth (b) of rectangle:");
			b=sc.nextInt();
			area=l*b;
			System.out.println("Area of rectangle -> "+area);
			break;
		}
		case 4:
		{
			System.out.println("Enter the length of side of square(l):");
			l=sc.nextInt();
			area=l*l;
			System.out.println("Area of square-> "+area);
			break;
		}
		case 5:
		{
			System.out.println("Enter the radius(r) of square:");
			r=sc.nextInt();
			area=3.14*r*r;
			System.out.println("Area of circle -> "+area);
			break;
		}
		default:
		{
			System.out.println("Error!!");
			System.out.println("Please select the correct option!!");
		}
		}

	}

}
