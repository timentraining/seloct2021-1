package com.automationpractice.tests.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests2 {

	public static void main(String[] args) {
		
		
		//Login with valid userid but invalid password
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//

		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		
		//Click Sign in button from top right corner of the page
		WebElement  signInButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		signInButton.click();
		
		//Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		WebElement emailAddressTextField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailAddressTextField.sendKeys("abc213@mailinator.com");
		
		//Enter invalid password 'myinvalidpwd' in password text field
		WebElement passwordTextField = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		passwordTextField.sendKeys("myinvalidpwd");
		
		
		//Click 'Sign in' button
		WebElement greenSignInButton = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		greenSignInButton.click();
		
		//Verify error message displayed 'There is 1 error'
		WebElement errgMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
		String msg = errgMsg.getText();
		System.out.println(msg);
		
		//Verify error message displayed 'Authentication failed.'
		errgMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
		msg =  errgMsg.getText();
		System.out.println(msg);

	}

}
