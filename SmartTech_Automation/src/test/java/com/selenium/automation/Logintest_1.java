package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logintest_1 {
    static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\marup\\eclipse-workspace\\SmartTech_Automation\\Driver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.ups.com/us/en/Home.page");
      driver.manage().window().maximize();
      //driver.findElement(By.xpath("(//a[@class='ups-analytics'])[6]")).click();
      driver.findElement(By.xpath("//li[@class='ups-loginsignup ups-firstnav ']")).click();
     // driver.findElement(By.xpath("//span[@class='icon ups-icon-x']")).click();
      driver.findElement(By.xpath("//a[@class='ups-link']")).click();
      driver.manage().deleteAllCookies();
      driver.findElement(By.id("email")).sendKeys("MubashirAhmed");
      driver.findElement(By.id("pwd")).sendKeys("Rupon123456");
      driver.findElement(By.id("submitBtn")).click();
      System.out.println(driver.getTitle());
	}

}
