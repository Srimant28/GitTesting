package BlessingsAuto.BlessingsTests;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 5)
	public void test1() {
		System.out.println("This is my 1st testcase");
	}

	@Test
	public void test2() {
		System.out.println("This is my 2nd testcase");
	}
}
