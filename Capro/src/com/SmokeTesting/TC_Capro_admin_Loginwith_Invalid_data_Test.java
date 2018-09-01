package com.SmokeTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.CommonUtilities.CrossBrowser;

public class TC_Capro_admin_Loginwith_Invalid_data_Test {
WebDriver driver;
@Test
public void main() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	driver=CrossBrowser.Browser("Firefox");
	driver.manage().window().maximize();
	TC_Capro_admin_Loginwith_Invalid_data main=new TC_Capro_admin_Loginwith_Invalid_data(driver);
	main.login(driver);
}
@AfterTest
public void after() {
	driver.close();
}
}
