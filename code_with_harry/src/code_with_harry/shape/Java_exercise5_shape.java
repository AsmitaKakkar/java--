package code_with_harry.shape;

import java.util.Scanner;

class rectangle{
	Scanner sc=new Scanner(System.in);
	
	int l;
	int b;
	void surfaceArea(){
		System.out.println("Enter the length of the rectangle ");
		l=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle ");
		b=sc.nextInt();
		
		System.out.println("Area -> "+l*b);
		}
	int getter_l()
	{
		return l;
	}
	
	int getter_b()
	{
		return b;
	}
	
	
	void setter_l(int length)
	{
		length=l;
	}
	
	void setter_b(int breadth)
	{
		breadth=b;
	}
}

class square extends rectangle{
	int a;
	
	int getter()
	{
		
		return a;
	}
	
	void setter(int side)
	{
		side=a;
	}
	
	void surfaceArea()
	{
		System.out.println("Enter the side of the square ");
		a=sc.nextInt();
		
		System.out.println("Area -> "+a*a);
	}
	
}

class circle{
	int r;
	Scanner sc=new Scanner(System.in);
	int getter()
	{
		return r;
	}
	
	void setter(int radius)
	{
		radius=r;
	}
	
	void surfaceArea()
	{
		System.out.println("Enter the radius of the circle ");
		r=sc.nextInt();
		System.out.println("Area -> "+2*3.14*r*r);
	}
	
	
}

class cylinder extends circle{
	int height;
	
	void setter(int h)
	{
		h=height;
	}
	
	int getter()
	{
		return height;
	}
	
	void SurfaceArea()
	{
		System.out.println("Enter the height of the cylinder ");
		height=sc.nextInt();
		System.out.println("Area -> "+(2*3.14*r*height)+(3.14*r*r));
	}
	
	void volume()
	{
		System.out.println("Volume -> "+3.14*r*r);
	}
	
}

class sphere extends circle{
	void surfaceArea()
	{
		System.out.println("Area -> "+4*3.14*r*r);
	}
	
	void volume()
	{
		System.out.println("Volume -> "+4/3 *3.14*r*r*r);
	}
	
}



public class Java_exercise5_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle rec=new rectangle();
		square sq=new square();
		circle c=new circle();
		sphere sph=new sphere();
		cylinder cy=new cylinder();
		
		sq.surfaceArea();
		rec.surfaceArea();
		sph.surfaceArea();
		cy.volume();
		
		
		

	}

}
