package com.automationpractice.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

public class FileUploadDemo extends WebDriverBase{
	
	
	@Test
	public void uploadFileByDriver() {
		
		
		
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement fileuploadelement = driver.findElement(By.name("filename"));
		fileuploadelement.sendKeys("/Users/rkreja/Desktop/TnT Live Session/download.png");
	}
	
	

}
