package BlessingsAuto.BlessingsTests;

import org.testng.annotations.Test;

public class Expections {

	@Test
	public void test1() {
		System.out.println("1st test case");
	}

	@Test
	public void test2() {
		System.out.println("2nd test case");
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void test3() {
		System.out.println("3rd test case");
		int i = 1 / 0;
	}

	@Test
	public void test4() {
		System.out.println("4th test case");
	}
}
