package BlessingsAuto.BlessingsTests;

import org.testng.annotations.Test;

public class AlwaysRun {
	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test(dependsOnMethods = "test1")
	public void test2() {
		System.out.println("test2");
		int j = 20 / 0;
	}

	@Test(dependsOnMethods = "test2", alwaysRun = true)
	public void test3() {
		System.out.println("test3");
	}

	@Test
	public void test4() {
		System.out.println("test4");
	}

}
