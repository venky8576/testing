package com.WamikaTech_Functionaliy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration_page {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost:3000/hrDocs");
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement login=driver.findElement(By.linkText("Login"));
		
		login.click();
		
		// Login button
	
		//Email
		
		WebElement email_locater=driver.findElement(By.xpath("//input[@name='email']"));
		
		email_locater.sendKeys("pnandyala@wamikatech.com");
		
		// Password
		
		WebElement password_locater=driver.findElement(By.xpath("//input[@name='password']"));
		
		password_locater.sendKeys("Prasanth@1");
		
		// Login Button
		
		WebElement loginbtn_locater=driver.findElement(By.xpath("//button[@type='submit']"));
		
		loginbtn_locater.click();
		
		
		
		// Registration 
		
		WebElement reg_locator=driver.findElement(By.linkText("Registration"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(reg_locator));
		
		clickableElement.click();
		
		System.out.println(clickableElement.getText());
		
		// Firstname
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Venkatesh");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Thota");
		
		driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("9849685699");
		
		WebElement joiningdate=driver.findElement(By.xpath("//input[@name='joiningDate']"));
		
		joiningdate.sendKeys("16-01-2024");
		
		driver.findElement(By.xpath("//input[@name='dateOfBirth']")).sendKeys("20-6-2002");
		
		driver.findElement(By.id("TextArea")).sendKeys("Andra Pradesh , Guntur(Dist), Rajupalem(m)");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, -250);");

		
		WebElement male=driver.findElement(By.id("Male"));
		
		Thread.sleep(1000);
		
		male.click();
		
		WebElement radiobtn=driver.findElement(By.id("Female"));
		
		radiobtn.click();
		
		if(radiobtn.isSelected())
			
			radiobtn.click();
		
		WebElement radiobtn1=driver.findElement(By.id("Others"));
		
		radiobtn1.click();
		
		if(radiobtn1.isSelected())
			
			radiobtn1.click();
		
		male.click();
		
		WebElement martial=driver.findElement(By.id("Married"));
		
		martial.click();
		
		if(martial.isSelected())
			
			martial.click();
		
		WebElement  martial1=driver.findElement(By.id("UnMarried"));
		
		martial1.click();
		
		if(martial1.isSelected())
			
			martial1.click();
		
		driver.findElement(By.xpath("//input[@ name='package']")).sendKeys("240000");
		
		WebElement RM_locater=driver.findElement(By.xpath("//select[@name='reportingManager']"));
		
		Select select = new Select(RM_locater);
		
		select.selectByIndex(1);
		
		WebElement Designation=driver.findElement(By.xpath("//select[@name='designation']"));
		
		Select select1 = new Select(Designation);
		
		select1.selectByIndex(1);
		
		//workType
		
		WebElement worktype=driver.findElement(By.xpath("//select[@name='workType']"));
		
		Select select2 = new Select(worktype);
		
		select2.selectByIndex(1);
		
		//status
	
		WebElement status=driver.findElement(By.xpath("//select[@name='status']"));
		
		Select select3 = new Select(status);
		
		select3.selectByIndex(1);
		
		List<WebElement >selectelements=driver.findElements(By.tagName("select"));
		
		for(WebElement count:selectelements) {
			
			
			Select select11 = new Select(count);
			
			select11.selectByIndex(1);
		}
		
		
		WebElement admin=driver.findElement(By.id("Employee"));
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(admin));
		
		// type="reset"
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		
		
		System.out.println("Registration Completed");
		
		
			
		
		
	}
	

}
