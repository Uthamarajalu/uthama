package org.bbc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTestNg {
	@Parameters({"username","passWord"})
	@Test
	private void test1(@Optional("Automation")String name, String pswd) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(name);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pswd);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
	}
		

	

}
