package com.automationpractice.tests.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests2 {

	public static void main(String[] args) {
		
		
		//Login with valid userid but invalid password
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//

		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		
		//Click Sign in button from top right corner of the page
		WebElement  signInButton = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
//		signInButton.click();
		Actions actions = new Actions(driver);
		actions.click(signInButton).build().perform();
		
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
