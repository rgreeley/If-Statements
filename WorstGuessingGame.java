import java.util.Scanner;

public class WorstGuessingGame
{

		public static void main( String[] args )
		{
		
			Scanner keyboard = new Scanner(System.in);
			
				int number = 3;

					System.out.println( "This shall be the worst guessing game ever...." );
					System.out.println();
					
					System.out.print( "I am thinking of a number between 1-10. Try and guess and you shall earn a chocolate. " );
					int guess = keyboard.nextInt();


					if ( guess != number )
						System.out.println( "Looks like you get no chocolate. The number was " + number );
					
					else
						System.out.println( "Well crap I wasn't expecting this. It was " + number + ". I owe you one chocolate." );
		}
}


