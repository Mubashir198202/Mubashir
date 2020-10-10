package com.selenium.automation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginTest_2 {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
	
    System.setProperty("webdriver.gecko.driver","C:\\Users\\marup\\eclipse-workspace\\SmartTech_Automation\\Driver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver(); 
    driver.get("https://search.yahoo.com/search?fr=mcafee&type=E211US714G0&p=youtube.com");
    driver.manage().window().maximize();
		
		
	}

}
