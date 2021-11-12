package com.automationpractice.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.framework.UI;
import com.automationpractice.framework.WebDriverBase;

public class ScreenshotDemo extends WebDriverBase{
	
	@Test
	public void login() throws IOException {
		driver.get("http://www.automationpractice.com");
		WebElement  signInButton = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
		Actions actions = new Actions(driver);
		actions.click(signInButton).build().perform();
		WebElement emailAddressTextField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailAddressTextField.sendKeys("abc213dsds@mailinator.com");
		WebElement passwordTextField = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		passwordTextField.sendKeys("myinvalidpwd");
		WebElement greenSignInButton = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		greenSignInButton.click();
//		
		
		UI ui = new UI(driver);
		ui.takScreenshot();
		
	}

}
