package com.nihal.springbootweb.practiceBootWeb;

public class HotelDetails {

	long id;
	String hotelName;
	String hotelCity;
	long perDayCost;
	public HotelDetails(long id, String hotelName, String hotelCity, long perDayCost) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.perDayCost = perDayCost;
	}
	public long getId() {
		return id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public long getPerDayCost() {
		return perDayCost;
	}
	
	
	
	
}
