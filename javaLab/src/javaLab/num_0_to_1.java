package javaLab;

import java.util.Scanner;

public class num_0_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,num,i,decimal_Place=1,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		num=sc.nextInt();
		temp=num;
		
		if(num==0)
		{
			result+=(1*decimal_Place);
		}
		
		while(num>0)
		{
			if(num%10==0)
			
				result+=(1*decimal_Place);
				num/=10;
				decimal_Place*=10;
		}
		
			temp+=result;
			
			System.out.println("Resultant number is:"+temp);
					
	}

}
