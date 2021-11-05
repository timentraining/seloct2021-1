package com.automationpractice.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo {
	
	@BeforeClass
	public void beforeTest() {
		System.err.println("Prepare webdrier");
	}
	
	@AfterClass
	public void afterTest() {
		System.err.println("Close the browser");
	}

	@Test
	public void testOne() {
		System.out.println("Test one is executing...");
	}

	@Test//This is an annotation for TestNG
	public void testTwo() {
		System.out.println("Test two is executing...");
	}
	@Test
	public void testThree() {
		System.out.println("Test three is executing...");
	}

	
	
}

//@Test = > This is test
//@BeforeMethod => TestNG will run this method before each test
//@AFTERMETHOD => TestNG will run this method after each test