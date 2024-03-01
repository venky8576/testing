package com.WamikaTech_Functionaliy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Logout extends BaseTest1 {
	
	
	@Test(description="Logoufunctionality")
	
	public void logout() {
		
		
		WebElement login=driver.findElement(By.linkText("Login"));
		
		login.click();
		
		// Login button

		//Emails
		
		WebElement email_locater=driver.findElement(By.xpath("//input[@name='email']"));
		
		email_locater.sendKeys("pnandyala@wamikatech.com");
		
		// Password
		
		WebElement password_locater=driver.findElement(By.xpath("//input[@name='password']"));
		
		password_locater.sendKeys("Prasanth@1");
		
		// Login Button
		
		WebElement loginbtn_locater=driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[1]"));
		
		loginbtn_locater.click();
		
		
		// User 
		
		WebElement users=driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/a/span"));
				
		users.click();
		
		
		//Logout
		
		WebElement logout=driver.findElement(By.linkText("Logout"));
		
		logout.click();
		
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
	}
	

}
