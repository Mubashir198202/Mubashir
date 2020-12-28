package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_3 {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.amazon.com/");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
	 driver.findElement(By.linkText("Sign in")).click();
	 driver.findElement(By.id("ap_email")).sendKeys("marupon76@gmail.com");
	 driver.findElement(By.id("continue")).click();
	 driver.findElement(By.id("ap_password")).sendKeys("Rupon123456");
	 driver.findElement(By.id("signInSubmit")).click();
	 System.out.println(driver.getTitle());

	}

}
