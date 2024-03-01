package com.WamikaTech_Functionaliy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class W_Employee extends Basetest_login3  {
	
	@Test(description="Validating the Wamika Employee")
	
	public void employee() throws InterruptedException {
		
		// Apply Leave
		
		WebElement applayleave=driver.findElement(By.linkText("Apply Leave"));
		
		applayleave.click();
		
		
		WebElement availbalepl=driver.findElement(By.name("pl"));
		
		Select select = new Select(availbalepl);
		
		select.selectByIndex(4);
		
		Alert  alert = driver.switchTo().alert();
		
		alert.accept();
		
		driver.findElement(By.name("leaveReason")).sendKeys("Sick Leave");
		
		WebElement startdate=driver.findElement(By.name("startDate"));
		
		startdate.sendKeys("23-01-2024");
		
		WebElement fromdate=driver.findElement(By.cssSelector("[name='endDate']"));
		
		fromdate.click();
		
		//fromdate.sendKeys("24-01-2024");
		
		
		String desireDate = "2024-01-24";
		
		String script = "arguments[0].value = arguments[1]";
		
		((ChromeDriver) driver).executeScript(script, fromdate,desireDate);
		
		Thread.sleep(1000);
		
		WebElement submit=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[8]/div[2]/button"));
		
		//submit.click();
		
		//Previous Application
		
		WebElement previousapp=driver.findElement(By.linkText("Previous Application"));
		
		previousapp.click();
		
		//Approved Requests
		
		WebElement approvedrequest=driver.findElement(By.linkText("Approved Requests"));
		
		approvedrequest.click();
		
		//Pending Requests
		
		WebElement pendingrequest=driver.findElement(By.linkText("Pending Requests"));
		
		pendingrequest.click();
		
		//driver.findElement(By.name("comments")).sendKeys("Compalsary to attend");
		
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/form/div[10]/button[2]")).click();
		
		//WebElement rejected=driver.findElement(By.linkText("Rejected Requests"));
		
		//rejected.click();
		
		WebElement rejected=driver.findElement(By.linkText("Rejected Requests"));
		
		rejected.click();
		
		WebElement postjob=driver.findElement(By.linkText("Post a Job"));
		
		postjob.click();
		
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
			 
			 js1.executeScript("window.scrollBy(0,300)");
			 
		 driver.findElement(By.id("experience")).sendKeys("2");
		 
		 WebElement date=driver.findElement(By.id("datePosted"));
		
		 date.clear();
		 
		 date.sendKeys("13-01-2024");
		 
		WebElement  requiredskill=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[8]/div/div/div[1]/div[2]"));
		
		

		
		
	}
	
	

}
