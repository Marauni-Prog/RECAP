package recaps;

public class MainChallenge {
	public static void main(String[]args) {
		int score =10000;
		int levelCompleted=8;
		boolean gameOver=true;
		int bonus=200;
		
		int finalScore=score;
		
		if(gameOver) {
			finalScore += (levelCompleted*bonus);
			System.out.println("Your FinalScore was " + finalScore);
		}
	}
}
