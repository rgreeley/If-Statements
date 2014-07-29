public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 20;
		int dogs = 15;
		
		if ( people < cats )
		{
			System.out.println( "Too many cats! The world is doomed!" );
		}
		
		if ( people > cats )
		{
			System.out.println( "Not many cats! The world is saved!" );
		}
		
		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
			
		}
		
		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}
		
		dogs += 5;
		
		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}
		
		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}
		
		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
		// I believe that the if is setting up prerequisite for the line of code and if it meets that prerequisite it will print or move on
		// to the next line of code. 
		// I believe that the point of the curly braces on each line of code is to make sure that line runs before going to the next line of code.
	}
}