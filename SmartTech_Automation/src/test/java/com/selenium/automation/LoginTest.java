package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marup\\eclipse-workspace\\SmartTech_Automation\\Driver\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();	
        driver.get("https://www.zoopla.co.uk/");
        driver.manage().window().maximize();
        
        
        
        driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("signin_email")).sendKeys("marupon76@gmail.com");
        driver.findElement(By.id("signin_password")).sendKeys("Rupon123456");
        driver.findElement(By.id("signin_submit")).click();
        System.out.println(driver.getTitle());
        
        
        
        
        
	}

}
