package com.automationpractice.tests.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement loginEmailAddressTextField;
	
	@FindBy(id = "passwd")
	private WebElement passwordTextField;
	
	@FindBy(id = "SubmitLogin")
	private WebElement loginButton;
	
	@FindBy(className = "alert-danger")
	private WebElement errorMessage;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void login(String userid, String pwd) {
		loginEmailAddressTextField.sendKeys(userid);
		passwordTextField.sendKeys(pwd);
		loginButton.click();
	}
	
	
	public void enterEmail(String email) {
		loginEmailAddressTextField.sendKeys(email);
	}
	public void clickButton() {
		loginButton.click();
	}
	public String getErrorMessages() {
		return errorMessage.getText();
	}


}
