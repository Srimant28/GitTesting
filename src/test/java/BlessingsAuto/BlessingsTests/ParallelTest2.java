package BlessingsAuto.BlessingsTests;

import org.testng.annotations.Test;

public class ParallelTest2 {
	
	@Test()
	public void test5() {
		System.out.println("This is my 5th testcase");
		System.out.println("This thread is:"+ Thread.currentThread().getId());

	}

	@Test()
	public void test6() {
		System.out.println("This is my 6th testcase");
		System.out.println("This thread is:"+ Thread.currentThread().getId());

	}

	@Test()
	public void test7() {
		System.out.println("This is my 7th testcase");
		System.out.println("This thread is:"+ Thread.currentThread().getId());

	}

	@Test()
	public void test8() {
		System.out.println("This is my 8th testcase");
		System.out.println("This thread is:"+ Thread.currentThread().getId());

	}

}
