package com.automationpractice.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.framework.UI;
import com.automationpractice.framework.WebDriverBase;

public class JavaScriptExecutor extends WebDriverBase{
	
	
	
	@Test

	public void highlightAnElement() throws InterruptedException {
		UI ui = new UI(driver);
		
		//lanuch application
		ui.openUrl("http://automationpractice.com/");
		
		//highlight signin button
		WebElement signInButton = ui.findElementByClassName("login");
		
		ui.highlightAnElementByJS(signInButton);
		Thread.sleep(1000);
		ui.deHighlightAnElementByJS(signInButton);
		
		//click Sign In Button by  JavaSsript
		ui.clickByJS(signInButton);
		
		//now click on Create account button by JavaScript
		ui.clickByJS(ui.findElementById("SubmitCreate"));
		
		
	}

}
