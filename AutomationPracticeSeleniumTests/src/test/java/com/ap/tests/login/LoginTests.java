package com.ap.tests.login;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;


public class LoginTests extends WebDriverBase{
	
	
	@Test
	@Parameters({"usrername","password"})
	public void loginWithValidUSer(String name, String pwd) {
//		driver.get("http:www.automationpractice.com");
		System.out.println("Enter userid: "+name);
		System.out.println("Enter password: "+pwd);
		System.out.println("Click sign in button");
		System.out.println("Verify user logged in");
		//
	}
	@Test
	public void loginTest2() {
		driver.get("http:www.automationpractice.com");
		//
	}
	@Test
	public void loginTest3() {
		driver.get("http:www.automationpractice.com");
		//
	}
	
	@Test
	public void myNewLoginTest() {
		driver.get("http:www.automationpractice.com");
	}


}
