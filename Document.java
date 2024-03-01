package com.WamikaTech_Functionaliy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Document extends Basetest_login {

	
	
	@Test(priority=1,description="Validating the Document functionality")
	
	public void document() {
	
	
	// Document
	
	WebElement docs=driver.findElement(By.linkText("Documents"));
	
	docs.click();
	
	// Docs frame
	
	WebElement dframe=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]"));
	
	// Identify id of window
	
	String Parent_window=driver.getWindowHandle();
	
	System.out.println("Parent window id is " + Parent_window );
	
	// Identify the common property
	
	By tagnamelocater=By.className("docslink-style");
	
	List<WebElement >tagcount=dframe.findElements(tagnamelocater);
	
	for(WebElement values:tagcount) {
		
		System.out.println(values.getText());
		
		values.click();
		
		driver.switchTo().window(Parent_window);
	}
	
	System.out.println("Successfully Completed");
	
	
	
	
	
	
	
	
	
	}
	
}
