package code_with_harry;

import java.util.Scanner;

class javaLibrary
{
	String arriss[]=new String[100];
	String arradd[]=new String [100];
	
	public void addBook(String book)
	{
		for(int i=0;i<100;i++)
		{
			arradd[i]=book;
		}
		System.out.println("The book "+book+" added to the library is successfully !!");
		 
	}
	
	public void returnBook(String book)
	{
		System.out.println("The book "+book+" returned to the library successfully !!");
	}
	
	public void issueBook(String book)
	{
		for(int i=0;i<100;i++)
		{
			arriss[i]=book;
		}
		System.out.println("The book "+book+" successfully issued from the library !!");
	}
	
}

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaLibrary jl=new javaLibrary();
		
		System.out.println("What you want to do in a library??");
		
		System.out.println("\n\n1. Add a book in a library !!");
		System.out.println("2. Return a book to the library !!");
		System.out.println("3. Issue a book from the library !!");
		System.out.println("4. Exit from the library !!");
		
		Scanner sc=new Scanner(System.in);
		int choice;
		//do
		{
			System.out.println("Enter your choice (1-4)!!");
			
			choice=sc.nextInt();
			if(choice==1)
			{
				String name;
				System.out.println("Enter the name of a book !!");
				name=sc.next();
				
				jl.addBook(name);
			}
			else if(choice==2)
			{
				String name;
				System.out.println("Enter the name of a book !!");
				name=sc.next();
				
				jl.returnBook(name);
			}
				
			else if(choice==3)
			{
				String name;
				System.out.println("Enter the name of a book !!");
				name=sc.next();
				
				jl.issueBook(name);
			}
			else
			{
				System.out.println("Wrong choice !!\n Please select(1-4)!!");
			}
		}
		//while(choice!=4);
		
		
		}

}
