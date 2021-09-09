//Write a program to check if a given program is a vowel or consonant without using if and switch statement in your program !!

package code_with_harry;

import java.util.Scanner;

public class isVowelOrConsonent {
	
	static String isVowel(String ch)
	{
		String str ="aeiouAEIOU";
		return (str.indexOf(ch)!=-1)?"Vowel":"Consonent";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any character you want to check !!");
		Scanner sc=new Scanner(System.in);
		String ch=sc.next();
		System.out.printf("%s is a "+isVowel(ch),ch);
		

	}

}
