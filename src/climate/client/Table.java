package climate.client;

import com.google.gwt.user.client.ui.FlexTable;

public class Table {
	
	private FlexTable dataTable = new FlexTable();
	
	public Table() {		
		dataTable.setText(0, 0, "Date");
	    dataTable.setText(0, 1, "Average Temperature");
	    dataTable.setText(0, 2, "Average Temperature Uncertainty");
	    dataTable.setText(0, 3, "City");
	    dataTable.setText(0, 4, "Country");
	    dataTable.setText(0, 5, "Latitude");
	    dataTable.setText(0, 6, "Longitude");
	    dataTable.getElement().setId("dataTable");
	    
	    dataTable.setText(1, 0, "bla");
	    dataTable.setText(1, 1, "bla");
	    dataTable.setText(1, 2, "bla");
	    dataTable.setText(1, 3, "bla");
	    dataTable.setText(1, 4, "bla");
	    dataTable.setText(1, 5, "bla");
	    dataTable.setText(1, 6, "bla");
	}
	
	public FlexTable getFlexTable() {
		return dataTable;
	}
}