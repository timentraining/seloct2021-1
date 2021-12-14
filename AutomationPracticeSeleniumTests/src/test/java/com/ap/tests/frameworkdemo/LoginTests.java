package com.ap.tests.frameworkdemo;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.timentraining.core.TestBase;
import net.timentraining.core.io.Excel;
import net.timentraining.core.mail.EmailClient;
import net.timentraining.core.mail.Gmail;
import net.timentraining.core.util.TestUtility;

public class LoginTests extends TestBase{
	
	
	@Test
	public void login_with_valid_user() throws InterruptedException {
		
		webui.launch("http://automationpractice.com/index.php");
		webui.click_element_by_className("login");
		TestUtility.sleep(2000);
		
		boolean isCreateAccountTextDisplayed = webui.check_element_exist_by_visible_text("Create an account");
		Assert.assertEquals(isCreateAccountTextDisplayed,true);
		
		webui.takeScreenshot();
		
	}
	
	@Test
	public void demoFrameworkComponenet() {
		
		
	Gmail gmail = new Gmail("timentrainingstudent@gmail.com", "time&training");
	gmail.ComposeEmail("timentrainingstudent+abc@gmail.com", "Batch of Selenium Oct 2021", "Hello from batch!");
	String msg = gmail.get_most_recent_email();
	System.err.println(msg);
	
	
	gmail.check_todays_email_in_inbox("timentrainingstudent+abc@gmail.com", "Hello", "abc def");
	
	//mike@amazon.com


		
//	Excel xl = new Excel("/Users/rkreja/Desktop/TnT Live Session/testData.xlsx", "Sheet1");//Apache POI
//	
//	System.out.println(xl.getCellValueAsString(2, 4));
//	
//	System.out.println(xl.getRowByData("Reproduction", "repro"));
//	
//	
//	System.out.println(xl.rowCount());
//	
//	List<String> columnNames = xl.getColHeaders();
//	for(String col: columnNames) {
//		System.out.println(col);
//	}
//	
//	
		
		
//	System.out.println(TestUtility.generate_random_alphanumeric_string(10));
//	System.out.println(TestUtility.generate_random_numeric_string(6));
//	System.out.println(TestUtility.generate_random_password(6));
//	System.out.println(TestUtility.generate_random_string(30));
//	
//	System.out.println(TestUtility.getFutureDate(7));
		
	}

}
