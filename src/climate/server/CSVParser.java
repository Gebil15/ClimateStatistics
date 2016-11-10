package climate.server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import climate.shared.City;

public class CSVParser {
	public ArrayList<City> read() {
		
		ArrayList<City> list = new ArrayList();

        String csvFile = "/ClimateStatistics/resource/data.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] dataline = line.split(cvsSplitBy);
                // if temperature data of a new city begins
                if (dataline[3].equals(list.get(list.size()-1).getcity())){
                	City city = new City();
                }
                //System.out.println("date: "+ country[0]);
                
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
		return null;

    }

}
