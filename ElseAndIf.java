public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}
		
		
		if ( buses > cars )
		{
			System.out.println( "That's too many busses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else 
		{
			System.out.println( "We still can't decide." );
		}
		
		
		if ( people > buses )
		{
			System.out.println( "All right, let's just take the busses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}
		// I believe if the else statement is true it will override the if statement and print. 
		// If the else if statement it true it will override both the if and the else statement.
		// I removed the else statement from the (cars < people) line. It printed the first if 
		// statement because it was true. Skipped the second if statement since it was false.
		// The next else statement printed because the if statement above it was false. 
	}
}