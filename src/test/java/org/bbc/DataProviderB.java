package org.bbc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderB {
	@Test(dataProvider="res",dataProviderClass=DataProviderA.class)
	private void test(String s1, String s2) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(s1);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(s2);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();

	}

}
