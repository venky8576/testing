package com.WamikaTech_Functionaliy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Get_postedjob {

	WebDriver driver;

	@Test()

	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://dev.wamikatech.com/");

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

		// User

		WebElement users = driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/a/span"));

		users.click();

		// W-Employee

		Thread.sleep(1000);

		driver.findElement(By.linkText("W-Employee")).click();

		Thread.sleep(1000);

		WebElement firstscroll = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollBy(0, 200);", firstscroll);

		Thread.sleep(1000);

		driver.findElement(By.linkText("Get Posted Jobs")).click();

		String parentwindow = driver.getWindowHandle();

		System.out.println(parentwindow);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/table/tr[2]/td[4]/button")).click();

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/ul/div[1]/button")).click();

		driver.switchTo().window(parentwindow);

		driver.findElement(By.tagName("p")).click();

	}

}
