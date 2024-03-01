package com.WamikaTech_Functionaliy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timesheet {

	static WebDriver driver;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://dev.wamikatech.com/");

		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement login = driver.findElement(By.linkText("Login"));

		login.click();

		// Login button

		// Emails

		WebElement email_locater = driver.findElement(By.xpath("//input[@name='email']"));

		email_locater.sendKeys("pnandyala@wamikatech.com");

		// Password

		WebElement password_locater = driver.findElement(By.xpath("//input[@name='password']"));

		password_locater.sendKeys("Prasanth@1");

		// Login Button

		WebElement loginbtn_locater = driver.findElement(By.xpath("//button[@type='submit']"));

		loginbtn_locater.click();

		Thread.sleep(1000);

		// Wait for the success toast message to appear
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

		WebElement user = driver.findElement(By.cssSelector("  .link-styles "));

		user.click();

		driver.findElement(By.linkText("W-Employee")).click();

		driver.findElement(By.linkText("Timesheet")).click();

		WebElement date = driver.findElement(By.xpath("//input[@type='text']"));

		Thread.sleep(2000);

		// date.click();

		// WebElement
		// calander=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[5]"));

		// calander.click();
		List<WebElement> tdElements = driver
				.findElements(By.cssSelector("td.clickable-space.border-end.border-start.border-dark"));

		// Iterate through the elements excluding the first and last
		for (int i = 1; i < tdElements.size() - 1; i++) {
			WebElement tdElement = tdElements.get(i);

			// Check if the element is enabled before clicking
			if (tdElement.isEnabled()) {
				// Perform any additional actions needed
				// ...

				// Click on the element
				tdElement.click();

				WebElement projectlocator = driver.findElement(By.xpath("//select[@name='project']"));

				Select select = new Select(projectlocator);

				select.selectByIndex(2);

				driver.findElement(By.xpath("//input[@name='duration']")).sendKeys("8");

				driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button[2]")).click();

			} else {
				System.out.println("Element is disabled: " + i);
			}

		}

	}

}
