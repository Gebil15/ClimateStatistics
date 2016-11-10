package test.client;

import climate.client.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testSetTimeRange {

	
	@Test
	public void test() {
		WorldMap map=new WorldMap();
		map.setTimeRange(5,3);
		assertEquals(5,map.getTimeRange());
	}

}
