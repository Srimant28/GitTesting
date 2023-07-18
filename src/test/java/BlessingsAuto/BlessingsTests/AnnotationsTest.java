package BlessingsAuto.BlessingsTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {
	@BeforeSuite
	public void beforeSuit() { 
		System.out.println("this is before suit");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("this is my before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is my before Method");
	}

	@Test
	public void test1() {
		System.out.println("this is my test1");
	}

	@Test
	public void test2() {
		System.out.println("this is my test2");
	}

	@Test
	public void test3() {
		System.out.println("this is my test3");
	}

	@Test
	public void test4() {
		System.out.println("this is my test4");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("this is  after class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("this is after test");
	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("this is after suit");
	}

}
