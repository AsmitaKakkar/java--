package code_with_harry;

import java.util.Scanner;

class rectangle
{
	public int area (int l ,int b)
	{
		int a=l*b;
		return a;
	}
	
	public int perimeter(int l,int b)
	{
		int p=2*(l+b);
		return p;
	}
}

public class Classes_prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle!!");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of rectangle !!");
		int breadth=sc.nextInt();
		
		rectangle rec=new rectangle();
		
		int area=rec.area(length, breadth);
		System.out.println("Area of rectangle => "+area);
		int perimeter=rec.perimeter(length, breadth);
		System.out.println("Perimeter of rectangle => "+perimeter);

	}

}
