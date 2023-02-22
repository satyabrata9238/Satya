package Qa_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextAreaPage {
    WebDriver driver;
    public TextAreaPage(WebDriver driver)
    {
    	this.driver = driver;
    }
    By textarea = By.xpath("//textarea[@id='ta1']");
    By textarea1 = By.xpath("//div[@id='HTML11']/div[1]/textarea");
    
    
    public void textarea()
	{
		driver.findElement(textarea).sendKeys("Cat");
		driver.findElement(textarea1).clear();
	}
}
