package activity_1;

public class Innings {
	private String teamname;
	private String inningsname;
	private int runs;
	
	public String getteamname() {
		return teamname;
	}
	
	public void setteamname(String teamname) {
		this.teamname=teamname;
	}
	
	public String getinningsname(String string) {
		return inningsname;
	}
	
	public void setinningsname(String inningsname) {
		this.inningsname=inningsname;
	}

	public int getruns() {
		return runs;
	}
	
	public void setruns(int runs) {
		
		this.runs=runs;
		
		
	}
	
	public void displayInningsDetails() {
		System.out.println("Name:"+teamname);
		System.out.println("Scored :"+runs);
		if(inningsname.equals("First")) {
		    System.out.println("Need "+(runs+1)+" to win");
		}
		else {
			System.out.println("Match Ended.");
		}
		
	}

	

}
