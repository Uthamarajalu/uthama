package org.bbc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass b = new BaseClass();
		WebDriver driver = b.launchBrowser();
		b.lanuchUrl("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		String url = b.getPageUrl();
		System.out.println(url);
		
		System.out.println(b.getPageTitle());
		
		WebElement nwuser = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		nwuser.click();
		WebElement usrname = driver.findElement(By.id("username"));
		usrname.sendKeys("uthama");
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("uthama@1007");
		WebElement repswd = driver.findElement(By.id("re_password"));
		repswd.sendKeys("uthama@1007");
		WebElement fname = driver.findElement(By.id("full_name"));
		fname.sendKeys("UTHAMARAJALU P");
		WebElement email = driver.findElement(By.id("email_add"));
		email.sendKeys("uthamarajalu@gmail.com");
		WebElement captcha = driver.findElement(By.id("captcha-form"));
		captcha.sendKeys("lommock");
		WebElement agree = driver.findElement(By.id("tnc_box"));
		agree.click();
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
	}

}
