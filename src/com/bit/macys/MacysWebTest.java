package com.bit.macys;

public class MacysWebTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kayum\\Downloads\\chromedriver_win32\\chromedriver.exe");

		MacysWeb macys = new MacysWeb();
		macys.macysWeb();
		macys.search();
		macys.click();
		macys.myAccount();
		macys.creditCard();

	}

}
