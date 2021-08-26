package javaLab;

class Papa{
	private void dad()
	{
		System.out.println("I m papa!!");
	}
	void shree() {
		this.dad();
	}
}

class Mummy extends Papa{
	void mom()
	{
		System.out.println("I m mummy!!");
	}
}
public class modifier_private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mummy obj=new Mummy();
		obj.mom();
		//obj.dad();
		//it will display compile time error because we cannot access private data outside its own class(in another class)
		obj.shree();
		

	}

}
