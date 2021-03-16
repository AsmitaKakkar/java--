package javaLab;

class A{
	void inA()
	{
		System.out.println("Hey!! i m A");
	}
	
}

class B extends A{
	void inB()
	{
		System.out.println("Hey!! i m B ");
	}
}

class C extends B{
	void inC()
	{
		System.out.println("Hey!! i m C");
	}
}

class D extends B{
	void inD()
	{
		System.out.println("Hey!! i m in D");
	}
}


public class hybrid_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------Hybrid Inheritance-----------\n");
		C obj=new C();
		D obj1=new D();
		B obj2=new B();
		obj.inA();
		obj.inB();
		obj.inC();
		obj1.inA();
		obj1.inB();
		obj1.inD();
		obj2.inA();
		obj2.inB();
	}

}
