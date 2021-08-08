package code_with_harry;


class Rectangle
{
	private int length;
	private int breadth;
	
	 public Rectangle()
	 {
		 length=4;
		 this.breadth=5;
	 }
	 
	 public Rectangle(int len,int bred) 
	 {
		 length=len;
		 this.breadth=bred;
	 }
	 
	 public int getLength()
	 {
		 return length;
	 }
	 
	 public int getBreadth()
	 {
		 return breadth;
	 }
}

public class AccessModifiers_prob4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rectangle r=new Rectangle();
		Rectangle r=new Rectangle(6,9);
		
		System.out.print("Length of rectangle -> ");
		System.out.println(r.getLength());
		System.out.println("Breadth of rectangle -> "+r.getBreadth());
		

	}

}
