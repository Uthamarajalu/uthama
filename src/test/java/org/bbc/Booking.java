package org.bbc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends BaseClass {
	public Booking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement pswd;
	@FindBy(name="login")
	private WebElement lgin;
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement sec;
	@FindBy(id="room_type")
	private WebElement roomTy;
	@FindBy(id="room_nos")
	private WebElement nrooms;
	@FindBy(id="datepick_in")
	private WebElement datePick;
	@FindBy(id="datepick_out")
	private WebElement dateOut;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;
	@FindBy(id="continue")
	private WebElement cntClick;
	
	@FindBy(id="first_name")
	private WebElement fName;
	@FindBy(id="last_name")
	private WebElement lName;
	@FindBy(id="address")
	private WebElement adr;
	@FindBy(id="cc_num")
	private WebElement crdNo;
	@FindBy(id="cc_type")
	private WebElement crdTy;
	@FindBy(id="cc_exp_month")
	private WebElement eMonth;
	@FindBy(id="cc_exp_year")
	private WebElement eYear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement clkbook;
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPswd() {
		return pswd;
	}
	public WebElement getLgin() {
		return lgin;
	}
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getSec() {
		return sec;
	}
	public WebElement getRoomTy() {
		return roomTy;
	}
	public WebElement getNrooms() {
		return nrooms;
	}
	public WebElement getDatePick() {
		return datePick;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getRadioBtn() {
		return radioBtn;
	}
	public WebElement getCntClick() {
		return cntClick;
	}
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getAdr() {
		return adr;
	}
	public WebElement getCrdNo() {
		return crdNo;
	}
	public WebElement getCrdTy() {
		return crdTy;
	}
	public WebElement geteMonth() {
		return eMonth;
	}
	public WebElement geteYear() {
		return eYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getClkbook() {
		return clkbook;
	}
	public WebElement getOrderNo() {
		return orderNo;
	}
	
	
	

}
