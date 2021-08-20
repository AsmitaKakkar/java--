package code_with_harry;

class Monkey{
	void jump() {
		System.out.println("Monkey is jumping !!");
	}
	public void bite() {
		System.out.println("Monkey is biting !!");
	}
}

interface BasicAnimal{
	void eat();
	public void sleep();
}

class human extends Monkey implements BasicAnimal{
	
	public void eat()
	{
		System.out.println("Eating ......");
		
	}
	public void sleep()
	{
		System.out.println("Sleeping ......");
	}
	
	public void speak()
	{
		System.out.println("Speeking !! hey i am a human being !! ");
	}
	
}

public class Practice_set_prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		human asmita=new human();
		asmita.bite();
		asmita.eat();
		asmita.sleep();
		asmita.speak();
		
		Monkey alpha=new human();
		alpha.bite();
		// alpha.speak();  -> Cannot use speak method because the reference is of monkey which does not have speak method !!
		alpha.jump();

	}

}
