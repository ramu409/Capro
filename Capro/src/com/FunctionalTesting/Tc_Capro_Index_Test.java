package com.FunctionalTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.CommonUtilities.CrossBrowser;

public class Tc_Capro_Index_Test {
WebDriver driver;
@Test
public void main() throws InterruptedException {
	driver=CrossBrowser.Browser("Firefox");
	driver.manage().window().maximize();
	Tc_Capro_Index index=new Tc_Capro_Index(driver);
	index.Indexmain(driver);
}
}
