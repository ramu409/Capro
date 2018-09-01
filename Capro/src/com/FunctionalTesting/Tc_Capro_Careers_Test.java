package com.FunctionalTesting;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.CommonUtilities.CrossBrowser;

public class Tc_Capro_Careers_Test {
	WebDriver driver;
	@Test
	public void main() {
		driver=CrossBrowser.Browser("Firefox");
//		Dimension d=new Dimension(100, 100);
//		driver.manage().window().setSize(d);
		Point p=new Point(100, 100);
		driver.manage().window().setPosition(p);

//		driver.manage().window().maximize();
		Tc_Capro_Careers jobs=new Tc_Capro_Careers(driver);
		jobs.career(driver);
	}

}
