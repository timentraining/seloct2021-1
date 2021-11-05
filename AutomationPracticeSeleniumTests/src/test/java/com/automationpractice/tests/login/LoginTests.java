package com.automationpractice.tests.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests extends WebDriverBase{

	
	
	@Test
	public void countCorrectNumberOfTextBoxInSignInPage() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Go to http://www.automationpractice.com
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		int totalTextField = driver.findElements(By.xpath("//input[@type='text']")).size();
		Assert.assertEquals(totalTextField, 4);
		
	}
	
	
	@Test
	public void checkContactUsButtonExist() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		
		WebElement contactUsButton =  driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
		String str = contactUsButton.getText();
		System.out.println(str);
		
		
		Assert.assertEquals(str, "ContactUs");
		
		
	}
	
	@Test
	public void countHomePageLink() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		
		int totalLink  = driver.findElements(By.tagName("a")).size();
		
		Assert.assertEquals(totalLink, 182);
		
	}
	
	
	
	
	
	
	@Test
	public void Login_with_invalid_userid() {
		
		//TC001 : Login with invalid userid
		
		

				
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
				
				WebElement errMsgHolder = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
				
				String e1 = errMsgHolder.getText();
							
				
				System.out.println("**********\n  text retrived from error msg element is: " +  e1 +  " \n**********");
				
							
				Assert.assertEquals(e1, "There is 1 error");
				
				//Verify error message displayed 'Password is required.'
				
//				errMsg1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
//				e1 = errMsg1.getText();
//				System.out.println(e1);
		
	}


}
