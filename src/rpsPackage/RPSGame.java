package rpsPackage;

public class RPSGame 
{
	
	private static int playerWins =0;
	private static int aiWins = 0;
	private static int draws =0;
	private static int totalHands = 0;
	private static int scissorsTimes =0;
	private static int spockTimes =0;
	private static int rockTimes =0;
	private static int lizardTimes =0;
	private static int paperTimes =0;
	
	public static void playerWin()
	{
		playerWins++;
		totalHands++;
	}
	
	public static void aiWin()
	{
		aiWins++;
		totalHands++;
	}
	
	public static void draw()
	{
		draws++;
		totalHands++;
	}
	
	public static void paperPicked()
	{
		paperTimes++;
	}
	
	public static void rockPicked()
	{
		rockTimes++;
	}
	
	public static void spockPicked()
	{
		spockTimes++;
	}
	
	public static void lizardPicked()
	{
		lizardTimes++;
	}
	
	public static void scissorsPicked()
	{
		scissorsTimes++;
	}
	
	public static int getPlayerWins()
	{
		return playerWins;
	}
	
	public static int getAIWins()
	{
		return aiWins;
	}
	
	public static int getDraws()
	{
		return draws;
	}
	
	public static void gameResults()
	{
		System.out.println("Total games: " + totalHands);
		System.out.println("Player wins: "+ playerWins + ": " + ((playerWins*100/totalHands*100)/100) +"%");
		System.out.println("AI wins: "+ aiWins + ": " + ((aiWins*100/totalHands*100)/100) +"%");
		System.out.println("Draws: "+ draws + ": " + ((draws*100/totalHands*100)/100) +"%");
		System.out.println("Paper was picked: " + paperTimes + ": "+ ((paperTimes*100/totalHands*200)/100)+ "%");
		System.out.println("Spock was picked: " + spockTimes + ": "+ ((spockTimes*100/totalHands*200)/100)+ "%");
		System.out.println("Rock was picked: " + rockTimes + ": "+ ((rockTimes*100/totalHands*200)/100)+ "%");
		System.out.println("Scissors was picked: " + scissorsTimes + ": "+ ((scissorsTimes*100/totalHands*200)/100)+ "%");
		System.out.println("Lizard was picked: " + lizardTimes + ": "+ ((lizardTimes*100/totalHands*200)/100)+ "%");
	}
}
