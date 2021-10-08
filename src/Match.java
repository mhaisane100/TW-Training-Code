
public class Match {
	static int numberOfOvers= 2;
	
	private int target;
	private Over over;
	private Player bolwer ;
	private Batsman batsman;

	public Match() {
		this.target = 12; 
		this.over = new Over();
		this.batsman = new Batsman();
		this.bolwer = new Player();
	}
	
	public Match(int target, Over over) {
		this.target = target;
		this.over = over;
	}
	
	public Match(BatsmanType batsmanType) {
		this.target = 12; 
		this.over = new Over();
		this.batsman = new Batsman(batsmanType);
		this.bolwer = new Player();
	}

	public boolean isMatchWon() {
		int sum = 0;
		for(int i :over.getRunPerBall()) {
			sum += i;
			if(sum >= this.target) {
				this.over.printRunPerBall();
				return true;
			}
		}
		this.over.printRunPerBall();
		return false;
	}
	
	public void checkBatsmanGame() {
		for(int i = 0 ; i <batsman.getScorePerOver().length; i++) {
			int[] bowerOver = bolwer.getScorePerOver()[i].getRunPerBall();
			int[] batsmanOver = batsman.getScorePerOver()[i].getRunPerBall();
			for(int j = 0; j < Over.NUMBER_OF_BALLS; j++) {
				if(batsmanOver[j] == bowerOver[j]) {
					System.out.println("BATSMAN ::");
					batsman.showOvers();
					System.out.println("BOLWER::");
					bolwer.showOvers();
					System.out.println("OUT");
					return;
				}
				batsman.score += batsmanOver[j];
				bolwer.score += bowerOver[j];
			}
		}
		System.out.println("BATSMAN ::");
		batsman.showOvers();
		System.out.println("BOLWER::");
		bolwer.showOvers();
		if(batsman.score > bolwer.score) {
			System.out.println("WIN");
		} else {
			System.out.println("LOST");
		}
	}
}
