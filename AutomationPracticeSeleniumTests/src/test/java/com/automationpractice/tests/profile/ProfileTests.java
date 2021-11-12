package com.automationpractice.tests.profile;

import org.testng.annotations.Test;

import com.automationpractice.framework.UI;
import com.automationpractice.framework.WebDriverBase;

public class ProfileTests extends WebDriverBase{
	
	@Test
	public void Create_and_delete_Wish_List() {
		
		UI ui = new UI(driver);

		
//		Go to http://www.automationpractice.com
		ui.openUrl("http://www.automationpractice.com");
		
//		Click Sign in button from top right corner of the page
		ui.clickByXpath("//a[@title='Log in to your customer account']");
		
//		Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		ui.enterTextById("email", "abc213@mailinator.com");
		
//		Enter valid password 'abc1234' in password text field
		ui.enterTextById("passwd", "abc1234");
		
		ui.takScreenshot();
		
		
		
//		Click 'Sign in' button
		ui.clickById("SubmitLogin");
		
//		Click MY WISH LISTS button
		ui.clickByXpath("//span[normalize-space()='My wishlists']");
		
//		Enter 'My Winter Shopping' in name test field
		ui.enterTextById("name", "My Winter Shopping");
		
		
		
		//explicit wait
		ui.waitForAlertToBePresent(10);
		
		
//		Click Save button
		ui.clickById("submitWishlist");
		
//		Verify new wish list created with name = 'My Winter Shopping', Qty=0, Viewed=0, Created=today's date, Direct Link = View
//		Delete the created wish list item
//		Click OK from the alert popup
//		Verify wishlist item is removed
			
			
	}
	
	@Test
	public void Update_name_in_User_Profile() {
	System.out.println("update profile test running");
	//Go to http://www.automationpractice.com
	driver.get("http://www.automationpractice.com");
//							Click Sign in button from top right corner of the page
//							Enter valid email address 'abc213@mailinator.com' in email address text field of right side
//							Enter valid password 'abc1234' in password text field
//							Click 'Sign in' button
//							Click on name 'Misir Ali' from top right corner
//							Click on button 'MY PERSONAL INFORMATION'
//							Verify text displayed 'Please be sure to update your personal information if it has changed.'
//							Enter new first name as 'Hanif'
//							Enter new last name as 'Shanket'
//							Click 'Save' button
//							Verify error message displayed 'There is 1 error'
//							Verify error message displayed 'The password you entered is incorrect'
//							Enter current password 'abc1234' in password text field
//							Click 'Save' button
//							Verify success message displayed 'Your personal information has been successfully updated.'
//							Click on name 'Hanif Shanket' from top right corner
//							Click on button 'MY PERSONAL INFORMATION'
//							Verify text displayed 'Please be sure to update your personal information if it has changed.'
//							Enter first name back as 'Misir'
//							Enter last name back as 'Ali'
//							Click 'Save' button
//							Enter current password 'abc1234' in password text field
//							Click 'Save' button
//							Verify success message displayed 'Your personal information has been successfully updated.'
		
	}
	

	@Test
	public void Change_password() {
		System.out.println("change password test running");
		
		//			Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		//			Click Sign in button from top right corner of the page
		//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		//			Enter valid password 'abc1234' in password text field
		//			Click 'Sign in' button
		//			Click on name 'Misir Ali' from top right corner
		//			Click on button 'MY PERSONAL INFORMATION'
		//			Enter current password as 'abc1234'
		//			Enter new password as 'xyz1234' in new password text field
		//			Click 'Save' button
		//			Verify error message displayed 'There is 1 error'
		//			Verify error message displayed 'The password and confirmation do not match.'
		//			Enter new password as 'xyz1234' in new password text field
		//			Enter same password 'xyz1234' in confirmation text field
		//			Click 'Save' button
		//			Verify success message displayed 'Your personal information has been successfully updated.'
		//			Click on name 'Misir Ali' from top right corner
		//			Click on button 'MY PERSONAL INFORMATION'
		//			Enter current password as 'xyz1234'
		//			Enter new password as 'abc1234' in new password text field
		//			Enter same password 'abc1234' in confirmation text field
		//			Click 'Save' button
		//			Verify success message displayed 'Your personal information has been successfully updated.'
		
	}
	
	@Test
	public void Create_and_delete_Wish_List2() {
		System.out.println("create and delete wish list test running");
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
//			Enter valid password 'abc1234' in password text field
//			Click 'Sign in' button
//			Click MY WISH LISTS button
//			Enter 'My Winter Shopping' in name test field
//			Click Save button
//			Verify new wish list created with name = 'My Winter Shopping', Qty=0, Viewed=0, Created=today's date, Direct Link = View
//			Delete the created wish list item
//			Click OK from the alert popup
//			Verify wishlist item is removed
		
	}
	
	

}



