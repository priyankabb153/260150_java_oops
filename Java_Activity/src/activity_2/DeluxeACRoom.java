package activity_2;

public class DeluxeACRoom extends DeluxeRoom {

	public DeluxeACRoom() {
		// TODO Auto-generated constructor stub
		super();
		setRatePerSqFeet(12);
	}

	public DeluxeACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, 12);
		// TODO Auto-generated constructor stub
	}
	
	public int calculateTariff() {
		
		return getRatePerSqFeet()*super.getNumberOfSqFeet();
	}

}
