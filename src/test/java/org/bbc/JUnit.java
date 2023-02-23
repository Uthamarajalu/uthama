package org.bbc;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit {
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	@Test
	public void Test2() {
		Assert.assertTrue(false);		
	}
	@Ignore
	@Test
	public void Test3() {
		System.out.println("Test3");

	}
	@Test
	public void Test4() {
		System.out.println("Test4");

	}

}
