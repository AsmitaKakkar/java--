package code_with_harry;

import java.util.Scanner;

class ThisEmployee
{
	private int id;
	private String name;
	
	public ThisEmployee()
	{
		id=22;
		name="Ananya Kakkar";
	}
	
	/*public void setName(String n)
	{
		name=n;
		
	}*/
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	/*public void setId(int Id)
	{
		id=Id;
	}*/
	
	public ThisEmployee(String MyName,int MyId)
	{
		id=MyId;
		name=MyName;
	}
	
	public ThisEmployee(String MyName)
	{
		name=MyName;
		id=22;
	}
}

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ThisEmployee te=new ThisEmployee();
		
		//ThisEmployee te=new ThisEmployee("Asmita",1122);
		
		ThisEmployee te=new ThisEmployee("asmita");
		
		System.out.println(te.getName());
		System.out.println(te.getId());

	}

}
