import java.util.Scanner; 

public class SpaceBoxing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
				
		int CurrentPlanet;
		double EarthWeight;
		
		
		
		System.out.print( "Please enter your current earth weight:" );
		EarthWeight = keyboard.nextDouble();
		
		System.out.println( "\nI have information for the following planets:" );
		System.out.println( "\t1. Venus	2. Mars \t3. Jupiter" );
		System.out.println( "\t4. Saturn \t5. Uranus \t6. Neptune" );
		
		System.out.print( "Which planet are you visiting?" );
		CurrentPlanet= keyboard.nextInt();
		
		if ( CurrentPlanet == (1) )
			System.out.println( "Your weight would be " + ( EarthWeight * 0.78 ) + " lbs on that planet." );
		else if ( CurrentPlanet == (2) )
			System.out.println( "Your weight would be " + ( EarthWeight * 0.39 ) + " lbs on that planet." );
		else if ( CurrentPlanet == (3) )
			System.out.println( "Your weight would be " + ( EarthWeight * 2.65 ) + " lbs on that planet." );
		else if ( CurrentPlanet == (4) )
			System.out.println( "Your weight would be " + ( EarthWeight * 1.17 ) + " lbs on that planet." );
		else if ( CurrentPlanet == (5) )
			System.out.println( "Your weight would be " + ( EarthWeight * 1.05 ) + " lbs on that planet." );
		else if ( CurrentPlanet == (6) )
			System.out.println( "Your weight would be " + ( EarthWeight * 1.23 ) + " lbs on that planet." );
		else 
			System.out.println( "Does not compute...." );
	}
}