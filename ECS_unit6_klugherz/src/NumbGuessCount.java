import java.util.Scanner;

public class NumbGuessCount 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int guess = 3, count = 1;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		int entry = keyboard.nextInt();
		
		do
		{
			System.out.println("\nThat is incorrect. Guess again.");
			entry = keyboard.nextInt();
			count++;
		} while ( (entry != guess)&&(count < 3));
		System.out.println("\nThat's right! You're a good guesser.");
		System.out.println("\nIt only took you " + count + " tries.");
		
	} 
}
