package climate.client;

import climate.client.Table;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ClimateStatistics implements EntryPoint {
	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

	private VerticalPanel mainPanel = new VerticalPanel();
	private Button changeViewButton = new Button("Switch Table/Map");
	
	@Override
	public void onModuleLoad() {
		
		Table table = new Table();
	    
	    // assemble Main panel
	    mainPanel.add(changeViewButton);
	    mainPanel.add(table.getFlexTable());
	    
	    // associate the Main panel with the HTML host page
	    RootPanel.get("mainPanelDiv").add(mainPanel);
	}
}