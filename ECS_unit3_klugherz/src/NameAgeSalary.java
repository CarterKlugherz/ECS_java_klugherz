import java.util.Scanner;

public class NameAgeSalary 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		double salary;
		
		System.out.println("Hello. What is your name?" );
		name = keyboard.next();
		
		System.out.println("Hi, Carter! How old are you?" );
		age = keyboard.nextInt();
		
		System.out.println("So you are 17? I guess that's not too old, Carter. How much do you make per hour?" );
		salary = keyboard.nextInt();

		System.out.println("Wow, 1500 is alot for your age!" );
		
		keyboard.close();
	}
}
