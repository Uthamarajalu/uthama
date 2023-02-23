package org.bbc;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class ExcellTestng {
	public static void main(String[] args) throws IOException {
		BaseClass b = new BaseClass();
		b.launchBrowser();
		
		b.lanuchUrl("https://www.facebook.com/");
		String url = b.getPageUrl();
		System.out.println(url);
		
		System.out.println( b.getPageTitle());
		LoginPojo lp = new LoginPojo();
		WebElement txtUser = lp.getTxtUser();
		b.type(txtUser, b.getDataFromExcell("C:\\Users\\utham\\eclipse-workspace\\ProjectFrame\\ExcelRead\\excel\\ExcelRead.xlsx",
				"Data", 3, 0));
		b.type(lp.getTxtPass(),b.getDataFromExcell("C:\\Users\\utham\\eclipse-workspace\\ProjectFrame\\ExcelRead\\excel\\ExcelRead.xlsx", 
				"Data", 3, 2));
		b.btnClick(lp.getBtnLogin());
		
	
	}

}
