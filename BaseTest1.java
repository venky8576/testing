package com.WamikaTech_Functionaliy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.Before;

public class BaseTest1 {
	
	 public static WebDriver driver;
	 
	
	
	 @BeforeTest()
	 
	 public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver-win64/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://dev.wamikatech.com/");
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	 
	 @AfterTest()
	 
	 public void teardown() {
		 
		// driver.close();
	 }
	
	
	 
	

}
