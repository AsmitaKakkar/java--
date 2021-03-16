package javaLab;

class company{
	void head()
	{
		System.out.println("Hey!! i am the director head of this company!!");
	}
}

class persons extends company{
	void employes()
	{
		System.out.println("Hey!! we are the employes here!!");
	}

}


class ceo extends persons{
	void seniour()
	{
		System.out.println("Hey!! i am a ceo of this company!!");
		
	}
}

class interns extends ceo{
	void juniours()
	{
		System.out.println("Hey!! we are the interns in this company!!");
	}
}


class blablabla extends interns{
	int num=10;
	void customers()
	
	{
		
		System.out.println("Hey!! we came here for shooping your product!!");
	}
}

public class multi_level_inheritance{
	public static void main(String[] args) {
		blablabla obj=new blablabla();
		obj.head();
		obj.seniour();
		obj.employes();
		obj.juniours();
		obj.customers();
		System.out.println("We are in total "+obj.num);
		
	}
	
}
