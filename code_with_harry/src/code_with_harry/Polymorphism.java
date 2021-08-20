package code_with_harry;

import java.util.Scanner;

interface camera2{
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

interface wifi2{
	String [] getNetwork();
	void connectToNetwork(String network);
}

class MyCellPhone2{
	void callNumber(int phone_number)
	{
		System.out.println("Calling...."+phone_number);
	}
	void pickcall()
	{
		System.out.println("Connecting.....");
	}
}


class MySmartPhone2 extends MyCellPhone2 implements wifi2,camera2
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
	
	public void sampleMethod()
	{
		System.out.println(" Hey !! I am a method !!");
	}


}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		camera2 cam2=new MySmartPhone2();   // This is a smartPhone ,use it as a camera !!
		// cam.getNetwork();   -> Not allowed because smartphone is restricted to camera only at this time !!
		cam2.recordVedio();
		cam2.record4kVideo();
		// cam2.sampleMethod();    -> Not allowed , we also cannot use the methods of subclass in this case !!
		
		Scanner sc=new Scanner(System.in);
		
		MySmartPhone2 s=new MySmartPhone2();
		s.getNetwork();
		s.record4kVideo();
		s.recordVedio();
		s.sampleMethod();
		s.callNumber(1122);
		s.connectToNetwork(" PyariManna");
		s.takeSnap();
	}

}
