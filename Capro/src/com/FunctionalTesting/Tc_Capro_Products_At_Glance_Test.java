package com.FunctionalTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.CommonUtilities.CrossBrowser;

public class Tc_Capro_Products_At_Glance_Test {
	WebDriver driver;
	@Test
	public void main() throws InterruptedException, IOException {
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		Tc_Capro_Products_At_Glance productat=new Tc_Capro_Products_At_Glance(driver);
		productat.productmain(driver);
	}

}
