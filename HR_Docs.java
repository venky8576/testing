package com.WamikaTech_Functionaliy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HR_Docs extends Basetest_login {

	@Test(description="Validating the HR Document")
	
	public void hrdocs() {
		

		// User 
			
		WebElement users=driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/a/span"));
		
		users.click();
		
		// W_Employee
		
		WebElement wemployee=driver.findElement(By.linkText("W-Employee"));
		
		wemployee.click();
		
		// Docs 
		
		WebElement docslocater=driver.findElement(By.linkText("HR documents"));
		
		docslocater.click();
		
		// Identify the frame of docs
		
		// Identify the window id 
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println("Parent window id is " + parentwindow);
		
		WebElement dframe=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]"));
		
		By tag=By.tagName("a");
		
		List<WebElement >tagcount=dframe.findElements(tag);
		
		for(WebElement values:tagcount) {
			
			values.click();
			
			System.out.println(values.getText());
			
			driver.switchTo().window(parentwindow);
			
			int i=0;
			
			if(i==3) {
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				js.executeScript("window.scrollBy(0,400)", "");
				
				
			}
			
		}
		
		
		
		
		
		
		
		
	}
	
}
