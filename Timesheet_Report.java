package com.WamikaTech_Functionaliy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Timesheet_Report extends Basetest_login {
	
	@Test
	
	public void sheetreport() {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        
        By toastLocator = By.className("Toastify__toast--success");
        
        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));

        // Get the text from the toast message
       String messageText = toastMessage.findElement(By.className("Toastify__toast-body")).getText();
       
        System.out.println("Toast Message: " + messageText);

        // Perform additional actions after accepting the toast message
        // For example, you can close the toast message by clicking a close button
        
        WebElement closeButton = toastMessage.findElement(By.className("Toastify__close-button"));
        closeButton.click();

        WebElement user=driver.findElement(By.cssSelector("  .link-styles "));
		
		user.click();
		
		driver.findElement(By.linkText("W-Employee")).click();
		
		//WebElement dashlocator=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]"));
		

		WebElement firstscroll = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollBy(0, 500);", firstscroll);
		
		driver.findElement(By.linkText("TimeSheet-Report")).click();
		
		WebElement reportlocator=driver.findElement(By.name("reportType"));
		
		Select select = new Select(reportlocator);
		
		select.selectByIndex(1);
		
		WebElement reportlocator1=driver.findElement(By.name("reportCategory"));
		
		Select select1= new Select(reportlocator1);
		
		select1.selectByIndex(1);
		
		
		WebElement reportlocator11=driver.findElement(By.name("selectedProject"));
		
		Select select11= new Select(reportlocator11);
		
		select11.selectByIndex(1);
		
		driver.findElement(By.linkText("Generate Report")).click();
		
		
		
	}
	

}
