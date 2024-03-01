package com.WamikaTech_Functionaliy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://dev.wamikatech.com/");

		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement login = driver.findElement(By.linkText("Login"));

		login.click();

		// Login button

		// Email

		WebElement email_locater = driver.findElement(By.xpath("//input[@name='email']"));

		email_locater.sendKeys("pnandyala@wamikatech.com");

		// Password

		WebElement password_locater = driver.findElement(By.xpath("//input[@name='password']"));

		password_locater.sendKeys("Prasanth@1");

		// Login Button

		WebElement loginbtn_locater = driver.findElement(By.xpath("//button[@type='submit']"));

		loginbtn_locater.click();

		WebElement users = driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/a/span"));

		users.click();

		driver.findElement(By.linkText("Profile")).click();

		WebElement profileframe = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]"));

		Thread.sleep(1000);

		List<WebElement> profilecount = profileframe.findElements(By.cssSelector("a"));

		for (WebElement pvalue : profilecount) {

			System.out.println(pvalue.getText());

			pvalue.click();
		}
	}

}
