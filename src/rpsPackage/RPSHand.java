package rpsPackage;

public class RPSHand 
{
	
	public String handResult(String handA, String handB)
	{
		int a = handToString(handA);
		int b = handToString(handB);
		if(a==b)
		{
			RPSGame.draw();
			return "Draw!";
		}
		if(a==0)
		{
			if(b==3||b==4)
			{
				RPSGame.playerWin();
				return "The player wins!";
			}
			RPSGame.aiWin(); 
			return "The AI wins!";
		}
		
		if(a==1)
		{
			if(b==0||b==2)
			{
				RPSGame.playerWin();
				return "The player wins!";
			}
			RPSGame.aiWin(); 
			return "The AI wins!";
		}
		if(a==2)
		{
			if(b==0||b==3)
			{
				RPSGame.playerWin();
				return "The player wins!";
			}
			RPSGame.aiWin(); 
			return "The AI wins!";
		}
		if(a==3)
		{
			if(b==1||b==4)
			{
				RPSGame.playerWin();
				return "The player wins!";
			}
			RPSGame.aiWin(); 
			return "The AI wins!";
		}
		if(a==4)
		{
			if(b==1||b==2)
			{
				RPSGame.playerWin();
				return "The player wins!";
			}
			RPSGame.aiWin(); 
			return "The AI wins!";
		}
		return "Invalid input";
		
	}
	
	public int handToString(String handIn)
	{
		switch(handIn)
		{
		case "Scissors":
			RPSGame.scissorsPicked();
			return 0;
		case "Spock": 
			RPSGame.spockPicked();
			return 1;
		case "Rock": 
			RPSGame.rockPicked();
			return 2;
		case "Lizard": 
			RPSGame.lizardPicked();
			return 3;
		case "Paper":
			RPSGame.paperPicked();
			return 4;
		default: return 0;
		}
	}

}
