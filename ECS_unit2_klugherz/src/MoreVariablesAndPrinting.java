
public class MoreVariablesAndPrinting 
{
	public static void main( String[] args )
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		myName = "Carter S. Klugherz";
		myAge = 17;		// not a lie
		myHeight = 73;	// inches
		myWeight = 152;  // lbs
		myEyes = "Blue";
		myTeeth = "White";
		myHair = "blond";
		
		System.out.println( "Let's talk about " + myName + " .");
		System.out.println( "He's " + myHeight + " inches (or \"186.43cm\") tall.");
		System.out.println( "He's " + myWeight + " pounds (or  \"68.946kg\") heavy.");
		System.out.println( "Actually, that's not too heavy.");
		System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println( "His teeth are usually " + myTeeth + " because he brushes twice a day.");

		// This line is tricky; try to get it exactly right.
		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight
				+ " I get " + (myAge +  myHeight + myWeight) + ".");
	}
}

