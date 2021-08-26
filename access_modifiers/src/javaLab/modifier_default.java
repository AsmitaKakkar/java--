package javaLab;

class shree{
	void didi()
	{
		System.out.println("I m shree did!!");
	}
}

class manna extends shree{
	void behen()
	{
		System.out.println("I m manna behen!!");
	}
}

class vishu extends manna{
	void bhai()
	{
		System.out.println("I m vishu bhai!!");
	}
}

public class modifier_default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vishu obj=new vishu();
		obj.behen();
		obj.bhai();
		obj.didi();

	}

}
