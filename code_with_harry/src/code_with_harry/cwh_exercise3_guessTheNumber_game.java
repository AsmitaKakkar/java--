package code_with_harry;

import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

class Game
{
	int num;
	//int guessNum;
	int n;
	
	public Game()
	{
	   Random rand=new Random();
		 this.num=(int) (rand.nextInt(100));
		//int num=(int) (Math.random()*100);
	}
	
	public int GuessNum()
	{
		return guessNum;
	}
	
	public int getRandNum()
	{
		return num;
	}
	
	public int takeUserInput()
	{
		System.out.println("Guess the random number between (0-100) the computer can generate !!");
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		return n;
	}
	
	public boolean isCorrectNumber(int n)
	{
		
		boolean flag=false;
		
		
			if(n==getRandNum())
			{
				System.out.println("HURRAY!! You Win !!");
				System.out.println("You guessed the correct number.....");
				System.out.println("The number genereted by the computer is "+n);
				flag=true;
				return flag;
				
			}
			else if(n<getRandNum())
			{
				System.out.println("OHHHOOOOO !! You missed this time !!");
				System.out.println("Guess a little larger number !!");
				return flag;
			}
			else
			{
				System.out.println("UFFFFFF!! the number is tooo large !!");
				System.out.println("Guess the litlle smaller number!!");
				return flag;
			}
		
		
	}
}

public class cwh_exercise3_guessTheNumber_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("WELCOME TO GUESS THE NUMBER GAME");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("***********RULES*************");
		System.out.println();
		System.out.println("You have to guess the number between 0-100 ");
		System.out.println("The number that you think our system can generate randomly!!");
		System.out.println("Total number of guesses taken  considered  to define your points !!");
		System.out.println("The more number of guesses you take the less points you got !!");
		System.out.println("Points will be out of 100 !!");
		System.out.println();
		System.out.println();
		System.out.println("So, all the best guys !! \n Let's start with the game!!");
		System.out.println();
		System.out.println();
		
		boolean flag=false;
		Game gm=new Game();
		int count=0;
		do
		{
			int n=gm.takeUserInput();
			
			flag=gm.isCorrectNumber(n);
			count++;
			
		}
		
		while(flag!=true);
		
		int points=100-count;
		System.out.println("CONGRATULATIONS !!\n Your points are :- "+points +" out of 100 !!");
	}
	
	

}
