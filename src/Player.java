
public class Player {
	int score;
	private Over[] scorePerOver;
	
	public Over[] getScorePerOver() {
		return scorePerOver;
	}
	
	public Player() {
		setScorePerOver(new Over[Match.numberOfOvers]);
		this.initializeScorePerOver();
	}
	
	
	public Player(Over[] scorePerOver) {
		super();
		this.scorePerOver = scorePerOver;
	}

	public void setScorePerOver(Over[] scorePerOver) {
		this.scorePerOver = scorePerOver;
	}
	
	public void initializeScorePerOver() {
		for(int i = 0 ; i < Match.numberOfOvers; i++) {
			getScorePerOver()[i] = new Over();
		}
	}
	
	public void showOvers() {
		for(Over over: getScorePerOver()) {
			over.printRunPerBall();
			System.out.println();
		}
		
	}
}
