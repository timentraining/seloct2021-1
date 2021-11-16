package com.ap.tests.registration;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

public class Registrationests extends WebDriverBase{
	
	@Test
	@Parameters({"firstname","lastname","email","password"})
	public void register_a_new_user(String firstname, String lastname, String email, String pwd) {
//		driver.get("http:www.automationpractice.com");
		//
		System.out.println("Entering firstname: "+firstname);
		System.out.println("Entering lastname: "+lastname);
		System.out.println("Entering email: "+email);
		System.out.println("Entering password: "+pwd);
	}
	
	@Test
	public void registrationTest2() {
		driver.get("http:www.automationpractice.com");
		//
	}
	
	@Test
	public void registrationTest3() {
		driver.get("http:www.automationpractice.com");
		//
	}
	
	@Test
	public void registrationTest4() {
		driver.get("http:www.automationpractice.com");
		//
	}
}
