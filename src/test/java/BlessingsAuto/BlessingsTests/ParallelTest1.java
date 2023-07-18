package BlessingsAuto.BlessingsTests;

import org.testng.annotations.Test;

public class ParallelTest1 {

	@Test()
	public void test1() {
		System.out.println("This is my 1st testcase");
		System.out.println("This thread is:"+ Thread.currentThread().getId());

	}

	@Test()
	public void test2() {
		System.out.println("This is my 2nd testcase");
		System.out.println("This thread is:"+ Thread.currentThread().getId());

	}

	@Test()
	public void test3() {
		System.out.println("This is my 3rd testcase");
		System.out.println("This thread is:"+ Thread.currentThread().getId());

	}

	@Test()
	public void test4() {
		System.out.println("This is my 4th testcase");
		System.out.println("This thread is:"+ Thread.currentThread().getId());

	}

}
