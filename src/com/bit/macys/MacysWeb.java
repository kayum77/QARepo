package com.bit.macys;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MacysWeb {
	
	
	ChromeDriver browser = new ChromeDriver();
	
	void macysWeb() {
	    browser.get("https://www.macys.com/");
	
	}

	void search() {
		browser.findElement(By.xpath("//input[@size='9']")).sendKeys("shirts");

		}


	void click() throws InterruptedException {
		Thread.sleep(3000);
		browser.findElement(By.xpath("//button[@id='searchSubmit']")).click();
			
			
		}
		 
	
	void myAccount() {		
		
		browser.findElement(By.xpath("//a[@id='myAccountLink']")).click();
		
		
				
	}
	
	void creditCard() {
		
		browser.findElement(By.xpath("//a[@href='https://www.macys.com/creditservice/gateway?cm_sp=navigation-_-top_nav-_-my_credit_card']")).click();
		
		
		
		
	}
	
	
	
	
	
}
	

