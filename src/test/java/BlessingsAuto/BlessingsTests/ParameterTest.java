package BlessingsAuto.BlessingsTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Test()
	@Parameters({"Userid","pwd"})
	public void login(String Userid , String pwd) {
		System.out.println("The userid is:"+Userid);
		System.out.println("The pwd is:"+pwd);
		
	}

}
