package Qa_Matrix_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Qa_Pages.DoubleClickPage;

public class TestDoubleClick {
  
	@Test
	public static void name() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\MVNHybridgePro\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		DoubleClickPage dc = new DoubleClickPage(driver);
		dc.doubleClick();
  }
}
