package code_with_harry;

import java.util.Scanner;

public class encrypting_decrypting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the grade you obtained:");
		Scanner sc=new Scanner(System.in);
		char grade=sc.next().charAt(0);
		System.out.println("Encrypted Grade :----- "+grade);
		grade=(char) (grade+8);
		System.out.println("Decrypted Grade :---- "+grade);
		

	}

}
