package com.automationpractice.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

public class ExplicitWaitDemo extends WebDriverBase{
	
	
	@Test
	public void testClickDelayAlert() {
		driver.get("http://www.leafground.com/pages/alertappear.html");
		driver.findElement(By.id("alert")).click();
		
		//explicitly wait for alert to be present
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
	}
	
	
	@Test

	public void getQuote() {
			
		String q = "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”";
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(70));
		WebElement quotationHolder = driver.findElement(By.id("explicitWaitTextPresentDemo"));
		webDriverWait.until(ExpectedConditions.textToBePresentInElement(quotationHolder, q));
		
		String quote = quotationHolder.getText();
		
		Assert.assertEquals(quote, q);
	}
	

}
