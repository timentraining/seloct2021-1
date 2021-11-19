package com.automationpractice.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider(name = "getUserData")
	public String[][] getUserData() {
		
		String[][] data = new String[][] {
			{"John","Smith","jsmith@gmail.com","7037037033","123 abc street"},
			{"Mary","Jane","mjane@gmail.com","5715715711","909 noway ave"},
			{"Test","User","test@example.com","6567677766","9 no blvd"},
			{"Mamun","Ahmed","mahmed@yahoo.com","9179179177","101 park ave, ny"},
		};
		return data;
	}
	

	
	@Test(dataProvider = "getUserData")
	public void registerAuser(String fn, String ln, String email, int phn, String add ) {
		
		System.out.println("lanuched application");
		System.out.println("go to registration page");
		System.out.println("enter firstname: " + fn);
		System.out.println("enter lastname: "+ ln);
		System.out.println("enter email:" + email);
		System.out.println("enter phone number:" + phn);
		System.out.println("enter address: "+ add);
		System.out.println("click submit button");
		System.out.println("user created with userid as: "+email);

	}
	

}
