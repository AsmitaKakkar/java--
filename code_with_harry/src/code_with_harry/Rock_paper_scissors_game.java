package code_with_harry;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0,cwin=0,pwin=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name!!");
		String name=sc.nextLine();
		do
		{
			
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("\t\t Welcome to the Rock  |||  Papper  |||  Scissors  game "+name +" !!!!!!!");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Select your choice!!");
		System.out.println(" 1.Rock\n 2.Papper\n 3. Scissors");
		System.out.println("----------------------------------------------------------------------------------------");
		int player=sc.nextInt();
		Random ran=new Random();
		int comp=ran.nextInt(4);
		System.out.println("Computer choice is:"+comp);
		if((player==1 && comp==1) || (player==2 && comp==2 )|| (player==3 && comp==3))
		{
			System.out.println("Tie!!");
		}
		else if(player==1 && comp==2 || (player==2 && comp==3) || (player==3 && comp==1))
		{
			System.out.println("Computer Wins!!");
			 cwin++;
			
		}
		else if(player==1 && comp==3 || (player==2 && comp==1) || (player==3 && comp==2) )
		{
			System.out.println(name+" Wins!!");
			pwin++;
		}
		else
		{
			System.out.println("ERROR!!\n Please select the valid choice(1-3)!!");
		}
		flag++;
	}
		
		while(flag<=5);
		if(cwin>pwin)
		{
		
			System.out.println("OOPS!!\n Computer wins the game finally!!\n better luck next timwe!!");
			
		}
		else if(pwin>cwin)
		{
			System.out.println("CONGRATULATIONS !!\n "+name +" wins the game finally!!");
		}
		else
		{
			System.out.println("SURPRISE!! \n there is a tie finally!!!");
		}
}

}
