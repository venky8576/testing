package com.WamikaTech_Functionaliy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Status_Revoke extends Basetest_login {
	
	@Test(description="Verifying the employeeid")
	
	public void status() {
		
		//Status-Revoke
		
		WebElement revoke=driver.findElement(By.linkText("Status-Revoke"));
		
		revoke.click();
		
		//employeeId
		
		WebElement status=driver.findElement(By.id("employeeId"));
		
		status.sendKeys("WT002");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/button[1]")).click();
		
		
		
	}

}
