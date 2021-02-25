package javaLab;

class calculator{
	void menu() {
		System.out.println("1. Addition\n 2. Substraction\n 3. Multiplication\n 4. Division\n");
	}
}

class Addition extends calculator{
	void add(int a, int b)
	{
		int result = a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+result);
	}
	
}

class Substraction extends calculator{
	void sub(int a, int b)
	{
		int result=a-b;
		System.out.println("Substraction of "+a+" and "+b+" is "+result);
	}
}

class Multiplication extends calculator{
	void mult(int a, int b)
	{
		int result=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+result);
	}
}


class Division extends calculator{
	void div(int a,int b)
	{
		int result=a/b;
		System.out.println("Division of "+a+" and "+b+" is "+result);
	}
}

public class hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
