package com.selenium.automation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginTest {
  
	WebDriver driver;
	
  public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();	//up casting
        driver.get("https://www.zoopla.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("signin_email")).sendKeys("marupon76@gmail.com");
        driver.findElement(By.id("signin_password")).sendKeys("Rupon123456");
        driver.findElement(By.id("signin_submit")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("search-input-location")).sendKeys("New York,Lincolnshire");
        driver.findElement(By.id("search-submit")).click();
        //Different xpath for printAllprice=//*[contains(@class,'css-qmlb99-CardHeader e2uk8e9')]
        List <WebElement> list = driver.findElements(By.xpath("//*[contains(@class,'css-1e28vvi-PriceContainer e2uk8e8')]"));
    	System.out.println("Total property count num :" + list.size());
    	for(WebElement select : list) {
    		String listPrice = select.getText();
    		System.out.println("All the property prices :" +listPrice);
    		//Collections.sort(listPrice,Collections.reverseOrder());	
    		//Collections.sort(listPrice);
    		//Comparator<WebElement> c = Collections.sort(listPrice,Collections.reverseOrder());
    		}
  System.out.println("Fifth property price : " +list.get(3).getText());
	List<WebElement>li = driver.findElements(By.xpath("//*[@class='e2uk8e4 css-16zqmgg-StyledLink-Link-FullCardLink e33dvwd0']"));
			for(int i =0; i<li.size();i++) {
				if(i>3) {
					System.out.println("Selected property detail : "+li.get(i).getText());
					System.out.println("Selected property detail : "+li.get(i).getAttribute("text"));
					li.get(i).click();
					break;
				}} 
  
  
       
       WebElement ImageFile = driver.findElement(By.xpath("(//*[contains(@class,'js-lazy-loaded')])[1]"));
//    // System.out.println("Verify the logo: "+ImageFile.getText());
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Not verify the logo");
        }
        else
        {
            System.out.println("verify the logo");
        }
       
        System.out.println("Agent Name : "+driver.findElement(By.xpath("(//*[text()='Hunters - Horncastle'])[1]")).getText());
        System.out.println("Agent Telephone Number : "+driver.findElement(By.xpath("(//*[contains(@href,'tel:01507311331')])[1]")).getText());
       //String Text= driver.findElement(By.xpath("(//*[text()='Longsons Premier Stock'])[1]")).getText();
      // System.out.println("Agent name :" + Text);
        //String Text2= driver.findElement(By.xpath("//*[@data-track-label='Agent phone number 1']")).getText();
        //System.out.println("Agent phone number :" + Text2);
       // System.out.println(driver.getTitle());
       
       

    	
    	
    	
    	Actions action = new Actions(driver);
    	WebElement mousehover = driver.findElement(By.xpath("(//*[@class='css-jm7194 el4rvi44'])[1]"));
    	action.moveToElement(mousehover).build().perform();
    	
    	Actions ac = new Actions(driver);
    	WebElement mouse = driver.findElement(By.xpath("(//*[@content='Sign out'])[1]"));
    	ac.moveToElement(mouse);
    	ac.click().build().perform();
	}
}
