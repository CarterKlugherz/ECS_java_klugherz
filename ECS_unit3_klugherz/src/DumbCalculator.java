import java.util.Scanner;

public class DumbCalculator 
{
	public static void main( String[] args )
	{
		double average;
		Scanner keyboard = new Scanner(System.in);
		
		int numberone, numbertwo, numberthree;
		
		System.out.println("Let's find the average of a few numbers... ");
		
		System.out.println("What is the first number?" );
		numberone = keyboard.nextInt();
		
		System.out.println("What is the second number?" );
		numbertwo = keyboard.nextInt();
		
		System.out.println("What is the third number?" );
		numberthree = keyboard.nextInt();
		
		average= ((numberone + numbertwo + numberthree)/3.0);
		System.out.println("The average of the three numbers is " +(average)+ "");
		
		keyboard.close();
	}
}

