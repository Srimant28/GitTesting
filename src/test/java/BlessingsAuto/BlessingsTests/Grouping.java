package BlessingsAuto.BlessingsTests;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "Srimant")
	public void test1() {
		System.out.println("This is my 1st testcase");
	}

	@Test(groups = "Sonu")
	public void test2() {
		System.out.println("This is my 2nd testcase");
	}

	@Test(groups = "Srimant")
	public void test3() {
		System.out.println("This is my 3rd testcase");
	}

	@Test(groups = "Sonu")
	public void test4() {
		System.out.println("This is my 4th testcase");
	}
}
