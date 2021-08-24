package code_with_harry;

import java.util.Scanner;

class write{
	
	void meth1()
	{
		System.out.println("So,What's your name ??");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		System.out.println("My name is -> "+str);
	}
	
}

public class problem2 {
	
	public static void main(String args[]) {
		write w=new write();
		w.meth1();
		
	}

}
