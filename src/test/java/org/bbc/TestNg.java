package org.bbc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Start Time");

	}
	@BeforeClass
	private void beforeClass() {
		System.out.println("Launch Browser");

	}
	@Test
	private void test1() {
		System.out.println("Test");

	}
	@Test
	private void test2() {
		System.out.println("Test2");

	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("End Time");

	}
	@AfterClass
	private void afterClass() {
		System.out.println("Quit Browser");

	}
	@Test
	private void add() {
		System.out.println("Add");

	}

}
