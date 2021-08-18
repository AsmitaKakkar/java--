package code_with_harry;

interface camera{
	void takeSnap();
	void recordVedio();
	private void greet() {
		System.out.println("Good Morning !!");
	}
	default void record4kVideo() {
		greet();
		System.out.println("Recording 4k video......");
	}
}

interface wifi{
	String [] getNetwork();
	void connectToNetwork(String network);
}

class MyCellPhone{
	void callNumber(int phone_number)
	{
		System.out.println("Calling...."+phone_number);
	}
	void pickcall()
	{
		System.out.println("Connecting.....");
	}
}


class MySmartPhone extends MyCellPhone implements wifi,camera
{
	
	public void takeSnap(){
		System.out.println("Taking snap.....");
	}
	
	public void recordVedio()
	{
		System.out.println("Recording vedio....");
	}
	
	/*public void record4kVideo()
	{
		System.out.println("I am recording high resolution 4k video ......");
	}*/
	
	public String[] getNetwork()
	{
		System.out.println("Getting list of networks....");
		String networkList[]= {"Asmita","PyariManna","vishi123","Cute_mummy","Superpapa22"};
		return networkList;
	}
	
	public void connectToNetwork(String network)
	{
		System.out.println("Connecting to"+ network);
	}


}
public class Default_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySmartPhone ms=new MySmartPhone();
		ms.record4kVideo();
		// ms.greet(); -> It throws an error because it has private access !! 
		 String[] arr =ms.getNetwork();
		 for(String i:arr)
		 {
			 System.out.println(i);
		 }

	}

}
