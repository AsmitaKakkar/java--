package javaLab;
	
class dogs {
	void cuties() {
		System.out.println("Dogs are very cute!!\n they are the most loyal and trustworthy creatures!!\n");
		
	}
}

class noah extends dogs{
	void mine()
	{
		System.out.println("Noah!! is my baby doggy he is the best thing i have ever got in my life\n i love him a lot!!\n");
	}
}


public class single_level_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		noah n=new noah();
		n.cuties();
		n.mine();
	}

}