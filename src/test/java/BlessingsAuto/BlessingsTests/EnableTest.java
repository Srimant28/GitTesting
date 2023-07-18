package BlessingsAuto.BlessingsTests;

import org.testng.annotations.Test;

public class EnableTest {

	@Test
	public void abc() {
		System.out.println("This is abc");
	}

	@Test(enabled = true)
	public void mno() {
		System.out.println("This is mno");
	}

	@Test
	public void hjk() {
		System.out.println("This is hjk");
	}

}
