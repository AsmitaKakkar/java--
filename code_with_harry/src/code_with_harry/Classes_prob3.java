package code_with_harry;

import java.util.Scanner;

class Square{
	
	public int side()
	{
		System.out.println("Enter the length of the side of a square!!");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		return a;
	}
}

public class Classes_prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square alpha=new Square();
		
		
		int a=alpha.side();
		int area=a*a;
		System.out.print("Area of Square>>>>>>>>>>>>>>");
		System.out.println(area);
		
		
		int perimeter=4*a;
		System.out.println("Perimeter of Square>>>>>>>>>>>>>>>>>"+perimeter);

	}

}
