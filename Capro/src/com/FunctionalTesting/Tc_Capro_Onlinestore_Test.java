package com.FunctionalTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.CommonUtilities.CrossBrowser;

public class Tc_Capro_Onlinestore_Test {
	WebDriver driver;
	@Test
	public void main() throws InterruptedException, IOException {
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		Tc_Capro_Onlinestore store=new Tc_Capro_Onlinestore(driver);
		store.onlinestore(driver);
	}

}
