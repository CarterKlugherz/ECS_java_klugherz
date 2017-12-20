import java.util.Scanner;

public class AreaCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int choice;
		
		System.out.println( "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
		
		do
		{
			System.out.println( "1) Triangle" );
			System.out.println( "2) Rectangle" );
			System.out.println( "3) Square" );
			System.out.println( "4) Circle" );
			System.out.println( "5) Quit" );
			System.out.print( "Which shape: " );
			choice = keyboard.nextInt();
			if ( choice == 1 )
			{
				System.out.print( "\nBase: " );
				int base = keyboard.nextInt();
				System.out.print( "Height: " );
				int height = keyboard.nextInt();
				System.out.println( "The area is " + area_triangle(base, height) + "." );
			}
				else if ( choice == 2 )
			{
				System.out.print( "\nLength: " );
				int length = keyboard.nextInt();
				System.out.print( "Width: " );
				int width = keyboard.nextInt();
				System.out.println( "The area is " + area_rectangle(length, width) + "." );
			}
				else if ( choice == 3 )
			{
				System.out.print( "\nSide: " );
				int side = keyboard.nextInt();
				System.out.println( "The area is " + area_square(side) + "." );
			}
			else if ( choice == 4 )
			{
				System.out.print( "\nRadius: " );
				int rad = keyboard.nextInt();
				System.out.println( "The area is " + area_circle(rad) + "." );
			}
			else if ( choice == 5 ){}
			
			else
			{
				System.out.println( "\nError." );
			}
			
			System.out.println( "\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
					
		} while ( choice != 5 );
		
		System.out.println( "GoodBye" );
	}
 
	public static double area_circle( int radius ) 
	{
		double area;
		area = Math.pow((Math.PI * radius), 2);
		return area;
		
	}
	
	public static int area_rectangle( int length, int width ) 
	{
		int area;
		area = length * width;
		return area;
	}
	
	public static int area_square( int side )
	{
		int area;
		area = side * side;
		return area;
	}
	
	public static double area_triangle( int base, int height ) 
	{
		double area;
		area = (base * height) / 2;
		return area;
	}
}