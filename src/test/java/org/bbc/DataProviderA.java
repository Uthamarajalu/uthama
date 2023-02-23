package org.bbc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderA {
	@Test(dataProvider="res")
	public void test1(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);

	}		
	@DataProvider(name="res")
	public Object[][] testData() {
		return new Object[][]{ {"arul@gmail.com","arul@123"},{"raj@gmail.com","rai@123"},{"abi@gmail.com","abi@123"}};

}
}