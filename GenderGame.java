import java.util.Scanner;

public class GenderGame
{
		public static void main( String[] args )
		{
			Scanner keyboard = new Scanner(System.in);

			System.out.print( "What is you gender (Male or Female): " );
			String gender = keyboard.next();

			System.out.print( "First Name: " );
			String firstName = keyboard.next();

			System.out.print( "Last Name: " );
			String lastName = keyboard.next();

			System.out.print( "Age: " );
			int age = keyboard.nextInt();

			System.out.println();

				if( gender.equals("Female") && age >= 20 )
				{
					System.out.print( "Are you married, " + firstName + " (yes or no)? " );
					String married = keyboard.next();

				if( married.equals("yes") )
					System.out.println( "Then I shall call you Mrs. " + lastName );
					
				else
					System.out.println( "Then I shall call you Ms. " + lastName );
				}
				if ( gender.equals("Female") && age < 20 )
					System.out.println( "Then I shall call you " + firstName + " " + lastName );

				if( gender.equals("Male") && age >= 20 )
					System.out.println( "Then I shall call you Mr. " + lastName );

				if( gender.equals("Male") && age < 20 )
					System.out.println( "Then I shall call you " + firstName + " " + lastName );
		}
}





