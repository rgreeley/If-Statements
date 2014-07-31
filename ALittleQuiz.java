import java.util.Scanner; 

public class ALittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
				
		int correct = 0, answer;
		
		System.out.print( "Are you ready for a quiz? " );
		keyboard.next();
		System.out.println( "\nOkay, here it comes!" );
		
		System.out.println( "Q1) What is the capital of Alaska?" );
		System.out.println( "\t 1) Melbourne" );
		System.out.println( "\t 2) Anchorage" );
		System.out.println( "\t 3) Juneau" );
		answer = keyboard.nextInt();
		
		if ( answer == 3 )
		{
			System.out.println( "\nThat's right!" );
			correct += 1;
		}	
		else
		{
			System.out.println( "\nThat's wrong! " );
		}
		
		System.out.println( "\nQ2) Can you store the value \"cat\" in a variable of type int?" );
		System.out.println( "\t 1) yes" );
		System.out.println( "\t 2) no" );
		answer = keyboard.nextInt();
		
		if ( answer == 2 )
		{
			System.out.println( "\nFantastic!" );
			correct += 1;
		}
		else
		{
			System.out.println( "\nSorry, \"cat\" is a string. ints can only store numbers." );	
		}
		
		
		System.out.println( "Q1) What is the result of 9+3/6?" );
		System.out.println( "\t 1) 5" );
		System.out.println( "\t 2) 11" );
		System.out.println( "\t 3) 15/3" );
		answer = keyboard.nextInt();
		
		if ( answer == 2 )
		{
			System.out.println( "\nAwesome! " );
			correct += 1;
		}	
		else
		{
			System.out.println( "\nNope! " );
		}	
		
		System.out.println();
		
		System.out.println( "Overall, you got " + correct + " out of 3 correct." );
		System.out.println( "\nThanks for playing!" );
			
	}
}