package activity_2;

public class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	public HotelRoom() {
		this.hotelName="";
		this.numberOfSqFeet=0;
		this.hasTV=false;
		this.hasWifi=false;
	}

	public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi) {
		// TODO Auto-generated constructor stub
		this.hotelName=hotelName;
		this.numberOfSqFeet=numberOfSqFeet;
		this.hasTV=hasTV;
		this.hasWifi=hasWifi;
		
		
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff() {
		
		return 0;
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}

}
