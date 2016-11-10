package climate.client;

import java.io.Serializable;

public class ClimateData implements Serializable {

	private String message;
	public ClimateData(){};
	
	public void setMessage(String message) {
		this.message = message;
	}
}