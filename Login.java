package com.WamikaTech_Functionaliy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost:3000/hrDocs");
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement login=driver.findElement(By.linkText("Login"));
		
		login.click();
		
		// Login button
	
		//Email
		
		WebElement email_locater=driver.findElement(By.xpath("//input[@name='email']"));
		
		email_locater.sendKeys("pnandyala@wamikatech.com");
		
		// Password
		
		WebElement password_locater=driver.findElement(By.xpath("//input[@name='password']"));
		
		password_locater.sendKeys("Prasanth@1");
		
		// Login Button
		
		WebElement loginbtn_locater=driver.findElement(By.xpath("//button[@type='submit']"));
		
		loginbtn_locater.click();
		
		
		

		
	}

}
