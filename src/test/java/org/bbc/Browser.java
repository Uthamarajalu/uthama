package org.bbc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver driver;
	@Parameters("BrowserName")
	@Test
	private void test1(String bName) {
		if (bName.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (bName.equalsIgnoreCase("fireFox")) {
			System.out.println("FireFox");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (bName.equalsIgnoreCase("ie")) {
			System.out.println("Internet Explorer");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}

	}

}
