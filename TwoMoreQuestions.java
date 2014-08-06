import java.util.Scanner; 

public class TwoMoreQuestions
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
				
		
		System.out.println( "TWO MORE QUESTIONS!" );
		System.out.println( "Think of something, and I'll try and guess it." );
		
		System.out.println( "Question 1) Does it stay inside outside or both" );
		String where = keyboard.next();
		
		System.out.println( "Question 2) Is it a living thing?" );
		String living = keyboard.next();
			
		if ( where.equals("inside") && living.equals("yes") )
			System.out.println( "I believe you are thinking of a houseplant." );
			
		if ( where.equals("inside") && living.equals("no") )
			System.out.println( "My prediction is none other then a shower curtain." );
		
		if ( where.equals("outside") && living.equals("yes") )
			System.out.println( "This particular thing is a bison." );
		
		if ( where.equals("outside") && living.equals("no") )
			System.out.println( "Your mind seeks a billboard." );
		
		if ( where.equals("both") && living.equals("yes") )
			System.out.println( "I see fur...I see a tail...possibly a dog?" );
		
		if ( where.equals("both") && living.equals("no") )
			System.out.println( "What else could it be but a cell phone." );	
	}
}			