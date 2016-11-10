package climate.shared;

import java.util.ArrayList;

public class City {
	private String country;
	private String city;
	private String latitude;
	private String longitude;
	
	private ArrayList<String> date;
	private ArrayList<String> avrtemperature;
	private ArrayList<String> avrtempuncertainty;
	
	public City (String country, String latitude, String longitude, ArrayList<String> date, ArrayList<String> avrtemperature, ArrayList<String> avrtempuncertainty){
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.avrtemperature = avrtemperature;
		this.avrtempuncertainty = avrtempuncertainty;
	}
	public String getcity(){
		return city;
	}

	
	

}
