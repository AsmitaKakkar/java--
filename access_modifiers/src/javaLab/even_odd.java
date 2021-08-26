package javaLab;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word:");
		String str=sc.nextLine();
		str=str.toUpperCase();
		int vowel=0;int i;int consonent=0;
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vowel++;
			else
				consonent++;
		

		}
		System.out.println("Vowels : "+vowel);
		System.out.println("Consonent : "+consonent);
	
	}
}

