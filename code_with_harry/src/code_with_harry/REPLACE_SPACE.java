package code_with_harry;

import java.util.Scanner;

public class REPLACE_SPACE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string!!");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str.replace( " ", "_"));

	}

}
