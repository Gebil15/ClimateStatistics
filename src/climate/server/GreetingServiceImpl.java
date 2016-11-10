package climate.server;

import climate.client.ClimateData;
import climate.client.GreetingService;
import climate.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	public String greetServer(String input) throws IllegalArgumentException {
		return "wassup";
	}

	@Override
	public ClimateData getMessage(String input) {
		String messageString = "Hello " + input + "!";
	    ClimateData message = new ClimateData();
	    message.setMessage(messageString);
	    return message;
	}
}