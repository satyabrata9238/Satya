package Qa_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AlertPage {
	WebDriver driver;
	 public AlertPage (WebDriver driver)
	   {
		   this.driver=driver;
	   }
	By alert = By.xpath("//input[@id='alert1']");
	
	
	public void clickAlertPopup()
	{
		driver.findElement(alert).click();
	}
}
