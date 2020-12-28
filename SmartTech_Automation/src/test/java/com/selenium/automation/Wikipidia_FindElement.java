package com.selenium.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wikipidia_FindElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("https://www.wikipedia.org/");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //WebElement element = driver.findElement(By.id("searchLanguage"));
    //Select se = new Select(element); // for DropDown
    //se.selectByValue("ast");
    //se.selectByIndex(1);
   // se.selectByVisibleText("Asturianu");
    
                //How to count valu
//    List<WebElement>li = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
//    int count = li.size();
//    System.out.println("Total Laguage: "+count);
    
             //How to print valu
//    WebElement element = driver.findElement(By.id("searchLanguage"));
//    Select se = new Select(element);
//    List<WebElement>list = se.getOptions();
//    for(int i = 0; i<list.size();i++) {
//    System.out.println(list.get(i).getText());
    
    //how to click valu
    List<WebElement>li = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));	
    	
    	for(int i = 0; i<li.size();i++) {
    		if(li.get(i).getText().equals("Français")){
    			System.out.println("Select number : "+i+" language :"+li.get(i).getAttribute("text"));
    			li.get(i).click();
    			break;
    		}
    	}
	//How to count and click total webelement link
    	
    List<WebElement>list = driver.findElements(By.xpath("//*[@class='other-project-link']"));
    System.out.println("Total webelement link count number :"+list.size());
    
    for(int i = 0; i < list.size();i++) {
    	if(i>7) {
    	System.out.println("Selected element number: "+i+" Name of the link: "+list.get(i).getAttribute("text"));
    	list.get(i).click();
    	break;
    	}
    }
	//How to put enter
    WebElement obj = driver.findElement(By.id("searchInput"));
    obj.sendKeys("Bangladesh");
    obj.sendKeys(Keys.ENTER);
    
	}

}
