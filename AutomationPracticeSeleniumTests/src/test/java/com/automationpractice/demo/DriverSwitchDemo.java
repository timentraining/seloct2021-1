package com.automationpractice.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;


//We can use driver.swicthTo() method in:
	//alert
	//frame
	//window






public class DriverSwitchDemo extends WebDriverBase{
	
	
	
	@Test
	public void switchToWindow() {
		
		
		// goto http://www.leafground.com/pages/Window.html
		driver.get("http://www.leafground.com/pages/Window.html");
		String mainWindowHandle = driver.getWindowHandle();
		
		
		//click on button : Open Home Page
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		
		//here I have to switch driver to a window
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String handle: allWindowHandles) {
			if(handle.equals(mainWindowHandle)) {
				
			}else {
				driver.switchTo().window(handle);
			}
		}
		
		
		//A new window will open, click on Download Files box from new window
		driver.findElement(By.xpath("//h5[normalize-space()='DownLoad Files']")).click();
		
		
		
	}

	
	
	
	@Test
	public void switchToWindow2() {
		
		

		driver.get("http://www.leafground.com/pages/Window.html");
		String mainWindowHandle = driver.getWindowHandle();
	
		driver.findElement(By.xpath("//button[@id='home']")).click();
		

		//here we have 2 window open
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String handle: allWindowHandles) {
			if(handle.equals(mainWindowHandle)) {
				
			}else {
				driver.switchTo().window(handle);
			}
		}
		
		
		
		
	}

	
	@Test
	public void switchToFrameDemo1() {
		// goto http://www.leafground.com/pages/frame.html
		driver.get("http://www.leafground.com/pages/frame.html");
		//click on 'Click Me' button (The first one)
		WebElement e = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("Click")).click();
	}
	
	
	
	@Test
	public void clickOnAlert2() {
		//go to: http://www.leafground.com/pages/Alert.html
		driver.get("http://www.leafground.com/pages/Alert.html");
		//click on a button: Confirm Box
		WebElement btn = driver.findElement(By.cssSelector("button[onclick='confirmAlert()']"));
		btn.click();
		//click on ok from alert
		driver.switchTo().alert().accept();
		
		//verify a text displayed under the button as: You pressed OK!
		WebElement msgHolder = driver.findElement(By.cssSelector("#result"));
		String msg = msgHolder.getText();
		Assert.assertEquals(msg, "You pressed OK!");
		//click on a button: Confirm Box again
		btn.click();
		//click cancel button on alert
		driver.switchTo().alert().dismiss();
		//verify a text displayed under the button as: You pressed Cancel!
		msg = msgHolder.getText();
		Assert.assertEquals(msg, "You pressed Cancel!");
	}
	
	@Test
	public void clickOnAlert() throws InterruptedException {
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.findElement(By.xpath("//button[normalize-space()='Alert Box']")).click();
		
		
		Thread.sleep(2000);
		
		//here comes an alert, now click on OK button from alert
		driver.switchTo().alert().accept();
		
		
	}
	

}
