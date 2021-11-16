package com.automationpractice.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

public class DemoTest extends WebDriverBase{
	
	
	
	//test1
	
	@Test
	public void testAddition() {
		
		int x = 10;
		int y = 10;
		
		boolean   result =   ((x+y) == 30) ;
		
		
		Assert.assertEquals(result, true);
		
		
	}
	
	//test2
	@Test
	public void testDivision() {

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//test3
	
	@Test
	public void testLogin() {
		
		String n1 = "Mary";
		String n2 = "Henry";
		
		Assert.assertEquals(n2, "Mary");
		
	}

}
