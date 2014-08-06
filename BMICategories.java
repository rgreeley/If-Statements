import java.util.Scanner; 

public class BMICategories
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
				
		double pounds, inches, meters, kilos, feet, BMI;
		
		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): " );
		inches = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();
		
		meters = 0.0254 * (inches + (feet * 12));
		kilos = 0.453592 * pounds;
		BMI = ( kilos / (meters * meters) );
			
		System.out.println( "Your BMI is " + BMI );
		
		System.out.print( "BMI Category: " );
		if ( BMI < 15.0 )
		{
			System.out.println( "very severely underweight" );
		}
		else if ( BMI <= 16.0 )
		{
			System.out.println( "severely underweight" );
		}
		else if ( BMI < 18.5 )
		{
			System.out.println( "underweight" );
		}
		else if ( BMI < 25.0 )
		{
			System.out.println( "normal weight" );
		}
		else if ( BMI < 30.0 )
		{
			System.out.println( "overweight" );
		}
		else if ( BMI < 35.0 )
		{
			System.out.println( "moderately obese" );
		}
		else if ( BMI < 40.0 )
		{
			System.out.println( "severely obese" );
		}
		else 
		{
			System.out.println( "very severely (or \"morbidly\") obese" );
		}
	}
}