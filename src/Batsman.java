
public class Batsman extends Player{
	private BatsmanType type;

	public Batsman() {
		super();
	}

	public Batsman(BatsmanType type) {
		this.type = type;
		this.initializeBatsman();
	}	
	public void initializeBatsman() {
		Over[] overs = new Over[Match.numberOfOvers];
		for(int i = 0 ;i < Match.numberOfOvers; i++) {
			overs[i]  = new Over(this.type);
		}
		this.setScorePerOver(overs);
	}

}
