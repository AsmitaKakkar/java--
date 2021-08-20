package code_with_harry;

import java.util.Scanner;

class ThisLibrary{
	
	String[] books;
	int no_of_books;
	
	ThisLibrary()
	{
		this.books=new String[100];
		this.no_of_books=0;
	}
	
	void addBook(String book)
	{
		this.books[no_of_books]=book;
		no_of_books++;
		System.out.println(book+" added to the library successfully !!");
		
	}
	
	void showAvailableBooks()
	{
		System.out.println("Books available in the Library are :-");
		for(String books:this.books)
		{
			if(books==null)
			{
				continue;
			}
			System.out.println("* "+books);
		}
	}
	
	void issueBook(String book)
	{
		for(int i=0;i<this.books.length;i++)
		{
			if(this.books[i]==book)
			{
				System.out.println("This book has been issued !!");
				this.books[i]=null;
				return;
			}
			
		}
		
		System.out.println("The book does not exists !!");
	}
	
	void returnBook(String book)
	{
		addBook(book);
	}
}

public class Online_Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisLibrary tl=new ThisLibrary();
		tl.addBook("Harry Potter");
		tl.addBook("Rich dad Poor dad");
		tl.addBook("C++ Programming");
		tl.addBook("Java Programming");
		tl.showAvailableBooks();
		tl.issueBook("Harry Potter");
		tl.showAvailableBooks();
		tl.returnBook("Harry Potter");
		tl.showAvailableBooks();

	}

}
