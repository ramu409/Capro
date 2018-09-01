package com.SmokeTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.CommonUtilities.CrossBrowser;

public class TC_Capro_admin_ForgotPasswordpage_valid_Data_Test {
WebDriver driver;
@Test
public void main() throws InterruptedException, IOException {
 driver=CrossBrowser.Browser("Firefox");
 driver.manage().window().maximize();
 TC_Capro_admin_ForgotPasswordpage_valid_Data main=new TC_Capro_admin_ForgotPasswordpage_valid_Data(driver);
 main.forgot1(driver);
}
}
