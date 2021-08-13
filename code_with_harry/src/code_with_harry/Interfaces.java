package code_with_harry;


interface Bicycle{
	int a=22;
	void applyBrake(int decrement);
	void speedUp(int increment);
	
}

interface hornBicycle{
	
	void BlowHornk3g();
	void BlowHornmhn();
}

class AvonCycle implements Bicycle,hornBicycle
{
	
	
	void BlowHorn()
	{
		System.out.println("Pee pee poo poo pae pae paaaaa !");
		
	}
	
	public void applyBrake(int decrement)
	{
		System.out.println("Applying Brake !!");
	}
	
	public void speedUp(int increment)
	{
		System.out.println("Applying speed up!!");
	}

	public void BlowHornk3g()
	{
		System.out.println("Kabhi khushi kabhi gum pee pee pee pee !!");
	}
	
	public void BlowHornmhn()
	{
		System.out.println("Mein hun na poo poo poo poo !!");
	}
		
}


public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AvonCycle cycle=new AvonCycle();
		
		cycle.applyBrake(2);
		//you can create properties in interface !!
		System.out.println(cycle.a);
		//You cannot modify properties in interfaces as they are final !!
		//cycle.a=234;
		//System.out.println(cycle.a=234);
		
		cycle.BlowHornk3g();
		cycle.BlowHornmhn();
		
	}

}
