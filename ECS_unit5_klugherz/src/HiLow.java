import java.util.Scanner;
import java.util.Random;

public class HiLow 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(100), y = 1 + r.nextInt(100);
		
		
		System.out.println("I am thinking of a number between 1-100! Try to guess it.");
		y=keyboard.nextInt();
		
		if (x>y) 
    	{
			System.out.println("Sorry, you are too low, I was thinking of " + x);
    	}
		else if (y>x) 
		{
			System.out.println("Sorry, you are too high. I was thinking of" + x);
		}
		else if (x==y) 
		{
			System.out.println("You guessed it! What are the odds?!?"); 
		}			
		
		keyboard.close();
	}
}

