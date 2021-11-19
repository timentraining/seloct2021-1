package com.ap.tests.purchase;

import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

public class PurchaseTests extends WebDriverBase{
	
	@Test
	public void aTest() {
		driver.get("http:www.automationpractice.com");
		//
	}
	
	@Test
	public void newPurchaseTest() {
		driver.get("http:www.automationpractice.com");
		//
	}
	
	@Test(priority = 0)
	public void updatePurchase() {
		driver.get("http:www.automationpractice.com");
		//
	}
	
	@Test(priority = 3)
	public void securePurchase() {
		driver.get("http:www.automationpractice.com");
		//
	}
}
