package spectrum;

public class Highscore {
	
	private static double highscore = 100000;
	private static double totalScore;
	
	public static double getHighscore()
	{
		return highscore;
	}

	public static void updateHighscore()
	{
		if(highscore > 0)
		highscore -= 5;	
	}
	
	public static void addPenalty()
	{
		if(highscore > 5000)
		highscore -= 5000;
	}
	
	public static void updateTotalScore()
	{
		totalScore += highscore;
		highscore = 100000;
	}
	
	public static double getTotalscore()
	{
		return totalScore;
	}
	
	public static void resetScore()
	{
		highscore = 100000;
		totalScore = 0;
	}
	
	public static void resetHighscore()
	{
		highscore = 100000;
	}
}
