package code_with_harry;

import java.util.Scanner;

public class cgpa{

public static void main(String[] args)
{
	System.out.println("Enter the marks obtained in physics:");
	Scanner sc =new Scanner (System.in);
	float phy=sc.nextFloat();
	System.out.println("Enter the marks obtained in chemistry:");
	float chim=sc.nextFloat();
	System.out.println("Enter the marks obtained in maths:");
	float math=sc.nextFloat();
	float total=phy+chim+math;
	float percent=(total/300)*100;
	float cgpa=(float) (percent/9.5);
	System.out.println("Your cgpa in cbse board is: "+cgpa);
}

}