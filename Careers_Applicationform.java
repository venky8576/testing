package com.WamikaTech_Functionaliy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Careers_Applicationform {
	
	
WebDriver driver;
	
	@BeforeTest()
	 
	 public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://dev.wamikatech.com/");
		
	}
	
	@AfterTest()
	
	public void teardown() {
		
		
		
		
	}
	
	
	@Test()
	
	public void Test() throws InterruptedException, AWTException {
		
		// Identify the careers 
		//Careers
		Thread.sleep(1000);
		
		WebElement careers=driver.findElement(By.linkText("Careers"));
		
		careers.click();
		
		// Find jobs
		
		//Find Jobs
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/button")).click();
		
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div/p/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/button[1]")).click();
		
		driver.findElement(By.id("fullName")).sendKeys("Venkatesh.Thota");
		
		driver.findElement(By.id("phone")).sendKeys("9876537622");
		
		driver.findElement(By.id("email")).sendKeys("Ram@gmailcom");
		
		driver.findElement(By.id("relevantExperience")).sendKeys("2");
		
		driver.findElement(By.id("totalExperience")).sendKeys("2");
		
		driver.findElement(By.id("expectedCTC")).sendKeys("24,000");
		
		driver.findElement(By.id("currentCTC")).sendKeys("45,000");
		
		WebElement resumelocater=driver.findElement(By.id("resume"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();",resumelocater);
		
		Robot rb = new Robot();
		
		rb.delay(1000);
		
		StringSelection ss = new StringSelection("C:\\Users\\Dell\\Pictures\\Capture-Registration_page.PNG");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
	rb.keyPress(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_V);
		
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		rb.delay(2000);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
		
		
		
		
	}

}
