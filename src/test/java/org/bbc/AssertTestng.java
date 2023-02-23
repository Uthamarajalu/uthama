package org.bbc;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTestng {
	//Hard Assert
	@Test
	private void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Soft Assert
		SoftAssert s = new SoftAssert();
		s.assertTrue(driver.getCurrentUrl().contains("facebook"), "Verify Url");				
		//Assert.assertTrue(driver.getCurrentUrl().contains("facebook"), "Verify Url");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("greens@123");
		s.assertEquals(txtPass.getAttribute("value"),"greens123", "Verify Url");
		//Assert.assertEquals(txtPass.getAttribute("value"), "jreens@123", "Verify Password");
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		s.assertAll();

	}

}
