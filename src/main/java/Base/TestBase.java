package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	public static WebDriver driver;
	
	@BeforeClass
	public static void initialization() {
	System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\MVNHybridgePro\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	}
	@AfterClass
	public static void finish() {
		driver.quit();
	}
}