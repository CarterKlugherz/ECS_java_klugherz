import java.util.Scanner;

public class CollatzSequence 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Pick a starting number: ");
		
		int x = keyboard.nextInt();
		
		while (x != 1)
			if (x % 2 == 0)
			{
				x = even(x);
				System.out.println(x);
			}
			else
			{
				x = odd(x);
				System.out.println(x);
			}
		keyboard.close();
	}
	public static int even(int number)
	{
		number = number / 2;
		return number;
	}
	public static int odd(int number)
	{
		number = number*3 + 1;
		return number;
	}
}

