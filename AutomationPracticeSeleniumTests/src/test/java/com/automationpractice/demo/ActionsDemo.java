package com.automationpractice.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.framework.WebDriverBase;

public class ActionsDemo extends WebDriverBase{
	
	
	@Test
	public void dragAndDrop() {
		
		driver.get("http://www.leafground.com/pages/drop.html");
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, target).build().perform();
		
	}
	
	
	@Test
	public void mouseHoverDemo() {
		
		driver.get("http://www.leafground.com/pages/mouseOver.html#");
		
		Actions actions = new Actions(driver);
		
		WebElement blueButton = driver.findElement(By.cssSelector(".btnMouse"));
		
		actions.moveToElement(blueButton).build().perform();
	
		
	}
	

}
