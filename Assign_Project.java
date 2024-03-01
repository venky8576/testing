package com.WamikaTech_Functionaliy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assign_Project extends Basetest_login {
	
	
	@Test
	
	public void assign() {
	
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
	
	
	WebElement firstscroll=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollBy(0,500)", firstscroll);
	
	WebElement assignlocator=driver.findElement(By.linkText("Assign-Project"));
	
	assignlocator.click();
	
	WebElement employeeid=driver.findElement(By.name("employeeId"));
	
	
	employeeid.sendKeys("WT001");
	
	WebElement projectNameLocator=driver.findElement(By.name("projectName"));
	
	Select s2 = new Select(projectNameLocator);
	
	s2.selectByIndex(2);
	
	WebElement submitLocator=driver.findElement(By.xpath("//input[@value='Submit']"));
	
	submitLocator.click();
	
	}
	

}
