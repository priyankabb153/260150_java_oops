package activity_4;

public class ODIMatch extends Match {
    //50 overs in ODI Match
	
	public double calculateRunRate() {
		return (remaining_runs()/((50.0-getCurrentover())));
	}
	
	public int remaining_runs()
	{
		int score=getCurrentscore();
		int target=getTarget();
		int needed_runs=target-score;
		return needed_runs;
	}
	
	public  int calculateBalls() {
		int balls_bowled=6*(int)getCurrentover();
		return 300-balls_bowled;
		
	}
	
	public void display(double reqRunrate, int balls) {
	   System.out.println("Requirements:");
	   System.out.println("Needed "+remaining_runs()+" runs in "+calculateBalls()+" balls");
	   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
	}


}
