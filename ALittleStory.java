import java.util.Scanner; 

public class ALittleStory
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
				
		String OP1, OP2, OP3;
		
		System.out.println("I would like for you to play a little game....\n" );
		System.out.println("Please type the word in quotes to make your choice.\n" );
		
		
		System.out.print( "You are driving down the street. You see a bus on fire. Do you \"stop\" at the buss or keep \"driving\"?" );
		OP1 = keyboard.nextLine();
		
		
		if (OP1.equals("stop") )
		{
				System.out.print( "You look into the bus and see that it is full of babies! Would you like to \"save\" them or \"walk\" away?" );
				OP2 = keyboard.next();
				
				if ( OP2.equals("save") )
				{
					System.out.print( "You get all the babies out!!! Do you want to \"leave\" them outside the bus or \"take\" them to the daycare?" );
					OP3 = keyboard.next();
					
					if (OP3.equals("leave") )
						System.out.println( "The babies are found by a local circus and grow up to be greatest preforming act the world has ever seen!" );
					
					else if (OP3.equals("take") )
						System.out.println( "The babies are claimed by their rightful parents and live ordinary boring lives." );
					
					else
						System.out.println("Bad Answer!!! No go sir!!!" );
				}
				
				else if ( OP2.equals("walk") )
				{
					System.out.print( "You walk away from the bus, babies still inside. The bus explodes!!! You notice the babies are all flung into the air. Do you \"catch\" the babies or let them \"fall\"?" );
					OP3 = keyboard.next();
					
						if (OP3.equals("catch") )
							System.out.println("You catch the babies and save them from a possible short lived life. YOU ARE A HERO!!!" );
						
						else if (OP3.equals("fall") )
							System.out.println("You watch as the babies fall closer and closer to the ground. Right before the babies strike the ground, a giant bear catches all the babies and runs deep into the forest. The fait of the babies is unknown....");
						
						else
							System.out.println("Bad Answer!!! No go sir!!!" );
				}
				else 
					System.out.println("Bad Answer!!! No go sir!!!" );
		}
		else if ( OP1.equals("driving") )
		{
				System.out.print( "You pass the burning bus and continue down the road. You approach a fork in the road. As you approach this fork you hear a faint explosion. Would you like to turn \"right\" into the forest or \"left\" toward the city?" );
				OP2 = keyboard.next();
				
					if (OP2.equals("right") )
					{
						System.out.print("You start to head deep into the woods. A tree has fallen in the middle of the road. Would you like to get out and \"move\" it or \"turn\" around and head home?" );
						OP3 = keyboard.next();
						
						if (OP3.equals("move") )
							System.out.print("You try with all of your strength to move the fallen tree. You are unable to budge it. You turn around to get back in your car and go home. As you do so you are tackled by a bear carrying infant children. You are taken into the forest and never seen again." );
						
						else if (OP3.equals("turn") )
							System.out.print("You around to go home. As you start to leave the fallen tree behind. A bear carrying children leaps on your car and crushes the engine. You try and walk out of the forest, but are never seen or heard from again." );
						
						else
							System.out.println("Bad Answer!!! No go sir!!!" );
					}
					else if (OP2.equals("left") )
					{
						System.out.print("You make your way towards the city. As you enter the city you notice there is a lack of people around. There seems to be a giant grouping of cars that arn't moving up ahead. Would you like to \"investigate\" or \"leave\"?" );
						OP3 = keyboard.next();
						
						if (OP3.equals("investigate") )
							System.out.print("You get out of your car and walk around the stopped cars. There is no one in site. You start to hear shuffling behind you. As you turn around you are quickly overtaken by a horde of the undead. Your cries for help are never heard...." );
						
						else if ( OP3.equals("leave") )
							System.out.print(" You start to pull your car around. As you do you hit what you think is a person. You get out of your car to find that the thing you struck is not a person but an undead zombie!!! You try and get back to your car to get out of this nightmare. You don't make it. Your cries for help are never heard...." );
						
						else
							System.out.println("Bad Answer!!! No go sir!!!" );
					}
				}
				else 
					System.out.println("Bad Answer!!! No go sir!!!" );
			}	
}		