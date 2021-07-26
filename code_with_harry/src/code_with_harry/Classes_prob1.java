package code_with_harry;

import java.util.Scanner;

class Employe{
	String name;
	int salary;
	
	public int getSalary()
	{
		return salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String setName()
	{
		System.out.println("Enter the nickname of first employee!!");
		Scanner sc=new Scanner(System.in);
		String nn=sc.next();
		return nn;
		
	}
}

public class Classes_prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is our Custom class!!");
		Employe obj=new Employe();
		obj.name="Asmita Kakkar";
		obj.salary=56;
		
		System.out.println("Name of first employee is => "+obj.name);
		System.out.println("Salary of first employee is => "+obj.salary);
		
		System.out.println("Now !! Using methods ......");
		
		int salary=obj.getSalary();
		System.out.println("Salary => "+salary);
		
		String name=obj.getName();
		System.out.println("Name => "+name);
			
		String chngName=obj.setName();
		System.out.println("Nickname =>"+chngName);
		
	}

}
