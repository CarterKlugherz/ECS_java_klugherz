import java.util.Scanner;

public class UserInputOfData 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name, lastname, login;
		int grade, StudentID;
		double GPA;
		
		System.out.println("Please enter the following information so I can sell it for a profit! ");
		
		System.out.println("First name:" );
		name = keyboard.next();
		
		System.out.println("Last name:" );
		lastname = keyboard.next();
		
		System.out.println("Grade (9-12):" );
		grade = keyboard.nextInt();

		System.out.println("Student ID:" );
		StudentID = keyboard.nextInt();
		
		System.out.println("Login:" );
		login = keyboard.next();
		
		System.out.println("GPA (0.0-4.0):" );
		GPA = keyboard.nextDouble();
		
		System.out.println("Your information:" );
		System.out.println("	Login: klugherzc3159" );
		System.out.println("	ID: 813159" );
		System.out.println("	Name: klugherz, carter" );
		System.out.println("	GPA: 3.63" );
		System.out.println("	Grade: 12" );
		
		keyboard.close();
	}
}

