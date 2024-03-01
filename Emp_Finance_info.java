package com.WamikaTech_Functionaliy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Emp_Finance_info extends Basetest_login {
	
	@Test(description="Verifying the Emp_Finance")
	
	public void finance() {
		
		// Emp Finance-Info
		
		WebElement emp=driver.findElement(By.linkText("Emp Finance-Info"));
		
		emp.click();
	}
	

}
