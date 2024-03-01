package com.WamikaTech_Functionaliy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.NewBuild.BaseTest;

public class Careers extends com.WamikaTech_Functionaliy.BaseTest1{
	
	
	

	
		
	@Test(priority=1,description="Validating the careers functionality")
	
	public void careers() throws InterruptedException {
		
	
	
	WebElement careers=driver.findElement(By.linkText("Careers"));
		
	careers.click();
	
	Thread.sleep(1000);

	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/input")).sendKeys("Python");

	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/input")).sendKeys("Hydrabad");
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/p")).click();

	}
	
}
