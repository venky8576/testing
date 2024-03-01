package com.WamikaTech_Functionaliy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.NewBuild.BaseTest;

public class H_Elements {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
	
		
	// Identify the header block elements
	
			//Home
		
		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost:3000/hrDocs");
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement	Home=driver.findElement(By.linkText("Home"));
					
			Home.click();
					
			WebElement Aboutus=driver.findElement(By.linkText("About Us"));
					
			Aboutus.click();
					
			WebElement Contactus=driver.findElement(By.linkText("Contact Us"));
					
			Contactus.click();
			
			driver.findElement(By.id("name")).sendKeys("Thota.Venkatesh");
			
			driver.findElement(By.id("email")).sendKeys("1729venkat@gmail.com");
			
			driver.findElement(By.id("contact")).sendKeys("9847597390");
			
			driver.findElement(By.id("message")).sendKeys(" If any vaccencies are available");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,100)", "");
			
			WebElement contactus=driver.findElement(By.xpath("//button[@type='reset']"));
			
			contactus.click();
			
			driver.navigate().back();
			
			//driver.findElement(By.linkText("Clear")).click();
			
			System.out.println("Successfully Completed");
			
	}
			
	
	

}
