import java.util.Scanner;

public class DumbCalculator 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String numberone, numbertwo, numberthree, Average;
		
		System.out.println("Let's find the average of a few numbers... ");
		
		System.out.println("What is the first number?" );
		numberone = keyboard.next();
		
		System.out.println("What is the second number?" );
		numbertwo = keyboard.next();
		
		System.out.println("What is the third number?" );
		numberthree = keyboard.next();

		System.out.println("The average of the three numbers is" +((numberone + numbertwo + numberthree))+ "");
		Average = keyboard.next();
		
		keyboard.close();
	}
}
