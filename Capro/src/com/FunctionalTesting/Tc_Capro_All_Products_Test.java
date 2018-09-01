package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.CommonUtilities.CrossBrowser;

public class Tc_Capro_All_Products_Test {
	WebDriver driver;
	@Test
	public void product() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		driver=CrossBrowser.Browser("Firefox");
		driver.manage().window().maximize();
		Tc_Capro_All_Products all=new Tc_Capro_All_Products(driver);
	
		all.login(driver);
		all.allproduct(driver);
	}

}
