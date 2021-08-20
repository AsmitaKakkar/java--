package code_with_harry;


class fountainPen extends Pen{
	void write()
	{
		System.out.println("Write");
	}
	void refill()
	{
		System.out.println("Refill");
	}
	void changeNib()
	{
		System.out.println("Changing the nib of the pen !!");
	}
}


public class Practice_set_quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fountainPen fp=new fountainPen();
		fp.write();
		fp.refill();
		fp.changeNib();

	}

}
