package access_modifier;
import code_with_harry.Access_modifiers_in_Java;

class helper extends Access_modifiers_in_Java{
	
	void meth2()
	{
		//System.out.println("a->"+a);
		//System.out.println("b->"+b);
		//System.out.println("c->"+c);  ->we cannot access default modifier outside of a package !!
		//System.out.println("d->"+d);  ->same with the private modifier even not in a subclass !!
	}
}

public class Access_modifier_helper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Access_modifiers_in_Java am=new Access_modifiers_in_Java();
		
				System.out.println("a->"+am.a);
				//System.out.println("b->"+am.b); -->not accessible 
				//System.out.println("c->"+am.c); -->not accessible
				//System.out.println("d->"+am.d); --> not accessible
			
		helper help=new helper();
		help.meth2();
				
		

	}

}
