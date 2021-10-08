
public class Over {
	private int[] runPerBall;
	final static int NUMBER_OF_BALLS = 6;
	final int MAX_RUN_PER_BALL = 6;
	final int MAX_NUMBER_OF_HIT = 3;
	final int MAX_RANDOM_EXP = 10000;
	int[] hitterRun = { 0,4,6 };
	int[] defensiveRun = { 1,2,3,5}; 
	
	public Over() {
		this.runPerBall = new int[NUMBER_OF_BALLS];
		this.initializeRunPerBalls();
		
	}
	
	public Over(BatsmanType batsmanType) {
		this.runPerBall = new int[NUMBER_OF_BALLS];
		if(batsmanType == BatsmanType.HITTER) {
			this.initializeRunForHitterBatsman();	
		}
		if(batsmanType == BatsmanType.DEFENSIVE) {
			this.initializeRunForDefesiveBatsman();
		}
	}
	
	public int[] getRunPerBall() {
		return runPerBall;
	}

	public void setRunPerBall(int[] runPerBall) {
		this.runPerBall = runPerBall;
	}

	public void initializeRunPerBalls() {
		for( int i = 0 ; i< NUMBER_OF_BALLS ; i++) {
			this.runPerBall[i] = (int) (Math.random()*MAX_RANDOM_EXP)% MAX_RUN_PER_BALL;
		}	
	}
	
	public void initializeRunForHitterBatsman() {
		for( int i = 0 ; i< NUMBER_OF_BALLS ; i++) {
			int randomIndex = (int) (Math.random()*MAX_RANDOM_EXP)% MAX_NUMBER_OF_HIT;
			this.runPerBall[i] = this.hitterRun[randomIndex];
		}
	}
	
	public void initializeRunForDefesiveBatsman() {
		for( int i = 0 ; i< NUMBER_OF_BALLS ; i++) {
			int randomIndex = (int) (Math.random()*MAX_RANDOM_EXP)% MAX_NUMBER_OF_HIT;
			this.runPerBall[i] = this.defensiveRun[randomIndex];
		}
	}
	
	public void printRunPerBall() {
		System.out.print("Run per Ball");
		for(int i : runPerBall) {
			System.out.print(" "+i);
		}
	}
}
