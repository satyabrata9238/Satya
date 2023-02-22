package Qa_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownPage {
   WebDriver driver;
   public DropDownPage(WebDriver driver)
   {
	   this.driver = driver;
   }
   By dropdown = By.xpath("//div[@class='widget-content']/select/option[2]");
   By dropdown1 = By.xpath("//select[@id='drop1']/option[3]");
   
   public void dropDown()
	{
		driver.findElement(dropdown).click();
		driver.findElement(dropdown1).click();
	}
}
