package com.automationpractice.framework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UI {
	
	private WebDriver driver;
	
	public UI(WebDriver driver) {
		this.driver = driver;
	}
	
	//NAVIGATE
	
	public void openUrl(String url) {
		driver.get(url);
	}
	
	
	//FINDING ELEMENTS
	public WebElement findElementByClassName(String className) {
		WebElement e = driver.findElement(By.className(className));
		return e;
	}
	public WebElement findElementByXpath(String xpath) {
		WebElement e = driver.findElement(By.xpath(xpath));
		return e;
	}
	public WebElement findElementById(String id) {
		WebElement e = driver.findElement(By.id(id));
		return e;
	}
	
	
	
	
	//CLICKING
	public void click(By by) {
		driver.findElement(by).click();
	}
	
	public void clickByXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public void clickById(String id) {
		driver.findElement(By.id(id)).click();
	}
	public void clickByClass(String className) {
		driver.findElement(By.className(className)).click();
	}
	public void clickByJS(WebElement e) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguments[0].click();", e);
	}
	
	//SENDKEYS
	public void enterTextByXpath(String xpath, String text) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	public void enterTextById(String id, String text) {
		driver.findElement(By.id(id)).sendKeys(text);
	}
	
	public void enterTextByCssSelector(String css, String text) {
		driver.findElement(By.cssSelector(css)).sendKeys(text);
	}
	
	
	//GETTEXTS
	//
	
	//
	
	//
	
	//
	
	
	//EXPLICIT WAIT
	
	public void waitForAlertToBePresent(int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void waitForTextToBePresent(WebElement e) {
		//no code yet
	}
	
	public void waitForElementToBeEnabled(WebElement e) {
		//no code yet
	}
	public void waitForElementToBeClickable(WebElement e) {
		//no code yet
	}
	//
	//
	//
	
	
	
	//SCREENSHOTS
	public void takScreenshot() {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File file = sc.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshot/failure.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//JAVASCRIPT EXECUTION
	public void highlightAnElementByJS(WebElement e) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript(" arguments[0].style.border= 'solid 3px red'; ", e);
	}
	public void deHighlightAnElementByJS(WebElement e) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript(" arguments[0].style.border= 'solid 0px white'; ", e);
	}

	

}
