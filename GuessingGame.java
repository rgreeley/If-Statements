import java.util.Scanner; 

public class GuessingGame
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
				
		String question1, question2, guess;
		
		System.out.println( "TWO QUESTIONS!" );
		System.out.println( "\nThink of an object, and I'll try and guess it." );
		
		System.out.println( "\nQuestion 1) Is it an animal, vegitable, or mineral?" );
		question1 = keyboard.next();
		
		System.out.println( "Question 2) Is it bigger than a breadbox?" );
		question2 = keyboard.next();
		
		if (question1.equals("animal") )
			{	
				if (question2.equals("yes") )
					guess = "moose";
				else if (question2.equals("no") )
					guess = "squirrel";
				else 
					guess = "huh???";
			}
				
		else if (question1.equals("vegetable") )
			{
				if (question2.equals("yes") )
					guess = "watermelon";
				else if (question2.equals("no") )
					guess = "carrot";
				else 
					guess = "what did you mean by that?";
			}
				
		else if (question1.equals("mineral") )
			{
				if (question2.equals("yes") )
					guess = "Camaro";
				else if (question2.equals("no") )
					guess = "paper clip";
				else 
					guess = "I'm not sure what you ment by that.";
			}
		else 
				guess = "Why won't you play by the rulse!";
				
		System.out.println( "My guess is that you are thinking of a " + guess + "!" );
		System.out.println( "I would ask you if I'm right, but I don't actually care." );	
	}
}