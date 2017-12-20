import java.util.Scanner;

public class Calculator 
{
	public static void main (String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
	
		    double n1, n2;
		    String operation;

		    System.out.println("Enter the first number");
	        n1 = keyboard.nextDouble();

	        System.out.println("Enter the second number");
	        n2 = keyboard.nextDouble();

	        Scanner op = new Scanner(System.in);
	        System.out.println("Enter your operation");
	        operation = op.next();

	        switch (operation)  
	        {
	        case "+":
	            System.out.println("Your answer is " + (n1 + n2));
	            break;
	        case "-":
	            System.out.println("Your answer is " + (n1 - n2));
	            break;
	        case "/":
	            System.out.println("Your answer is " + (n1 / n2));
	            break;
	        case "*":
	            System.out.println("Your asnwer is " + (n1 * n2));
	            break;
	        }
	        
	}
}
