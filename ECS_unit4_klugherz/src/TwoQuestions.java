import java.util.Scanner;

public class TwoQuestions 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String kind, size, thing;
	
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, ad I'll try and guess what it is!");

		System.out.println("Question 1) Is it an animal, vegitable, or mineral?");
		kind=keyboard.next();
		
		System.out.println("Is it bigger than a breadbox? (y/n)");
		size=keyboard.next();
		
		if(kind.equals("animal") && size.equals("no"))
		{
			System.out.println("Is it a squirrel?");
		}
		else if(kind.equals("animal") && size.equals("yes"))
		{
			System.out.println("Is it a moose?");
		}
		else if(kind.equals("vegitable") && size.equals("no"))
		{
			System.out.println("Is it a carrot?");
		}
		else if(kind.equals("vegitable") && size.equals("yes"))
		{
			System.out.println("Is it a watermelon?");
		}
		else if(kind.equals("mineral") && size.equals("no"))
		{
			System.out.println("Is it a paper clip?");
		}
		else if(kind.equals("mineral") && size.equals("yes"))
		{
			System.out.println("Is it a Camaro?");
		}
	}
}

