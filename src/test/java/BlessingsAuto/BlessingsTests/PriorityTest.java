package BlessingsAuto.BlessingsTests;

import org.testng.annotations.Test;

public class PriorityTest {
		
		@Test(priority=1)
		public void abc() {
			System.out.println("test1");
		}
		
		@Test(priority=2)
		public void def() {
			System.out.println("test2");
		}

		@Test(priority=0)
		public void mno() {
			System.out.println("test3");
		}
		
		@Test(priority=-2)
		public void ijk() {
			System.out.println("test4");
		}
		
		@Test(priority=-1)
		public void vxw() {
			System.out.println("test5");
		}
		
		@Test(priority=0)
		public void mnp() {
			System.out.println("test6");
		}
}
