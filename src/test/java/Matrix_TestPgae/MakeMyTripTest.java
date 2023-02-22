package Matrix_TestPgae;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Matrix_Page.MakeMyTrip;

public class MakeMyTripTest extends MakeMyTrip{
	public MakeMyTripTest(WebDriver driver) {
		super(driver);
	}

	@Test
	public static void Running() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\MVNHybridgePro\\target\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		//MakeMyTrip ht = new MakeMyTrip (driver);
		//ht.getClass();
  }
}

