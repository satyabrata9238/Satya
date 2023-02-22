package Qa_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickPage {
    WebDriver driver;
   
    public DoubleClickPage( WebDriver driver) { 
    	
    	this.driver= driver;
    }
    
    By doubleclick =  By.xpath("//div[@id=\"HTML46\"]/div[1]/button");    
    
    public void doubleClick()
	{
	WebElement ele = driver.findElement(doubleclick);
    Actions act = new Actions(driver);	
	act.doubleClick(ele).perform();
	}
}
