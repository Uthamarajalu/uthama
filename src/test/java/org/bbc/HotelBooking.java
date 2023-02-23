package org.bbc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		WebDriver driver = b.launchBrowser();
		b.lanuchUrl("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		String url = b.getPageUrl();
		System.out.println(url);
		Thread.sleep(8000);
		
		WebElement usrname = driver.findElement(By.id("username"));
		usrname.sendKeys("GeorgeGowtham");
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("George333");
		WebElement lgin = driver.findElement(By.id("login"));
		lgin.click();
		
		WebElement loc = driver.findElement(By.id("location"));
		loc.click();
		Select s = new Select(loc);
		s.selectByIndex(4);
		
		WebElement hotelName = driver.findElement(By.id("hotels"));
		hotelName.click();
		s.selectByIndex(2);
		
		WebElement room = driver.findElement(By.id("room_type"));
		room.click();
		s.selectByIndex(1);
		
		WebElement nRoom = driver.findElement(By.id("room_nos"));
		nRoom.click();
		s.selectByIndex(2);
		
		WebElement checkinDate = driver.findElement(By.id("datepick_in"));
		checkinDate.sendKeys("08/02/23");
		
		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		checkOutDate.sendKeys("09/02/23");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		s.selectByIndex(3);
		
		WebElement child = driver.findElement(By.id("child_room"));
		s.selectByIndex(1);
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		WebElement selecthtl = driver.findElement(By.id("radiobutton_1"));
		selecthtl.click();
		
		WebElement cntinue = driver.findElement(By.id("continue"));
		cntinue.click();
		WebElement fName = driver.findElement(By.id("first_name"));
		fName.sendKeys("Ganesh");
		
		WebElement lName = driver.findElement(By.id("last_name"));
		lName.sendKeys("R");
		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("Chennai, India");
		
		WebElement crdno = driver.findElement(By.id("cc_num"));
		crdno.sendKeys("5235123498652546");
		
		
		WebElement crdType = driver.findElement(By.id("cc_type"));
		crdType.click();
		s.selectByIndex(1);
		
		WebElement crdMonth = driver.findElement(By.id("cc_exp_month"));
		crdMonth.click();
		s.selectByIndex(1);
		
		WebElement crdYear = driver.findElement(By.id("cc_exp_year"));
		crdYear.click();
		s.selectByIndex(11);
		WebElement crdcvv = driver.findElement(By.id("cc_cvv"));
		crdcvv.sendKeys("324");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		Thread.sleep(8000);
		
		WebElement ordNo = driver.findElement(By.id("order_no"));
		
		String attributeGet = b.attributeGet(ordNo, "value");
		System.out.println(attributeGet);
		
		
	}

}
