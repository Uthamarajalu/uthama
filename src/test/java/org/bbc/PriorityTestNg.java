package org.bbc;

import org.testng.annotations.Test;

public class PriorityTestNg {
	@Test(priority=8)
	private void test2() {
		System.out.println("Test2");
		
	}
	@Test(priority=7)
	private void test3() {
		System.out.println("Test3");
	}
	@Test(priority=-15)
	private void test1() {
		System.out.println("Test1");

	}
	@Test(enabled=false)
	private void test4() {
		System.out.println("Test4");

	}@Test(invocationCount=5)
	private void test6() {
		System.out.println("Test6");

	}
	@Test(priority=-7)
	private void test5() {
		System.out.println("Test5");

	}@Test(priority=11)
	private void test7() {
		System.out.println("Test7");

	}

}
