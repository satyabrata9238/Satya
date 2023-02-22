package Matrix_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakeMyTrip {
	WebDriver driver;
	 public MakeMyTrip(WebDriver driver) {
	}  
	By MakeMy = By.xpath("//ul[@class='makeFlex font12']/li[1]");
	
	public void Make()
	{
		String str = driver.findElement(MakeMy).getText();
		System.out.println(str);
	}
}
