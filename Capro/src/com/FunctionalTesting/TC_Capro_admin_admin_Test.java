package com.FunctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.CommonUtilities.CrossBrowser;

public class TC_Capro_admin_admin_Test {
WebDriver driver;
@Test
public void main() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
	driver=CrossBrowser.Browser("firefox");
	driver.manage().window().maximize();
	TC_Capro_admin_admin manu=new TC_Capro_admin_admin(driver);
	manu.login(driver);
	manu.admin(driver);
}
}
