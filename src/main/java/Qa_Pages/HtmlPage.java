package Qa_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HtmlPage {
   WebDriver driver; 
   public HtmlPage (WebDriver driver)
   {
	   this.driver=driver;
   }
   By html = By.xpath("//form[@name='form1']/input[1]");
   By html1 = By.xpath("//form[@name='form1']/input[2]");
   
   public void htmllogin()
   {
	   driver.findElement(html).sendKeys("Satya123");
	   driver.findElement(html1).sendKeys("9238");
   }
   
}
