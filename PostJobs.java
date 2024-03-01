package com.WamikaTech_Functionaliy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PostJobs extends Basetest_login3 {
	
	
	@Test(description="Validating the post jobs")
	
	public void postjobs() {
		
		WebElement pjob=driver.findElement(By.linkText("Post a Job"));
		
		pjob.click();
		 
		 driver.findElement(By.id("jobTitle")).sendKeys("Software Testing");
		 
		 driver.findElement(By.id("jobDescription")).sendKeys("Manual Testing"
		 		+ "Automation Testing");
		 driver.findElement(By.id("numberOfPositions")).sendKeys("5");
		 
		 driver.findElement(By.id("qualifications")).sendKeys("B.tech"
		 		+ "M.tech"
		 		+ "Any Graduate");
		 
		 driver.findElement(By.id("responsibilities")).sendKeys("1.Requirment Analasis"
		 		+ "2.Test Planning"
		 		+ "3.Test Execution"
		 		+ "4.Defect Reporting");
		 

			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 
			 js1.executeScript("window.scrollBy(0,1000)");
			 
		 driver.findElement(By.id("experience")).sendKeys("2");
		 
		 WebElement date=driver.findElement(By.id("datePosted"));
		
		 date.clear();
		 
		 date.sendKeys("13-01-2024");
		 
		 // Locate the custom dropdown element by its class name
	      //  WebElement dropdownElement = driver.findElement(By.className("css-qbdosj-Input"));
	        
	       // dropdownElement.click();

	        // Click on the dropdown to open it
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		 //WebElement inputElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-5-input")));
		 
		// inputElement.click();

		 
		 WebElement location=driver.findElement(By.id("location"));
		 
		 location.sendKeys("Hydrabad");
		 
		 WebElement clear=driver.findElement(By.xpath("//input[@value='Clear']"));
		 
		 clear.click();
		 
		 
	}

}
