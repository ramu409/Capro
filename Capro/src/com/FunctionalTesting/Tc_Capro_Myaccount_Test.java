package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.CommonUtilities.CrossBrowser;

public class Tc_Capro_Myaccount_Test {
WebDriver driver;
@Test
public void main() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
	driver=CrossBrowser.Browser("Firefox");
	driver.manage().window().maximize();
	Tc_Capro_Myaccount account=new Tc_Capro_Myaccount(driver);
	account.login(driver);
	
//	account.myaccount(driver);
}
}
