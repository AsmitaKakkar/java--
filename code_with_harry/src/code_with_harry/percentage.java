package code_with_harry;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the total marks of all the subjects:");
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		System.out.println("Enter the marks obtained in English:");
		float eng=sc.nextFloat();
		System.out.println("Enter the marks obtained in Hindi:");
		float hin=sc.nextFloat();
		System.out.println("Enter the marks obtained in maths:");
		float math=sc.nextFloat();
		System.out.println("Enter the marks obtained in Science:");
		float sci=sc.nextFloat();
		System.out.println("Enter the marks obtained in computers:");
		float comp=sc.nextFloat();
		
		System.out.println("Toatal marks obtained:-");
		float obtained=hin+eng+math+sci+comp;
		System.out.println(obtained);
		
		float percent=(obtained/total)*100;
		System.out.println("Percentage gained by the student in cbse board exam is:-"+percent+"%");
		
	
	}

}
