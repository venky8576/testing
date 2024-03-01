package com.WamikaTech_Functionaliy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Basetest_login3 {
	
	WebDriver driver;
	
	@BeforeTest()
	 
	 public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://dev.wamikatech.com/");
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement login=driver.findElement(By.linkText("Login"));
		
		login.click();
		
		// Login button

		//Emails
		
		WebElement email_locater=driver.findElement(By.xpath("//input[@name='email']"));
		
		email_locater.sendKeys("pnandyala@wamikatech.com");
		
		// Password
		
		WebElement password_locater=driver.findElement(By.xpath("//input[@name='password']"));
		
		password_locater.sendKeys("Prasanth@1");
		
		// Login Button
		
		WebElement loginbtn_locater=driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[1]"));
		
		loginbtn_locater.click();
		

		// User 
			
		WebElement users=driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/a/span"));
		
		users.click();
		
		// Profile
		//driver.findElement(By.linkText("Profile")).click();
		
		//W-Employee
		
		driver.findElement(By.linkText("W-Employee")).click();
		
		
	 }
	 
	 @AfterTest()
	 
	 public void teardown() {
		 
		// driver.close();
	 }
	

}
