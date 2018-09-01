package com.CommonUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CrossBrowser {
static WebDriver driver;
@Test
public static WebDriver Browser(String Browser){
	if(Browser.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.Chrome.Drive","F:/Testing all/selenium softwares/ChromeSetup.exe");
		driver=new ChromeDriver();
	
	}else if(Browser.equalsIgnoreCase("Firefox")){
		driver=new FirefoxDriver();
		
	}else{
		System.setProperty("webdriver.IE.Drive","");
		driver=new InternetExplorerDriver();
	}
	
	//d.get("http://192.168.2.2:8081/Medicenter/home");
	driver.manage().window().maximize();
	driver.get(com.Constant.URL.Path);
	return driver;
	
}

}
