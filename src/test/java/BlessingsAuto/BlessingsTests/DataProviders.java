package BlessingsAuto.BlessingsTests;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name = "Data1")
	public Object[][] data() {
		return new Object[][] { { "SrimantMishra@gmail.com", "Srimant@123" }, { "Sonu@gmail.com", "Sonu@123" } };

	}


}
