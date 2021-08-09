package code_with_harry;

class baseclass
{
	baseclass()
	{
		System.out.println("I am a constructor of base class!!");
	}
}

class derivedone extends baseclass
{
	derivedone()
	{
		System.out.println("I am a constructor of derived 1 class !!");
	}
	
}

class derivedtwo extends derivedone
{
	derivedtwo()
	{
		System.out.println("I am a constructor of derived 2 class !!");
	}
	
}


public class Practiceset_prob3_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//derivedone dev1=new derivedone();
		derivedtwo dev2=new derivedtwo();
		
	}

}
