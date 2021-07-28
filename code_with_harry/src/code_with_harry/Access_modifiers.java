package code_with_harry;

import java.util.Scanner;

class MyEmployee
{
	private int id;
	private String name;
	
	public void setName(String n)
	{
		name=n;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int Id)
	{
		id=Id;
	}
}


public class Access_modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the name of first employee!!");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
		System.out.println("Enter the id of first employee!!");
		int id=sc.nextInt();
		
		
		//These lines show an error due to private access modifiers!!
		//emp.id;
		//emp.name;
		
		MyEmployee emp =new MyEmployee();
		
		System.out.println("Name of first employee => ");
		emp.setName(name);
		System.out.println(emp.getName());
		
		System.out.println("Id of first employee => ");
		emp.setId(id);
		System.out.println(emp.getId());

	}

}
