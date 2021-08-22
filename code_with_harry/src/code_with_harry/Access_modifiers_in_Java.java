package code_with_harry;

class c1{
	
	public int a=30;
	protected int b=40;
	int c=50;
	private int d=60;
	
	void meth1()
	{
		System.out.println("a->"+a);
		System.out.println("b->"+b);
		System.out.println("c->"+c);
		System.out.println("d->"+d);
	}
}

public class Access_modifiers_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c1 c=new c1();
		System.out.println(a);

	}

}
