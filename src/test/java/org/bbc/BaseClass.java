package org.bbc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;	
	}
	public void lanuchUrl(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
	}
	public void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	public void quitBrowser() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	public String getPageUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
		// TODO Auto-generated method stub
	}
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
		// TODO Auto-generated method stub
	}
	public String attributeGet(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;		
	}
	public String textGet(WebElement element) {
		String text = element.getText();
		return text;
		
	}
	
	public void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void doubleClick() {
		Actions a = new Actions(driver);
		a.doubleClick().perform();
	}
	public void actionContextClick() {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
	
	public void dragAndDrop(WebElement e1,WebElement e2) {
		// TODO Auto-generated method stub
		Actions a = new Actions(driver);
		a.dragAndDrop(e1, e2).perform();
	}
	public Alert acceptAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		return a;
	}
	public void alertSendkeys(String key) {
		Alert a = driver.switchTo().alert();
		a.sendKeys("key");
	}
	public String alertGetText() {
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		return text;
	}
	public void  robot() throws AWTException {
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
	}
    public void TakeScreenshot() throws IOException {
		// TODO Auto-generated method stub
    	TakesScreenshot tk = (TakesScreenshot)driver;
    	File file = tk.getScreenshotAs(OutputType.FILE);
    	File dest = new File("D:\\refName.png");
    	FileUtils.copyFile(file, dest);
	}
    public void switchFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
    public void switchFrameElement(WebElement frameElement) {
    	driver.switchTo().frame(frameElement);
	}
    public void switchFrameIndex(int index) {
		driver.switchTo().frame(index);
	}
    public String listGetOptions(WebElement element,String text) {
    	Select s = new Select(element);
    	List<WebElement> options = s.getOptions();
    	for (int i = 0; i < options.size(); i++) {
    		WebElement element2 = options.get(i);
    		String text2 = element2.getText();
    		System.out.println(text2);
		}
		return null;
		
	}
    
    public String getAllSelectedOptions(WebElement element) {
    	Select s = new Select(element);
    	List<WebElement> all = s.getAllSelectedOptions();
    	for (int i = 0; i < all.size(); i++) {
    		WebElement element2 = all.get(i);
    		String text = element2.getText();
    		System.out.println(text);
			
    	}
		return null;
	}
    public void getFirstSelectedOptions(WebElement element) {
		Select s = new Select(element);
		s.getFirstSelectedOption();
	}
    
    public void selectByIndex(WebElement element,int index) {
    	Select s = new Select(element);
    	s.selectByIndex(index);
	}
    public void selectByvalue(WebElement element,String value) {
    	Select s = new Select(element);
    	s.selectByValue("value");
	}
    public void selectByvisualText(WebElement element,String text) {
    	Select s = new Select(element);
    	s.selectByVisibleText("text");
	}
    public void isMultipleSelected(WebElement element,String text) {
    	Select s = new Select(element);
    	boolean multi = s.isMultiple();
	}
    public void deselectByvisualText(WebElement element,String text) {
    	Select s = new Select(element);
    	s.deselectByVisibleText("text");
	}
    public void deselectByvalue(WebElement element,String value) {
    	Select s = new Select(element);
    	s.deselectByValue("value");
    }
    public void deselectByIndex(WebElement element,int index) {
    	Select s = new Select(element);
    	s.deselectByIndex(index);
    }
    public void deselectall(WebElement element) {
    	Select s = new Select(element);
    	s.deselectAll();
    }
    public void jseGetSetAttribute(WebElement element,String script,ScriptKey key) {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("\"aruguments[0].setAttribute('value','key')\"", element);
    	String pass= (String)jse.executeScript("return arguments[0].getAttirbute('value')", element);
    }
    public void jseclick(WebElement element, String key) {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("arugument[0].click()", key);
	}
    public void jseScroolintoView(WebElement element, String rName) {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	String script = (String)jse.executeScript("arguments[0].scrollIntoView(true)", rName);
    	jse.executeScript("arguments[0].scrollIntoView(false)", rName);
	}
    public String getWindowHandle() {
    	String par = driver.getWindowHandle();
		return par;
	}
	public Set getWindowHandles() {
		Set<String> all = driver.getWindowHandles();
		return all;
	}
	public void listGetWindowHandles(int index) {
		String par = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		List<String> l = new LinkedList<String>();
		l.addAll(all);
		driver.switchTo().window(l.get(index));		
	}
	public void navigateUrl(String url) {
		driver.navigate().to(url);
	}
	public void navigateBack() {
		driver.navigate().back();
	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	public void nvgateIsDisplayedIsEnable(WebElement element) {
		boolean b = element.isDisplayed();
		boolean c = element.isEnabled();
	}
	public void explicitWait(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(100));
		WebElement until = w.until(ExpectedConditions.elementToBeClickable(element));	
	}
	public void fluentWait(WebElement element) {
		Wait w = new FluentWait(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
		WebElement btnClick =(WebElement) w.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitPageLoad() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

	}
	public String getDataFromExcell(String Loc, String sName, int rNo, int cNo) throws IOException {
		String value=null;
		File excelLoc = new File(Loc);
		FileInputStream fIn = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet(sName);
		Row r = s.getRow(rNo);
		Cell c = r.getCell(cNo);
		int type = c.getCellType();
		if (type==1) {
			 value = c.getStringCellValue();
			 
		}
		else if (type==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sdf = SimpleDateFormat("DD/MM/YY");
				value = sdf.format(date);
			}
			else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				value = String.valueOf(l);		
			}
		}
		return value;

	}
	private SimpleDateFormat SimpleDateFormat(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
