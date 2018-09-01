package com.SmokeTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.After;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.CommonUtilities.CrossBrowser;

public class TC_Capro_admin_Loginwith_valid_data_Test {
	WebDriver driver;
	@Test
	public void main() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		driver=CrossBrowser.Browser("Firefox");
//		Dimension d=new Dimension(200, 200);
//		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		TC_Capro_admin_Loginwith_valid_data sign=new TC_Capro_admin_Loginwith_valid_data(driver);
		sign.login(driver);
	}
//@AfterTest
//public void after() {
//	driver.close();
//}
}
