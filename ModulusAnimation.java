public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		int repeats = 10;
		int steps_per_second = 5;

		for ( int i=0; i<repeats*11 ; i++ )
		{
			if ( i%23 == 0 )
				System.out.print(" RUN THERE ARE ZOMBIES! \r");
			else if ( i%23 == 1 )
				System.out.print(" RUN THERE ARE ZOMBIES \r");
			else if ( i%23 == 2 )
				System.out.print(" ! RUN THERE ARE ZOMBIE \r");
			else if ( i%23 == 3 )
				System.out.print(" S! RUN THERE ARE ZOMBI \r");
			else if ( i%23 == 4 )
				System.out.print(" ES! RUN THERE ARE ZOMB \r");
			else if ( i%23 == 5 )
				System.out.print(" IES! RUN THERE ARE ZOM \r");
			else if ( i%23 == 6 )
				System.out.print(" BIES! RUN THERE ARE ZO \r");
			else if ( i%23 == 7 )
				System.out.print(" MBIES! RUN THERE ARE Z \r");
			else if ( i%23 == 8 )
				System.out.print(" OMBIES! RUN THERE ARE  \r");
			else if ( i%23 == 9 )
				System.out.print(" ZOMBIES! RUN THERE ARE \r");
			else if ( i%23 == 10 )
				System.out.print("  ZOMBIES! RUN THERE AR \r");
			else if ( i%23 == 11 )
				System.out.print(" E ZOMBIES! RUN THERE A \r");
			else if ( i%23 == 12 )
				System.out.print(" RE ZOMBIES! RUN THERE  \r");
			else if ( i%23 == 13 )
				System.out.print(" ARE ZOMBIES! RUN THERE \r");
			else if ( i%23 == 14 )
				System.out.print("  ARE ZOMBIES! RUN THER \r");
			else if ( i%23 == 15 )
				System.out.print(" E ARE ZOMBIES! RUN THE \r");
			else if ( i%23 == 16 )
				System.out.print(" RE ARE ZOMBIES! RUN TH \r");
			else if ( i%23 == 17 )
				System.out.print(" ERE ARE ZOMBIES! RUN T \r");
			else if ( i%23 == 18 )
				System.out.print(" HERE ARE ZOMBIES! RUN  \r");
			else if ( i%23 == 19 )
				System.out.print(" THERE ARE ZOMBIES! RUN \r");
			else if ( i%23 == 20 )
				System.out.print("  THERE ARE ZOMBIES! RU \r");
			else if ( i%23 == 21 )
				System.out.print(" N THERE ARE ZOMBIES! R \r");
			else if ( i%23 == 22 )
				System.out.print(" UN THERE ARE ZOMBIES!  \r");
			else if ( i%23 == 23 )
				System.out.print(" RUN THERE ARE ZOMBIES! \r");
				
			Thread.sleep(1000/steps_per_second);
		}
		
	}
}
