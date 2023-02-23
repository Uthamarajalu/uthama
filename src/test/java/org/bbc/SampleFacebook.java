package org.bbc;

public class SampleFacebook {
	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		b.launchBrowser();
		b.lanuchUrl("https://www.facebook.com/");
		String url = b.getPageUrl();
		System.out.println(url);
		
		System.out.println(b.getPageTitle());
		
		LoginPojo lp = new LoginPojo();
		b.type(lp.getTxtUser(), "greens");
		
		b.type(lp.getTxtPass(), "greens123");
		
		b.btnClick(lp.getBtnLogin());
		b.quitBrowser();
		
	}

}
