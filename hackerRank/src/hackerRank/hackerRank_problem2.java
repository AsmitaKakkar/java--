package hackerRank;

import java.util.Scanner;

public class hackerRank_problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner (System.in);
	        int t=sc.nextInt();
	        int n;
	        for(int i=0;i<t;i++)
	        {
	             n=sc.nextInt();
	        }
	        for(int i=0;i<t;i++)
	        {
	            System.out.println(n+" can be fitted in: ");
	            System.out.println(n.getClass().getSimpleName());
	        }

	}

}
