package org.bbc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaC {
	@Test
	private void test11() {
		System.out.println("Test11");

	}
	@Test
	private void test12() {
		System.out.println("Test12");

	}
	@Test(retryAnalyzer=FailedRerun.class)
	private void test13() {
		Assert.assertTrue(false);

	}
	@Test
	private void test14() {
		System.out.println("Test14");

	}

}
