package org.bbc;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit1 {
	@Ignore
	@Test
	public void Test11() {
		System.out.println("Test11");

	}
	@Test
	public void Test12() {
		Assert.assertTrue(true);
	}
	@Test
	public void Test13() {
		System.out.println("Test13");
	}
	@Test
	public void Test14() {
		Assert.assertTrue(false);
	}

}
