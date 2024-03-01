package com.WamikaTech_Functionaliy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Docs_upload extends Basetest_login3 {

	
	@Test(description="Docs upload")
	
	public void docsupload() throws AWTException, InterruptedException {
		
		
		driver.findElement(By.id("userDropdown")).click();
		
		
		driver.findElement(By.linkText("Profile")).click();
		
		WebElement button_locater=driver.findElement(By.xpath("//button[@class='text-dark']"));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
		js1.executeScript("arguments[0].click();", button_locater);
		
		
		WebElement choosefile_locater=driver.findElement(By.xpath("//input[@type='file']"));
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		
		js2.executeScript("arguments[0].click();", choosefile_locater);
		
		Robot rb = new Robot();
		
		rb.delay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\Dell\\Pictures\\Capture-Registration_page.PNG");
		
		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
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
		
		WebElement upload_locater=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button"));
		
		upload_locater.click();
			
	}
	
	
	
}
