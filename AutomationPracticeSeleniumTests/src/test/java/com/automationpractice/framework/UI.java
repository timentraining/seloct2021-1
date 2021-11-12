package com.automationpractice.framework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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
	
	
	//CLICKING
	public void clickByXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public void clickById(String id) {
		driver.findElement(By.id(id)).click();
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
	

}
