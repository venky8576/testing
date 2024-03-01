package com.WamikaTech_Functionaliy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Create_Account extends Basetest_login{

	
	@Test
	
	public void createaccount() {
		
		
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
		
		
		WebElement createprojectlocator=driver.findElement(By.linkText("Create-Project"));
		
		createprojectlocator.click();
		
		
		WebElement projectNameLocator=driver.findElement(By.name("projectName"));
		
		projectNameLocator.sendKeys("Testing");
		
		driver.findElement(By.name("projectId")).sendKeys("TS-001");
		
		driver.findElement(By.name("startDate")).sendKeys("01-02-2024");
		
		driver.findElement(By.name("endDate")).sendKeys("12-11-2026");
		
		WebElement managerLocator=driver.findElement(By.name("projectManager"));
		
		Select s1 = new Select(managerLocator);
		
		s1.selectByIndex(2);
		
		WebElement submitlocator=driver.findElement(By.xpath("//input[@value='Submit']"));
		
		submitlocator.click();
	
		
		
		
	}

	
}
