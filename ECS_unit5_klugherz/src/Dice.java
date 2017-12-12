import java.util.Scanner;
import java.util.Random;

public class Dice 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int firstDie  = (int)(6 * Math.random()) + 1; 
        int secondDie = (int)(6 * Math.random()) + 1;  
        int totalRoll = firstDie + secondDie;          
        
		System.out.println("HERE COMES THE DICE!");
		
		System.out.println("Roll #1:" + firstDie + "");
		System.out.println("Roll #1:" + secondDie + "");
		System.out.println("The total is" + totalRoll +"");
		
		keyboard.close();
	}
}
