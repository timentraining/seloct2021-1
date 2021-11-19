package com.automationpractice.tests.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

public class LotOfLoginTests extends WebDriverBase{
	
	
	@Test
	public void purchase() {
		driver.get("http://www.automationpractice.com");
		
		HomePage homePage = new HomePage(driver);
		homePage.clickSignInButton();
		
		LoginPage loginPage = new LoginPage(driver);
	
//		loginPage.login("xyz@mailinator.com", "xyz1234");
		loginPage.enterEmail("testemaildfdfdfdfdf");
		loginPage.clickButton();
		String str = loginPage.getErrorMessages();
		System.err.println(str);
		

		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
	}
	
	
	@Test
	public void profileTest() {
		driver.get("http://www.automationpractice.com");
		HomePage homePage = new HomePage(driver);
		homePage.clickSignInButton();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("xyz@mailinator.com", "xyz1234");

		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
	}
	
	
	@Test
	public void productTest() {
		driver.get("http://www.automationpractice.com");
		HomePage homePage = new HomePage(driver);
		homePage.clickSignInButton();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("xyz@mailinator.com", "xyz1234");

		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
	}
	
	
	
	@Test
	public void searchtest() {
		driver.get("http://www.automationpractice.com");
		HomePage homePage = new HomePage(driver);
		homePage.clickSignInButton();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("xyz@mailinator.com", "xyz1234");

		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
	}
	
	
	
	@Test
	public void registration() {
		driver.get("http://www.automationpractice.com");
		HomePage homePage = new HomePage(driver);
		homePage.clickSignInButton();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("xyz@mailinator.com", "xyz1234");

		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
	}
	
	
	@Test
	public void p() {
		driver.get("http://www.automationpractice.com");
		HomePage homePage = new HomePage(driver);
		homePage.clickSignInButton();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("xyz@mailinator.com", "xyz1234");

		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
	}
	


}
