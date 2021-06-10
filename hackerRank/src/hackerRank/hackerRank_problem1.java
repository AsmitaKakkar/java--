package hackerRank;

import java.util.Scanner;

public class hackerRank_problem1 {

	public static void main(String[] args) {
		
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner sc=new Scanner(System.in);
		        
		        System.out.println("=============================");
		        for(int i=0;i<3;i++)
		        {
		        	String str=sc.next();
		        	int in=sc.nextInt();		        	
		        	System.out.printf("%-14s %03d",str,in);
		        
		    }
		        
		}

	}