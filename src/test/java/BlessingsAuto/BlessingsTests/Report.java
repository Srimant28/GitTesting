package BlessingsAuto.BlessingsTests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {
	
	@Test()
	public void report() {
		String expectedval = "blessings";
		Assert.assertEquals("blessings", expectedval);
		Reporter.log("This is fail plz check");
	}

}
