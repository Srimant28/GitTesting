package BlessingsAuto.BlessingsTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test(dataProvider = "Data1",dataProviderClass = DataProviders.class)
	public void dataprotest(String userid, String pwd) {

		System.out.println("The userid is:" + userid);
		System.out.println("The pwd is:" + pwd);

	}

	
}
