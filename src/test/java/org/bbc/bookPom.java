package org.bbc;

public class bookPom {
	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.launchBrowser();
		b.lanuchUrl("https://adactinhotelapp.com/");
		System.out.println(b.getPageUrl());
		System.out.println(b.getPageTitle());
		
		Booking bo = new Booking();
		b.type(bo.getUsername(), "GeorgeGowtham");
		b.type(bo.getPswd(), "George333");
		b.btnClick(bo.getLgin());
		
		b.selectByIndex(bo.getLoc(), 2);
		b.selectByIndex(bo.getSec(), 1);
		b.selectByIndex(bo.getRoomTy(), 3);
		b.selectByIndex(bo.getNrooms(), 4);
		b.type(bo.getDatePick(), "16/02/2023");
		b.type(bo.getDateOut(), "17/02/2023");
		
		b.selectByIndex(bo.getAdult(), 4);
		b.selectByIndex(bo.getChild(), 2);
		b.btnClick(bo.getSearch());
		Thread.sleep(3000);
		
		b.btnClick(bo.getRadioBtn());
		b.btnClick(bo.getCntClick());
		
		b.type(bo.getfName(), "Uthama");
		b.type(bo.getlName(), "PR");
		b.type(bo.getAdr(), "chennai");
		b.type(bo.getCrdNo(), "5736574965300694");
		b.selectByIndex(bo.getCrdTy(), 2);
		b.selectByIndex(bo.geteMonth(), 4);
		b.selectByIndex(bo.geteYear(), 7);
		b.type(bo.getCvv(), "453");
		b.btnClick(bo.getClkbook());
		Thread.sleep(8000);
		
		String get = b.attributeGet(bo.getOrderNo(), "value");
		System.out.println(get);
		

		
		
		
		
	}

}
