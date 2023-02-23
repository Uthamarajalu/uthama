package org.bbc;

import org.testng.annotations.Test;

public class IncludeEX {
	@Test(groups="Sanity")
	private void test1() {
		System.out.println("Test1");

	}
	@Test(groups="Smoke")
	private void test2() {
		System.out.println("Test2");

	}
	@Test(groups="Reg")
	private void test3() {
		System.out.println("Test3");

	}
	@Test(groups="E2E")
	private void test4() {
		System.out.println("Test4");

	}

}
