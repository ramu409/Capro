package com.FunctionalTesting;

import java.io.IOException;

import org.jboss.netty.util.VirtualExecutorService;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CommonUtilities.ScreenShot;

public class Tc_Capro_Products_At_Glance {
WebDriver driver;
@FindBy(xpath=".//*[@id='menuzord']/ul/li[3]/a")
WebElement Product;
@FindBy(xpath=".//*[@id='menuzord']/ul/li[3]/ul/li[1]/a")
WebElement Productsat;
@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/a")
WebElement view1;
@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div/div/div/div/div/div[2]/div/div[2]/div/a")
WebElement view2;
@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div/div/div/div/div/div[3]/div/div[2]/div/a")
WebElement view3;
@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div/div/div/div/div/div[4]/div/div[2]/div/a")
WebElement view4;
@FindBy(xpath=".//*[@id='products_search']")
WebElement Productname;
@FindBy(xpath=".//*[@id='search-members-form']/div/span/button")
WebElement Serch;
public Tc_Capro_Products_At_Glance(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void productmain(WebDriver driver) throws InterruptedException, IOException {
	Product.click();
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.moveToElement(Productsat).click().build().perform();
	ScreenShot.main(driver, "Tc_Capro_Products_At_Glance");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)","");
	view1.click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	Product.click();
	Thread.sleep(2000);
//	a.moveToElement(Productsat).click().build().perform();
	js.executeScript("window.scrollBy(0,100)","");
	view2.click();
	driver.navigate().back();
	view3.click();
	driver.navigate().back();
	view4.click();
	driver.navigate().back();
	Productname.sendKeys("abcap capsule");
	Serch.click();
	
	
	
}
}
