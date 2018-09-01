package com.FunctionalTesting;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CommonUtilities.ScreenShot;

public class Tc_Capro_Onlinestore {
	WebDriver driver;
	@FindBy(xpath=".//*[@id='menuzord']/ul/li[9]/a")
	WebElement online;
	@FindBy(xpath=".//*[@id='productsdata']/li[1]/a")
	WebElement  abcap;
	@FindBy(xpath=".//*[@id='productsdata']/li[2]/a")
	WebElement arjit;
	@FindBy(xpath=".//*[@id='productsdata']/li[3]/a")
	WebElement broncap;
	@FindBy(xpath=".//*[@id='productsdata']/li[4]/a")
	WebElement Lucatone;
	@FindBy(xpath=".//*[@id='prescription_check']")
	WebElement upload;
	@FindBy(xpath=".//*[@id='add_to_cart']")
	WebElement addtocard;
	@FindBy(xpath=".//*[@id='buy_now']")
	WebElement buynow;
	@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div/div/div[1]/div[2]/div/div[3]/form/table/tbody/tr/td[2]/div/input[3]")
	WebElement Qulaityincr;
	@FindBy(xpath=".//*[@id='header']/div[5]/section[2]/div/div/div/div[1]/div[2]/div/div[3]/form/table/tbody/tr/td[2]/div/input[1]")
	WebElement qulaitydown;
	public Tc_Capro_Onlinestore(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void onlinestore(WebDriver driver) throws InterruptedException, IOException {
		
		online.click();
		Actions a=new Actions(driver);
		a.moveToElement(abcap).click().build().perform();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		online.click();
//		a.moveToElement(arjit).click().build().perform();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		online.click();
//		a.moveToElement(broncap).click().build().perform();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		online.click();
//		a.moveToElement(Lucatone).click().build().perform();
//upload.click();
//		
//		addtocard.click();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,10)","");
		
		buynow.click();
		ScreenShot.main(driver,"Tc_Capro_Onlinestore");
		Qulaityincr.click();
		qulaitydown.click();

	}

}
