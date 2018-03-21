package rpsPackage;

public class RPSMain 
{
	static RPSHand hand = new RPSHand();
	static AI ai = new AI();
	public static void gameLoop()
	{
		while((RPSGame.getAIWins()+RPSGame.getPlayerWins())<10)
		{
			String aiChoice = ai.getHand();		
			System.out.println(hand.handResult(PlayerInput.getString(),aiChoice));
			System.out.println("The AI chooses: " + aiChoice);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Rock Paper Scissors Lizard Spock");
		System.out.println("Please enter your choice from the above");
		gameLoop();
		RPSGame.gameResults();
	}

}
