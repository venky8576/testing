package com.WamikaTech_Functionaliy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Payslips extends Basetest_login{

	
	@Test(description="Validating the payslips functionality")
	
	public void payslip() {
		
		//Payslips
		
		WebElement payslip=driver.findElement(By.linkText("Payslips"));
		
		payslip.click();
		
		// Month 
		
		WebElement monthlocater=driver.findElement(By.name("month")); 
				
		Select select4 = new Select(monthlocater);
				
		select4.selectByIndex(12);
				
		// Year
				
		WebElement yearlocater=driver.findElement(By.name("year"));
				
		Select s1 = new Select(yearlocater);
				
		s1.selectByVisibleText("2023");
				
		// Login 
				
		WebElement login=driver.findElement(By.xpath("//input[@value='Submit']"));
				
		login.click();
		
		
		
		// Tap to view
		
		WebElement tapview=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/a/p"));
		
		tapview.click();
		

		
		// Window Handle
		
		String Parent_window=driver.getWindowHandle();
		
		System.out.println("Parent window id is " + Parent_window );
		
		//driver.switchTo().window(Parent_window);
		
		
		
		
	}
	
}
