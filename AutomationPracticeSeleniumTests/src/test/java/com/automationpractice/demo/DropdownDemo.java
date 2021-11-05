package com.automationpractice.demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

public class DropdownDemo extends WebDriverBase{
	
	@Test
	public void print_all_state_names_from_a_dropdown() {
	
		driver.get("http://automationpractice.com");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("abc42345@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		
		//Convert this to explicit wait
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		WebElement dropdown = driver.findElement(By.id("id_state"));
		Select select = new Select(dropdown);
		
		List<WebElement> alloptions = select.getOptions();
		
		System.out.println(alloptions.size());
		
		for (int i = 0; i < alloptions.size(); i++) {
			WebElement e = alloptions.get(i);
			System.out.println(e.getText());
			
		}
	
	}
	
	
	
	@Test
	public void selectingDropDownValue__1() {
		//go to this site: http://www.leafground.com/pages/Dropdown.html
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//select 'Appium' from the first drodown
		WebElement firstDropDown = driver.findElement(By.id("dropdown1"));
		Select select = new Select(firstDropDown);
		select.selectByVisibleText("Loadrunner");
	}
	

}
