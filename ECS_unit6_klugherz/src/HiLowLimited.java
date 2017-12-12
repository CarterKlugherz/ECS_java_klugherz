import java.util.Scanner;
import java.util.Random;

public class HiLowLimited 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(100), y;
		int tries = 0;
		
		
		System.out.println("I am thinking of a number between 1-100! Try to guess it.");
		y=keyboard.nextInt();
		
		while (tries<7)
			{
			
			
		if (x>y) 
    	{
			System.out.println("Sorry, you are too low." );
			System.out.print("Guess #" + (tries+=1) + ":");
			y=keyboard.nextInt();
    	}
		else if (y>x&&tries<7) 
		{
			System.out.println("Sorry, you are too high.");
			System.out.print("Guess #" + (tries+=1) + ":");
			y=keyboard.nextInt();
		}
		else if (x==y) 
		{
			System.out.println("You guessed it! What are the odds?!?"); 
		}				
	   
		if ( tries == 7 )
			System.out.println("\nSorry, you didn't guess it in 7 tries. You lose.");	
		}
	}
}