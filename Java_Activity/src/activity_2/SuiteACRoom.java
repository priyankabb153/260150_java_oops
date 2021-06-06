package activity_2;

public class SuiteACRoom extends HotelRoom {
	private  int ratePerSqFeet;

	public int getRatePerSqFeet() {
		if(isHasWifi()) {
			return ratePerSqFeet+2;
		}
		else {
			return ratePerSqFeet;
		}
		
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public SuiteACRoom() {
		// TODO Auto-generated constructor stub
		super();
		setRatePerSqFeet(15);
		
	}
	public SuiteACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		setRatePerSqFeet(15);
		// TODO Auto-generated constructor stub
	}
	
	public int calculateTariff() {
		
		return getRatePerSqFeet()*super.getNumberOfSqFeet();
	}

}
