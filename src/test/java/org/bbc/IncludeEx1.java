package org.bbc;

import org.testng.annotations.Test;

public class IncludeEx1 {
	@Test(groups="E2E")
	private void test11() {
		System.out.println("Test11");

	}
	@Test(groups="Sanity")
	private void test12() {
		System.out.println("Test12");

	}
	@Test(groups="Smoke")
	private void test13() {
		System.out.println("Test13");

	}
	@Test(groups="Reg")
	private void test14() {
		System.out.println("Test14");

	}
	

}
