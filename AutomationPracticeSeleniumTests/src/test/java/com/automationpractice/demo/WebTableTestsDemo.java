package com.automationpractice.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

public class WebTableTestsDemo extends WebDriverBase{
	
	
	
	
	@Test
	public void selecting_vital_task() {
		
		List<Integer> numbersToCompare = new ArrayList<Integer>();

		
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> progress_numbers = driver.findElements(By.xpath("//table/tbody//td[2]"));
		
		for(WebElement e: progress_numbers) {
//			System.out.println(e.getText());
		
			
			String val = e.getText();
			String percentageSignRemovedStr = val.replace("%", "");
//			System.out.println(percentageSignRemovedStr);
			int progress = Integer.parseInt(percentageSignRemovedStr);
			
			
			numbersToCompare.add(progress);
			
		}
	
		
		
		
		int smallestNumberIs = Collections.min(numbersToCompare);
		System.out.println("Smallest number is: "+ smallestNumberIs);
		
		WebElement expectedCheckbox = driver.findElement(By.xpath("//td[preceding-sibling::td[contains(text(),'"+smallestNumberIs+"%')]]/input"));
		expectedCheckbox.click();
		
		
	}

}
