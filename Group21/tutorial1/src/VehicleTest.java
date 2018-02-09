import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {
    private Vehicle blueUni;
	private Vehicle orangeTruck;
    
	// Setup test before Test. Creates an object on which all tests will be executed
	@Before
	public void setUp() throws Exception {
		blueUni = new Vehicle(1,"blue");
		orangeTruck = new Vehicle(4,"orange");
	}

	// Showcase all basic test functions
	@Test
	public void testNumberOfWheels() {
		int a = 1;
		int b = 1;
		//assertTrue(a<=b);
		//assertFalse(a!=b);
		assertEquals(blueUni.getWheels(),1);
		assertEquals(orangeTruck.getWheels(),4);
	}

}
