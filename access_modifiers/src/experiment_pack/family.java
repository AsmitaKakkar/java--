package experiment_pack;

import javaLab.Modifier_public;
import javaLab.Modifier_protected;

public class family extends Modifier_protected{
	//this is public modifier and can be accessed in any package
	//public class family{
	//if we do like this it will not work because protected modifier only works in a sub- class (child class)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//manna obj=new manna();
		//it displays compile time error because default class cannot be accessed outside  its package(another package).
		family obj=new family();
		obj.dad();
		//it displays the content of dad function because it is protected so it can display the function of one package to another(outside package)

		Modifier_public obj2=new Modifier_public();
	
		obj2.insideModifier_public();
		
	}

}
