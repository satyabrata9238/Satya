package Qa_Matrix_Test;

import org.testng.annotations.Test;

import Base.TestBase;
import Qa_Pages.AlertPage;

public class TestAlertPopup extends TestBase {
	
	@Test
	public static void name() {
		AlertPage altr = new AlertPage(driver);
		altr.clickAlertPopup();
	}
 }



