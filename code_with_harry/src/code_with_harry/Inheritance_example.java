package code_with_harry;

class Animal
{
	public void pet()
	{
		System.out.println("This is a pet animal......");
	}
	public void aggressive()
	{
		System.out.println("This is an aggressive bread");
		
	}
	
	public void wild()
	{
		System.out.println("This is a wild animal!!");
		
	}
	
	public void cute()
	{
		System.out.println("This is a cute little animal!!");
	}
	
	
}


class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Dog is barking......");
	}
	
	public void play()
	{
		System.out.println("Dog is playing......");
	}
	
	public void sleep()
	{
		System.out.println("Dog is sleeping......");
	}
	
	public void eat()
	{
		System.out.println("Dog is eating......");
	}
}


public class Inheritance_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog ani=new Dog();
		System.out.println("We have many types of animals!!");
		System.out.println("I want a type of animal!!");
		ani.pet();
		System.out.println("I like to have....");
		ani.cute();
		System.out.println("The dangerous ones are ....");
		ani.aggressive();
		
		System.out.println("I have a pet dog at home !! \n His name is Noah Kakkar....");
		System.out.println("His hobbies are:--");
		ani.sleep();
		ani.play();
		ani.eat();
		ani.bark();
		
		
	}

}
