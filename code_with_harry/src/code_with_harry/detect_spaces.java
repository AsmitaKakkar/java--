package code_with_harry;

import java.util.Scanner;

public class detect_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To detect double and triple sppaces in a string!!");
		System.out.println("Enter a string!!");
		Scanner sc =new Scanner (System.in);
		String str=sc.nextLine();
		System.out.println(str.lastIndexOf("  "));
		System.out.println(str.lastIndexOf("   "));
		

	}

}
