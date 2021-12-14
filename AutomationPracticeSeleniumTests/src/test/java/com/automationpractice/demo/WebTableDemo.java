package com.automationpractice.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

public class WebTableDemo extends WebDriverBase{

	private WebDriver driver;

	

	
	@Test
	public void countTheNumberOfColumn() {
		
		
		
		
		
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> columns = driver.findElements(By.xpath("//th"));
		System.out.println("Total number of column is: " + columns.size());
		Assert.assertEquals(columns.size(), 6);

		String s = "Awesome! Thanks for digging in. "
				+ "So, eventually it comes out to be casing issue. "
				+ "I have a question though, so when I was doing directory "
				+ "import like ./Stores and ignoring the Index, "
				+ "it should have worked coz "
				+ "there wasn't any case issue then. ";

	}
	
	@Test
	public void countTheNumberOfROws() {
		
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> rows = driver.findElements(By.xpath("//tr[child::td]"));
		System.out.println("Total number of row is: "+ rows.size());
		Assert.assertEquals(rows.size(), 4);
	}
	
}
