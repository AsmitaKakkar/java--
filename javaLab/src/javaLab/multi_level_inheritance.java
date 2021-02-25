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

class interns extends ceo{
	void juniours()
	{
		System.out.println("Hey!! we are the interns here!!");
	}
}



}


public class multi_level_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ceo i=new ceo();
		
		
		i.head();
		i.seniour();
		i.employes();

	}

}
