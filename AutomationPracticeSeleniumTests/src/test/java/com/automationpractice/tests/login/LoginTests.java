package com.automationpractice.tests.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests {

	public static void main(String[] args) {
		
		//TC001 : Login with invalid userid
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		//Click Sign in button from top right corner of the page
		WebElement signInButton  = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		signInButton.click();
		
		//Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
		WebElement emailAddressTextBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailAddressTextBox.sendKeys("myunknowxaad@mailinator.com");
		
		//Click Sign in button
		signInButton = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		signInButton.click();
		
		//Verify error message displayed 'There is 1 error'
		WebElement errMsg1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
		String e1 = errMsg1.getText();
		System.out.println(e1);
		
		//Verify error message displayed 'Password is required.'
		
		errMsg1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
		e1 = errMsg1.getText();
		System.out.println(e1);
		
		
		

	}

}
