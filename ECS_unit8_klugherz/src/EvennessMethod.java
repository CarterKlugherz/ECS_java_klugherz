import java.util.Scanner;

public class EvennessMethod 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
			
		for (int i=1; i<=100; i++){
		      
			if (isEven(i) && isDivisibleBy3(i)){
		        System.out.println(i+" <=");
		      }
		      else if (isDivisibleBy3(i)){
		        System.out.println(i+" =");
		      }
		      else if (isEven(i)){
		        System.out.println(i+" <");
		      }
		      else
		      {
		        System.out.println(i);
		      }
		      
		    }
		    
		  }
		  
		  public static boolean isEven(int n){
		    if (n%2==0)
		    return true;
		    else
		    return false;
		  }
		  
		  public static boolean isDivisibleBy3(int n){
		    if (n%3==0)
		    return true;
		    else
		    return false;
	}
}


