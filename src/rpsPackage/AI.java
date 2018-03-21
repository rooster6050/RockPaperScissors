package rpsPackage;

import java.util.Random;

public class AI 
{
	Random rand = new Random();
	
	public String getHand()
	{
		int x = rand.nextInt(5);
		switch(x)
		{
		case 0: return "Spock";
		case 1: return "Scissors";
		case 2: return "Rock";
		case 3: return "Paper";
		case 4: return "Lizard";
		default: return "Paper";
		}
	}

}
